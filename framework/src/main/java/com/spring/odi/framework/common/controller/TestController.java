package com.spring.odi.framework.common.controller;

import com.spring.odi.framework.common.bean.BaseController;
import com.spring.odi.framework.common.bean.ResponseApiBean;
import com.spring.odi.framework.remote.common.service.TestService;
import com.spring.odi.framework.redis.bean.RedisCacheWriter;
import com.spring.odi.query.remote.common.service.TestService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/frameWork")
public class TestController extends BaseController {
    private AtomicInteger integer = new AtomicInteger(100);
    @Autowired
    private RedisCacheWriter redisUtil;
    @Autowired
    private TestService service;
    @Autowired
    private TestService3 queryService;
    @RequestMapping(value = "/test")
    public @ResponseBody ResponseApiBean test() {
        queryService.testFeignQueue("a"+integer.getAndAdd(1));
        return null;
    }

    public @ResponseBody ResponseApiBean test1(String a) {

        return success(a);
    }
    @Override
    public String getModuleValue() {
        return "TEST";
    }
}
