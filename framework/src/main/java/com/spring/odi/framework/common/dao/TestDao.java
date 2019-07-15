package com.spring.odi.framework.common.dao;

import com.spring.odi.framework.annotation.TargetDataSource;
import com.spring.odi.framework.common.bean.ResponseApiBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface TestDao {
    int testMethod(@Param(value = "test") String test11);
}
