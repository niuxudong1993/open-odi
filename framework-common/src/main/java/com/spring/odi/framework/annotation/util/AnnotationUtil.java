package com.spring.odi.framework.annotation.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

public class AnnotationUtil {
    public static Object getAnnotationValue(Annotation annotation, String property) {
        return null;
    }

    /**
     * 功能描述: <br>
     * 获取注解属性
     * @param object
     * @param property
     * @return:java.lang.Object
     * @Date: 2019/7/13 9:52
     **/
    public static <T> Object getFieldValue(T object, String property) {
        return null;
    }

    public <T extends Annotation> T getAnnotation(JoinPoint joinPoint,Class<T> clas) {
        T source = signature.getMethod().getDeclaringClass().getAnnotation(clas);
        return  source;
    }
}
