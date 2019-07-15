package com.spring.odi.framework;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.spring.odi.framework.annotation.ODIMapperScan;
import com.spring.odi.framework.filter.LoginFilter;
import org.apache.catalina.startup.Catalina;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, MybatisAutoConfiguration.class, DruidDataSourceAutoConfigure.class, XADataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.spring.odi.framework.*"})
@EnableDiscoveryClient
@EnableAsync
@EnableConfigurationProperties
@EnableFeignClients(basePackages = {"com.spring.odi.*"})
@ODIMapperScan(basePackagesPrefix = "mybatis.default", sqlSessionTemplateRef = "sqlSessionTemplate")
public class FrameworkApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkApplication.class, args);
    }
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }

    @Bean
    public FilterRegistrationBean filterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        List<Pattern> patterns = new ArrayList<Pattern>();
        patterns.add(Pattern.compile("/*"));
        List<Pattern> expatterns = new ArrayList<Pattern>();
        patterns.add(Pattern.compile("/open/*"));
        // 添加过滤器
        registration.setFilter(new LoginFilter(patterns,expatterns));
        // 设置过滤路径，/*所有路径
        registration.addUrlPatterns("/*");
        List<String> excudeUrl = new ArrayList<>();
        registration.setUrlPatterns(excudeUrl);
        // 设置优先级
        registration.setName("logInFilter");
        // 设置优先级
        registration.setOrder(2);
        return registration;
    }

}
