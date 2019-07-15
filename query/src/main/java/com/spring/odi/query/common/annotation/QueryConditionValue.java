package com.spring.odi.query.common.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface QueryConditionValue {
    boolean isStartInit();
    Class returnType();
    String name();
}
