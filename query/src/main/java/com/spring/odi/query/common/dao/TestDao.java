package com.spring.odi.query.common.dao;

import org.apache.ibatis.annotations.Param;

public interface TestDao {
    int testMethod(@Param(value = "test") String test11);

    int testQueue(@Param(value = "test") String test11);

    String selectQueue();
}
