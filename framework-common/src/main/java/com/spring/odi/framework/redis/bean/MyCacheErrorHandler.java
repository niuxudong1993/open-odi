package com.spring.odi.framework.redis.bean;

import org.springframework.cache.Cache;
import org.springframework.cache.interceptor.SimpleCacheErrorHandler;

public class MyCacheErrorHandler extends SimpleCacheErrorHandler {
    @Override
    public void handleCacheGetError(RuntimeException e, Cache cache, Object o) {
        super.handleCacheGetError(e, cache, o);
    }

    @Override
    public void handleCachePutError(RuntimeException e, Cache cache, Object o, Object o1) {
        super.handleCachePutError(e, cache, o, o);
    }

    @Override
    public void handleCacheEvictError(RuntimeException e, Cache cache, Object o) {
        super.handleCacheEvictError(e, cache, o);
    }

    @Override
    public void handleCacheClearError(RuntimeException e, Cache cache) {
        super.handleCacheClearError(e, cache);
    }
}
