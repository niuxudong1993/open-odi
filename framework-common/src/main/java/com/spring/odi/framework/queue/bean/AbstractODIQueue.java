package com.spring.odi.framework.queue.bean;

import com.spring.odi.framework.common.util.SpringContextUtils;
import com.spring.odi.framework.queue.queue.BaseQueue;
import com.spring.odi.framework.queue.service.ODICallBackService;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.util.AbstractQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 作者 27587
 * 描述 TODO
 * 创建时间 2019/7/1517:01
 **/
public abstract class AbstractODIQueue<Queue extends BaseQueue> {
    private ReentrantLock lock;
    private ODICallBackService callBackService;
    private ODISemaphore semaphore;
    private Queue queue;

    public AbstractODIQueue(ReentrantLock lock, ODICallBackService callBackService, ODISemaphore semaphore, Queue queue) {
        this.lock = lock;
        this.callBackService = callBackService;
        this.semaphore = semaphore;
        this.queue = queue;
    }

    void handelData(){


    }

}
