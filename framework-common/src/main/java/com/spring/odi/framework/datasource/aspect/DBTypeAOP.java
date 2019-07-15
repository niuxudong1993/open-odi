package com.spring.odi.framework.datasource.aspect;

import com.spring.odi.framework.annotation.TargetDataSource;
import com.spring.odi.framework.annotation.util.AnnotationUtil;
import com.spring.odi.framework.datasource.bean.DbContextHolder;
import com.spring.odi.framework.util.ConstantUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-10)//保证该AOP在@Transactional之前执行
@Aspect
public class DBTypeAOP {

    @Pointcut(value = "execution(* com.spring.odi..*.service.*.*(..))")
    protected void dbType() {
    }
    @Before("dbType()")
    public void before(JoinPoint joinPoint) throws Throwable {
        //获取当前的指定的数据源;
        TargetDataSource source = getTargetDataSource(joinPoint);
        if (source == null) {
            DbContextHolder.setDbType(ConstantUtil.defalutDBPrefix);
            return;
        }
        String dsId = source.value();
        //如果不在我们注入的所有的数据源范围之内，那么输出警告信息，系统自动使用默认的数据源。
        if (!DbContextHolder.containsDataSource(dsId)) {
            System.err.println("数据源[{}]不存在，使用默认数据源 > {}"+source.value()+joinPoint.getSignature());
        } else {
            System.out.println("Use DataSource : {} > {}"+source.value()+joinPoint.getSignature());
            //找到的话，那么设置到动态数据源上下文中。
            DbContextHolder.setDbType(source.value());
        }
    }

    @After("dbType()")
    public void after(JoinPoint joinPoint) {
        TargetDataSource source = getTargetDataSource(joinPoint);
        if (source == null) {
            return;
        }
        System.out.println("Revert DataSource : {} > {}"+source.value()+joinPoint.getSignature());
        //方法执行完毕之后，销毁当前数据源信息，进行垃圾回收。
        DbContextHolder.clearDbType();
    }
    private TargetDataSource getTargetDataSource(JoinPoint joinPoint) {
        AnnotationUtil util = new AnnotationUtil();
        return  util.getAnnotation(joinPoint,TargetDataSource.class);
    }
}
