package com.spring.odi.framework.queue.proxy;

import com.spring.odi.framework.queue.bean.ODILinkedBlockingQueue;
import com.spring.odi.framework.queue.queue.BaseConcurrentQueue;
import com.spring.odi.framework.queue.service.ODICallBackService;
import com.spring.odi.framework.queue.service.ODIStartQueueService;
import com.spring.odi.framework.queue.service.impl.ODIStartQueueServiceImpl;
import java.lang.reflect.Proxy;

public class ProxyFactory{
    private Object queue;
    //维护一个目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target=target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance(){
        return null;
    }
    private <Queue extends BaseConcurrentQueue> Queue getQueueByServiceMethodName(String name) {
        /*@description 加载模块队列 */
        return null;
    }
}