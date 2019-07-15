package com.spring.odi.framework.datasource.registrar;

import com.alibaba.druid.pool.xa.DruidXADataSource;
import com.spring.odi.framework.annotation.RegistrarDB;
import com.spring.odi.framework.annotation.util.AnnotationUtil;
import com.spring.odi.framework.common.util.SpringContextUtils;
import com.spring.odi.framework.datasource.bean.CustomSqlSessionTemplate;
import com.spring.odi.framework.datasource.bean.DbContextHolder;
import com.spring.odi.framework.datasource.config.DruidConfig;
import com.spring.odi.framework.datasource.bean.DynamicDataSource;
import com.spring.odi.framework.lock.DistributedLockHandler;
import com.spring.odi.framework.util.PropertiesUtil;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 动态数据源注册;
 */
@Component
public class DynamicDataSourceRegister   {
    //mapper模式下的接口层

    //对接数据库的实体层

    //如配置文件中未指定数据源类型，使用该默认值
 
    // 默认数据源



    /**
     * 初始化更多数据源
     */
    private void initCustomDataSources(ApplicationContext context) {

    }
    public void createSqlSessionTemplate(ConcurrentHashMap<Object,SqlSessionFactory> sqlSessionFactoryMap,ApplicationContext context) throws Exception {

    }
    /**
     * 创建数据源
     * @param dataSource
     * @return
     */
    private SqlSessionFactory createSqlSessionFactory(AtomikosDataSourceBean dataSource,String prefix) throws Exception{
        return null;
    }
    /**
     * 构建数据源
     * @param obj
     * @param prefix
     * @return
     */
    private AtomikosDataSourceBean buildDataSource(Object obj,String prefix) {

        return null;
    }
    public void registerBeanDefinitions(DruidConfig druidConfig, String prefix) {

    }
    public DynamicDataSource registerBeanDefinition() {

        return null;
    }
    public DynamicDataSource registerBeanDefinitions(ApplicationContext applicationContext) {

        return registerBeanDefinition();
    }
}
