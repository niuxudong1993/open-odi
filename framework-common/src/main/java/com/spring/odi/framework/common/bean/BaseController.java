package com.spring.odi.framework.common.bean;

import com.spring.odi.framework.lock.DistributedLockHandler;
import com.spring.odi.framework.lock.Lock;
import com.spring.odi.framework.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Arrays;

@Component
public abstract class BaseController {
    @Autowired
    DistributedLockHandler distributedLockHandler;
    protected Lock lock=new Lock("ODI:LOCK:FRAME:"+this.getModuleValue(),"ODI:LOCK:FRAME:"+this.getModuleValue());

    public abstract String getModuleValue();

    private ResponseApiBean getEmpty() {
        return new ResponseApiBean(LocalDateTime.now());
    }
    protected <T> ResponseApiBean<T> success(T t){
        return success(t,"");
    }
    protected <T> ResponseApiBean<T> success(T t,String message){
        ResponseApiBean<T> bean =getEmpty();
        bean.setObject(t);
        bean.setMessage(message);
        bean.setIsSuccess(true);
        return bean;
    }
    protected <T> ResponseApiBean<T> fail(T t){
        return fail(t,"");
    }
    protected <T> ResponseApiBean<T> fail(T t,String message){
        ResponseApiBean<T> bean =getEmpty();
        bean.setObject(t);
        bean.setMessage(message);
        bean.setIsSuccess(false);
        return bean;
    }
}
