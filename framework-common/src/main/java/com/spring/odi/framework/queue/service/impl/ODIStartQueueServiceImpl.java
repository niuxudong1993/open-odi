package com.spring.odi.framework.queue.service.impl;

import com.spring.odi.framework.queue.bean.ODISemaphore;
import com.spring.odi.framework.queue.queue.BaseConcurrentQueue;
import com.spring.odi.framework.queue.service.ODICallBackService;
import com.spring.odi.framework.queue.service.ODIStartQueueService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 作者 27587
 * 描述 TODO
 * 创建时间 2019/7/1322:23
 **/
public class ODIStartQueueServiceImpl implements ODIStartQueueService {
    private ExecutorService executor = Executors.newFixedThreadPool(10);
    @Override
    public <I extends BaseConcurrentQueue> void synchronousEvent(I queue, ODICallBackService callBackService) {
        executor.submit(new Thread(()-> {
            startEvent(queue,callBackService);
        }));
    }

    @Override
    public <I extends BaseConcurrentQueue> void startEvent(I queue, ODICallBackService callBackService) {
        queue.executed(callBackService);
    }

    @Override
    public <I extends BaseConcurrentQueue> void synchronousEvent(I queue, ODICallBackService callBackService, ODISemaphore semaphore) {
        executor.submit(new Thread(()-> {
            startEvent(queue,callBackService,semaphore);
        }));
    }

    @Override
    public <I extends BaseConcurrentQueue> void startEvent(I queue, ODICallBackService callBackService, ODISemaphore semaphore) {
        queue.executed(callBackService,semaphore);
    }

}
