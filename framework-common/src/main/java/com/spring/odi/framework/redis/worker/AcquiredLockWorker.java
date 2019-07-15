package com.spring.odi.framework.redis.worker;

public interface AcquiredLockWorker<T> {
    T invokeAfterLockAcquired() throws Exception;
}