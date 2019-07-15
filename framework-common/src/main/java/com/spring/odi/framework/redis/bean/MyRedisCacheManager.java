package com.spring.odi.framework.redis.bean;


import org.springframework.cache.Cache;
import org.springframework.data.redis.cache.*;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyRedisCacheManager extends RedisCacheManager {
    private final org.springframework.data.redis.cache.RedisCacheWriter cacheWriter;
    private final RedisCacheConfiguration defaultCacheConfig;
    private final Map<String, RedisCacheConfiguration> initialCacheConfiguration;
    private final boolean allowInFlightCacheCreation;

    private MyRedisCacheManager(org.springframework.data.redis.cache.RedisCacheWriter cacheWriter, RedisCacheConfiguration defaultCacheConfiguration, boolean allowInFlightCacheCreation) {
        super(cacheWriter, defaultCacheConfiguration, allowInFlightCacheCreation);
        Assert.notNull(cacheWriter, "CacheWriter must not be null!");
        Assert.notNull(defaultCacheConfiguration, "DefaultCacheConfiguration must not be null!");
        this.cacheWriter = cacheWriter;
        this.defaultCacheConfig = defaultCacheConfiguration;
        this.initialCacheConfiguration = new LinkedHashMap();
        this.allowInFlightCacheCreation = allowInFlightCacheCreation;
    }

    public static MyRedisCacheManager createManager(RedisConnectionFactory connectionFactory) {
        return new MyRedisCacheManager(new DefaultRedisCacheWriter(connectionFactory), RedisCacheConfiguration.defaultCacheConfig(), true);
    }

    @Override
    protected RedisCache createRedisCache(String name, @Nullable RedisCacheConfiguration cacheConfig) {
        return new MyRedisCache(name, this.cacheWriter, cacheConfig != null ? cacheConfig : this.defaultCacheConfig);
    }

    @Override
    public Cache getCache(String cacheName) {
        return super.getCache(cacheName);
    }

}