package com.spring.odi.framework.redis.bean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;


public class MyRedisTemplate extends RedisTemplate {
    public MyRedisTemplate() {

    }

    public void setConnectionFactory(RedisConnectionFactory connectionFactory) {
        super.setConnectionFactory(connectionFactory);
    }
}