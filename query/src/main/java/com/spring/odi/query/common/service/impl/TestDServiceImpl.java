package com.spring.odi.query.common.service.impl;

import com.spring.odi.framework.datasource.bean.CustomSqlSessionTemplate;
import com.spring.odi.framework.exception.ServiceException;
import com.spring.odi.framework.queue.annotation.QueueEvent;
import com.spring.odi.framework.queue.service.ODICallBackService;
import com.spring.odi.query.common.dao.TestDao;
import com.spring.odi.query.remote.common.service.TestService3;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.NotSupportedException;
import javax.transaction.SystemException;

import static org.mybatis.spring.SqlSessionUtils.getSqlSession;

@Service
@RestController
@Transactional(transactionManager="transactionManager")
public class TestDServiceImpl implements TestService3, ODICallBackService {
    @Autowired
    private TestDao dao;
    @Autowired
    private CustomSqlSessionTemplate template;

    @Override
    public void testFeignMethod() {
        dao.testMethod("a");
    }

    @Override
    @QueueEvent
    public void testFeignQueue(@RequestBody String object) {
        callBack(object);
    }


    @Override
    @Transactional(rollbackFor=ServiceException.class)
    public void callBack(Object object) {
        long time = System.currentTimeMillis();
        long time1 = System.currentTimeMillis();
        while((time1 - time)< 5000) {
            time1= System.currentTimeMillis();
        }
        String queue = dao.selectQueue();
        dao.testQueue((String)object);
        if (((String) object).contains("14")) {
            System.out.println("报错"+"更新前："+queue+";更新后："+dao.selectQueue()+";更新值："+object);
            throw new ServiceException("报错test");
        } else {
            System.out.println("更新前："+queue+";更新后："+dao.selectQueue()+";更新值："+object);
        }

    }

}
