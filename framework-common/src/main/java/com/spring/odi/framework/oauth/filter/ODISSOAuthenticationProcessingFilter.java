package com.spring.odi.framework.oauth.filter;

import com.spring.odi.framework.oauth.bean.PortalUserInfoBean;
import com.spring.odi.framework.oauth.config.SecurityConfiguration;
import com.spring.odi.framework.oauth.token.ODISSOAuthenticationToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ODISSOAuthenticationProcessingFilter extends AbstractAuthenticationProcessingFilter {

    private Logger logger = LoggerFactory.getLogger(ODISSOAuthenticationProcessingFilter.class);
    public static final String SPRING_SECURITY_FORM_ZT_TOKEN = "Token";
    private boolean postOnly = true;

    public ODISSOAuthenticationProcessingFilter() {

        super(new AntPathRequestMatcher(SecurityConfiguration.loginUrlRequest, "POST"));
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {
        return null;
    }


    protected String obtainToken(HttpServletRequest request) {
        return request.getParameter(SPRING_SECURITY_FORM_ZT_TOKEN);
    }

    protected void setDetails(HttpServletRequest request,
                              AbstractAuthenticationToken authRequest) {
        authRequest.setDetails(authenticationDetailsSource.buildDetails(request));
    }

}