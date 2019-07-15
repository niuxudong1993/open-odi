package com.spring.odi.framework.queue.aspect;

import com.spring.odi.framework.queue.proxy.ProxyFactory;
import com.spring.odi.framework.queue.service.ODICallBackService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-1)
@Aspect
public class QueueEventAOP {
    private final ProxyFactory factory = new ProxyFactory(null);
    @Pointcut(value = "@annotation(com.spring.odi.framework.queue.annotation.QueueEvent)")
    protected void callBack() {
    }
    @Around("callBack()")
    public void around(JoinPoint joinPoint) throws Throwable {
        /*@description 代理调用队列防止分布式系统中出现方法不同步问题 增加手动开启事务*/
    }
}