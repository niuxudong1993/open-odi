package com.spring.odi.query.remote.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "odi-query",path = "/odi-query")
public interface TestService3 {
    @RequestMapping(value = "/testFeign1")
    void testFeignMethod();

    @RequestMapping(value = "/testFeign2")
    void testFeignQueue(@RequestBody String object);
}
