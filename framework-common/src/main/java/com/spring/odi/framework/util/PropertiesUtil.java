package com.spring.odi.framework.util;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.Properties;

public class PropertiesUtil {

    private static Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);

    private static Properties props;
    //静态代码块>>普通代码块>>构造代码块
    static {
        String fileName = "application.properties";
        props = new Properties();
        try {
            //读取propertiesUtil类的配置
            //利用反射加载类信息，获取配置文件的文件流，并指点编码格式
            props.load(new InputStreamReader(new ClassPathResource(fileName).getInputStream(), StandardCharsets.UTF_8));
        } catch (IOException e) {
            logger.error("配置文件读取异常",e);
        }
    }
    public static String getProperty(String key){
        String value = props.getProperty(key.trim());
        if(StringUtils.isBlank(value)){
            return null;
        }
        props.propertyNames();
        return value.trim();

    }

    public static String getProperty(String key,String defaultValue){
        //提供默认值的方法，如果在配置文件中找不到对应的key,就返回参数中的默认值
        String value = props.getProperty(key.trim());
        if(StringUtils.isBlank(value)){
            value = defaultValue;
        }
        return value.trim();
    }
}