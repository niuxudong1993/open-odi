package com.spring.odi.framework.common.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface TestDDao {
    int testMethod(@Param(value = "test") String test11);
}
