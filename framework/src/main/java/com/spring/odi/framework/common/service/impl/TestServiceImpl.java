package com.spring.odi.framework.common.service.impl;

import com.spring.odi.framework.annotation.TargetDataSource;
import com.spring.odi.framework.common.dao.TestDao;
import com.spring.odi.framework.common.service.TestDService;
import com.spring.odi.framework.remote.common.service.TestService;
import com.spring.odi.framework.exception.ServiceException;
import com.spring.odi.query.remote.common.service.TestService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

@Service
@TargetDataSource(value = "test")
@Transactional(transactionManager="transactionManager")
@RestController
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao dao;
    @Autowired
    private TestService3 testService3;

    @Override
    public void test(){
        dao.testMethod("a");
        testService3.testFeignMethod();
    }
}
