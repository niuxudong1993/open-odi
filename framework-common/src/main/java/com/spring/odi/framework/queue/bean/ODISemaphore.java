package com.spring.odi.framework.queue.bean;

import java.util.concurrent.Semaphore;

/**
 * 作者 27587
 * 描述 TODO
 * 创建时间 2019/7/1322:14
 **/
public class ODISemaphore extends Semaphore {
    public ODISemaphore(int permits) {
        super(permits);
    }

    public ODISemaphore(int permits, boolean fair) {
        super(permits, fair);
    }
}
