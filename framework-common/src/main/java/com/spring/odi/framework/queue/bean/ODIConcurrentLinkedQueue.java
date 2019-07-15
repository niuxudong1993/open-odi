package com.spring.odi.framework.queue.bean;

import com.spring.odi.framework.common.util.SpringContextUtils;
import com.spring.odi.framework.queue.queue.BaseConcurrentQueue;
import com.spring.odi.framework.queue.service.ODICallBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.transaction.SystemException;
import java.util.AbstractQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 作者 27587
 * 描述 TODO
 * 创建时间 2019/7/1322:13
 **/
public class ODIConcurrentLinkedQueue<E> extends ConcurrentLinkedQueue<E> implements BaseConcurrentQueue<E> {
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void executed(ODICallBackService service) {
            executed(service,null);
    }

    @Override
    public  void executed(ODICallBackService callBackService, ODISemaphore semaphore) {
        executed(new CommonQueueHandeler(lock,callBackService,semaphore,this));
    }
    private <T extends AbstractODIQueue> void executed(T handeler) {
        handeler.handelData();
    }

    @Override
    public E take() throws InterruptedException {
        return this.poll();
    }
}
