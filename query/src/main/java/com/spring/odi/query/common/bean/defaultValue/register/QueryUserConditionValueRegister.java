package com.spring.odi.query.common.bean.defaultValue.register;

import com.spring.odi.framework.annotation.RegistrarDB;
import com.spring.odi.framework.annotation.util.AnnotationUtil;
import com.spring.odi.framework.common.util.SpringContextUtils;
import com.spring.odi.framework.util.ConstantUtil;
import com.spring.odi.query.common.annotation.QueryConditionValue;
import com.spring.odi.query.common.bean.defaultValue.AbstractConditionValue;
import com.spring.odi.query.common.bean.defaultValue.BaseConditionValue;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class QueryUserConditionValueRegister {
    @Bean
    public BaseConditionValue DynamicDataSourceRegister(ApplicationContext context) {
        return null;
    }
}
