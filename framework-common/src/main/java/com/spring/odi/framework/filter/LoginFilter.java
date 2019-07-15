package com.spring.odi.framework.filter;

import com.spring.odi.framework.common.bean.PortalUserInfo;
import com.spring.odi.framework.datasource.registrar.DynamicDataSourceRegister;
import com.spring.odi.framework.util.SetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

public class LoginFilter implements Filter {
    private List<Pattern> excludePatterns;
    private List<Pattern> includePatterns;
    private static final Logger logger = LoggerFactory.getLogger(LoginFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public LoginFilter(List<Pattern> excludePatterns, List<Pattern> includePatterns) {
        this.excludePatterns = excludePatterns;
        this.includePatterns = includePatterns;
    }

    public LoginFilter(List<Pattern> includePatterns) {
        this.includePatterns = includePatterns;
    }

    public LoginFilter() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        if (isMatch(req,includePatterns) && !isMatch(req,excludePatterns)) {

        }
        logger.info("请求地址："+req.getRequestURI());
        logger.info("session:"+req.getSession().getId());
        chain.doFilter(req,resp);
        return;
    }
    private Boolean isMatch(HttpServletRequest req,List<Pattern> patterns) {
        String path = req.getRequestURI();
        if (!SetUtil.isEmpty(patterns)) {
            for (Pattern pattern:patterns) {
                if (pattern.matcher(path).matches()) {
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public void destroy() {

    }
}