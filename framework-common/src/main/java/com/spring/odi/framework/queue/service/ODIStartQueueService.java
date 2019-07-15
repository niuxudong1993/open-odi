package com.spring.odi.framework.queue.service;


import com.spring.odi.framework.queue.bean.ODISemaphore;
import com.spring.odi.framework.queue.queue.BaseConcurrentQueue;

import java.util.concurrent.Semaphore;

public interface ODIStartQueueService {
    /**
     * 功能描述: <br>
     * 线程同步
     * @param queue
     * @param callBackService
     * @return:void
     **/
    <I extends BaseConcurrentQueue>void synchronousEvent(I queue, ODICallBackService callBackService);

    /**
     * 功能描述: <br>
     * 开启事件
     * @param queue
     * @param callBackService
     * @return:void
     **/
    <I extends BaseConcurrentQueue>void startEvent(I queue, ODICallBackService callBackService);

    /**
     * 功能描述: <br>
     * 线程同步许可认证
     * @param queue
     * @param callBackService
     * @param semaphore
     * @return:void
     **/
    <I extends BaseConcurrentQueue>void synchronousEvent(I queue, ODICallBackService callBackService, ODISemaphore semaphore);

    /**
     * 功能描述: <br>
     * 开启事件许可认证
     * @param queue
     * @param callBackService
     * @return:void
     **/
    <I extends BaseConcurrentQueue>void startEvent(I queue, ODICallBackService callBackService, ODISemaphore semaphore);
}
