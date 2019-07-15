package com.spring.odi.framework.common.controller;

import com.spring.odi.framework.common.bean.PortalMenuInfo;
import com.spring.odi.framework.common.bean.PortalUserInfo;
import com.spring.odi.framework.common.bean.ResponseApiBean;
import com.spring.odi.framework.oauth.bean.PortalUserInfoBean;
import com.spring.odi.framework.oauth.service.UserDetailService;
import com.spring.odi.framework.oauth.token.ODISSOAuthenticationToken;
import com.spring.odi.framework.redis.bean.RedisCacheWriter;
import com.spring.odi.framework.remote.common.service.TestService;
import com.spring.odi.query.remote.common.service.TestService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/common")
public class CommonController {
    @Autowired
    private RedisCacheWriter redisUtil;
    @Autowired
    private TestService service;
    @Autowired
    private TestService3 testService;
    @Autowired
    private UserDetailService detailService;
    @Autowired
    private AuthenticationManager manager;

    @RequestMapping(value = "/login")
    public @ResponseBody  ResponseApiBean login(HttpServletRequest request, @RequestBody PortalUserInfo infos) {

        return null;
    }
    @RequestMapping(value = "/logout")
    public ResponseApiBean logout(HttpServletRequest request) {

        return null;
    }

}
