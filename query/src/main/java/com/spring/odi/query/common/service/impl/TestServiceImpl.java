package com.spring.odi.query.common.service.impl;

import com.spring.odi.query.common.dao.TestDao;
import com.spring.odi.query.common.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(transactionManager = "transactionManager")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao dao;
    @Override
    public void test() {
        dao.testMethod("");
    }
}
