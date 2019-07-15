package com.spring.odi.framework.oauth.provider;

import com.spring.odi.framework.oauth.bean.PortalUserInfoObjBean;
import com.spring.odi.framework.oauth.bean.SsoUserAccountInfo;
import com.spring.odi.framework.oauth.service.UserDetailService;
import com.spring.odi.framework.oauth.token.ODISSOAuthenticationToken;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Component
public class ODISSOAuthenticationProvider implements AuthenticationProvider {

    private Logger logger= LoggerFactory.getLogger(ODISSOAuthenticationProvider.class);
    @Autowired
    private UserDetailService userService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        logger.info(this.getClass().getName() + "---supports");
        return (ODISSOAuthenticationToken.class.isAssignableFrom(authentication));
    }

    /**
     * 后续权限控制
     * @param username
     * @return
     */
    private PortalUserInfoObjBean listUserGrantedAuthorities(String username) {
        return null;
    }

}