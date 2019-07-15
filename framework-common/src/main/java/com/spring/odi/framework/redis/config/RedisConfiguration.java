package com.spring.odi.framework.redis.config;

import com.spring.odi.framework.redis.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;


import java.time.Duration;

@Configuration
public class RedisConfiguration {
    @Autowired
    private RedisConfig redisConfig;

    @Bean(name = "jedisConnectionFactory")
    public JedisConnectionFactory convertJedisConnectionFactory() {
        /*@description 创建redis连接 */
        return null;
    }

    @Bean
    public MyRedisTemplate redisTemplate() {
        MyRedisTemplate myRedisTemplate = new MyRedisTemplate();
        myRedisTemplate.setConnectionFactory(convertJedisConnectionFactory());
        return myRedisTemplate;
    }

    @Bean
    public RedisCacheWriter getRedisCacheWriter() {
        RedisCacheWriter myRedisTemplate = new RedisCacheWriter();
        return myRedisTemplate;
    }

    @Bean
    public MyRedisCacheManager redisCacheManager() {
        MyRedisCacheManager myRedisCacheManager = MyRedisCacheManager.createManager(convertJedisConnectionFactory());
        return myRedisCacheManager;
    }

    @Bean
    public CacheErrorHandler cacheErrorHandler() {
        MyCacheErrorHandler myCacheErrorHandler = new MyCacheErrorHandler();
        return myCacheErrorHandler;
    }

    @Bean
    KeyGenerator keyGenerator() {
        MyKeyGenerator myKeyGenerator = new MyKeyGenerator();
        return myKeyGenerator;
    }
}
