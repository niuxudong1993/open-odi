package com.spring.odi.framework.redis.bean;

import org.springframework.cache.interceptor.SimpleKeyGenerator;

import java.lang.reflect.Method;

public class MyKeyGenerator extends SimpleKeyGenerator {
    @Override
    public Object generate(Object o, Method method, Object... objects) {
        return super.generate(o, method, objects);
    }
}
