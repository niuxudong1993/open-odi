package com.spring.odi.framework.common.service.impl;

import com.spring.odi.framework.annotation.TargetDataSource;
import com.spring.odi.framework.common.dao.TestDDao;
import com.spring.odi.framework.common.service.TestDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(transactionManager="transactionManager")
public class TestDServiceImpl implements TestDService {
    @Autowired
    private TestDDao dDao;
    @Override
    public void testFeignMethod() {
        dDao.testMethod("a");
    }
}
