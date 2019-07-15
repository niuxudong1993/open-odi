package com.spring.odi.framework.queue.bean;

import com.spring.odi.framework.queue.queue.BaseQueue;
import com.spring.odi.framework.queue.service.ODICallBackService;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 作者 27587
 * 描述 TODO
 * 创建时间 2019/7/1517:08
 **/
public class CommonQueueHandeler extends AbstractODIQueue {
    public CommonQueueHandeler(ReentrantLock lock, ODICallBackService callBackService, ODISemaphore semaphore, BaseQueue queue) {
        super(lock, callBackService, semaphore, queue);
    }
}
