package com.spring.odi.framework.common.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

public interface TestDService {
    void testFeignMethod();
}
