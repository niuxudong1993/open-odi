package com.spring.odi.framework.queue.queue;

import com.spring.odi.framework.queue.bean.AbstractODIQueue;
import com.spring.odi.framework.queue.bean.ODISemaphore;
import com.spring.odi.framework.queue.service.ODICallBackService;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * 作者 27587
 * 描述 TODO
 * 创建时间 2019/7/1322:28
 **/
public interface BaseConcurrentQueue<E> extends BaseQueue<E>{
    /**
     * 功能描述: <br>
     * 队列执行回调方法
     * @param callBackService
     * @return:void
     **/
    void executed(ODICallBackService callBackService);

    /**
     * 功能描述: <br>
     * 队列执行回调方法许可认证
     * @param callBackService
     * @return:void
     **/
    <T extends AbstractODIQueue>void executed(ODICallBackService callBackService, ODISemaphore semaphore);
}
