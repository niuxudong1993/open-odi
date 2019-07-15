package com.spring.odi.framework.remote.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "odi-framework",path = "/odi-framework")
public interface TestService {
    @RequestMapping(value = "/testwork")
    void test() throws Exception;
}
