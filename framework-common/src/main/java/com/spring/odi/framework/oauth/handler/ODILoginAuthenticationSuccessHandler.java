package com.spring.odi.framework.oauth.handler;

import com.spring.odi.framework.oauth.bean.PortalUserInfoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@SuppressWarnings("unused")
public class ODILoginAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler{
    private Logger logger= LoggerFactory.getLogger(ODILoginAuthenticationSuccessHandler.class);
    private String commonDomain;
    private RequestCache requestCache = new HttpSessionRequestCache();

    public ODILoginAuthenticationSuccessHandler() {
        super();
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws ServletException, IOException {
        logger.info("登录用户服务成功");
        super.onAuthenticationSuccess(request, response, authentication);
    }
}