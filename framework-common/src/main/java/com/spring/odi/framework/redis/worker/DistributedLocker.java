package com.spring.odi.framework.redis.worker;

import com.spring.odi.framework.redis.exception.UnableToAquireLockException;
import org.redisson.*;

public interface DistributedLocker {

    /**
     * 获取锁
     *
     * @param resourceName 锁的名称
     * @param worker       获取锁后的处理类
     * @param <T>
     * @return 处理完具体的业务逻辑要返回的数据
     * @throws UnableToAquireLockException
     * @throws Exception
     */
    <T> T lock(String resourceName, AcquiredLockWorker<T> worker) throws UnableToAquireLockException, Exception;

    <T> T lock(String resourceName, AcquiredLockWorker<T> worker, int lockTime) throws Exception;

}