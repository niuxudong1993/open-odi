package com.spring.odi.framework.datasource;

import com.spring.odi.framework.annotation.RegistrarDB;
import com.spring.odi.framework.datasource.config.DruidConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@RegistrarDB(prefix = "test")
@ConfigurationProperties(prefix = "spring.datasource.test")
public class TestDruidConfig extends DruidConfig {

}
