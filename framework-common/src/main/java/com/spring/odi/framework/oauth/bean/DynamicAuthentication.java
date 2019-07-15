package com.spring.odi.framework.oauth.bean;
//
//import org.springframework.security.authentication.AbstractAuthenticationToken;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
//
//import java.util.List;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.ConcurrentMap;
//
//public class DynamicAuthentication<SuccessHandler extends SimpleUrlAuthenticationSuccessHandler,UserDetail extends UserDetailsService,Provider extends AuthenticationProvider,FailHandler extends SimpleUrlAuthenticationFailureHandler,Token extends AbstractAuthenticationToken> {
//    private String sessionId;
//    private String sessionType;
//    private String username;
//    private Token authenticationToken;
//    private SuccessHandler authenticationSuccessHandler;
//    private FailHandler authenticationFailHandler;
//    private Provider authenticationProvider;
//    private UserDetail userDetailsService;
//    private ThreadLocal contextHolder = new ThreadLocal<>();
//    private List<String> authenticationType;
//    private ConcurrentMap<String,UserDetail> userDetailsServices = new ConcurrentHashMap<>();
//    private ConcurrentMap<String,Provider> authenticationProviders = new ConcurrentHashMap<>();
//    private ConcurrentMap<String,SuccessHandler> authenticationSuccessHandlers = new ConcurrentHashMap<>();
//    private ConcurrentMap<String,FailHandler> authenticationFailureHandlers = new ConcurrentHashMap<>();
//    private ConcurrentMap<String,Token> authenticationTokens = new ConcurrentHashMap<>();
//
//
//    public String getSessionId() {
//        return sessionId;
//    }
//
//    public void setSessionId(String sessionId) {
//        this.sessionId = sessionId;
//    }
//
//    public String getSessionType() {
//        return sessionType;
//    }
//
//    public void setSessionType(String sessionType) {
//        this.sessionType = sessionType;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public Token getAuthenticationToken() {
//        return authenticationToken;
//    }
//
//    public void setAuthenticationToken(Token authenticationToken) {
//        this.authenticationToken = authenticationToken;
//    }
//
//    public SuccessHandler getAuthenticationSuccessHandler() {
//        return authenticationSuccessHandler;
//    }
//
//    public void setAuthenticationSuccessHandler(SuccessHandler authenticationSuccessHandler) {
//        this.authenticationSuccessHandler = authenticationSuccessHandler;
//    }
//
//    public FailHandler getAuthenticationFailHandler() {
//        return authenticationFailHandler;
//    }
//
//    public void setAuthenticationFailHandler(FailHandler authenticationFailHandler) {
//        this.authenticationFailHandler = authenticationFailHandler;
//    }
//
//    public Provider getAuthenticationProvider() {
//        return authenticationProvider;
//    }
//
//    public void setAuthenticationProvider(Provider authenticationProvider) {
//        this.authenticationProvider = authenticationProvider;
//    }
//
//    public UserDetail getUserDetailsService() {
//        return userDetailsService;
//    }
//
//    public void setUserDetailsService(UserDetail userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    public ThreadLocal getContextHolder() {
//        return contextHolder;
//    }
//
//    public void setContextHolder(ThreadLocal contextHolder) {
//        this.contextHolder = contextHolder;
//    }
//
//    public ConcurrentMap<String, UserDetail> getUserDetailsServices() {
//        return userDetailsServices;
//    }
//
//    public void setUserDetailsServices(ConcurrentMap<String, UserDetail> userDetailsServices) {
//        this.userDetailsServices = userDetailsServices;
//    }
//
//    public ConcurrentMap<String, Provider> getAuthenticationProviders() {
//        return authenticationProviders;
//    }
//
//    public void setAuthenticationProviders(ConcurrentMap<String, Provider> authenticationProviders) {
//        this.authenticationProviders = authenticationProviders;
//    }
//
//    public ConcurrentMap<String, SuccessHandler> getAuthenticationSuccessHandlers() {
//        return authenticationSuccessHandlers;
//    }
//
//    public void setAuthenticationSuccessHandlers(ConcurrentMap<String, SuccessHandler> authenticationSuccessHandlers) {
//        this.authenticationSuccessHandlers = authenticationSuccessHandlers;
//    }
//
//    public ConcurrentMap<String, FailHandler> getAuthenticationFailureHandlers() {
//        return authenticationFailureHandlers;
//    }
//
//    public void setAuthenticationFailureHandlers(ConcurrentMap<String, FailHandler> authenticationFailureHandlers) {
//        this.authenticationFailureHandlers = authenticationFailureHandlers;
//    }
//
//    public ConcurrentMap<String, Token> getAuthenticationTokens() {
//        return authenticationTokens;
//    }
//
//    public void setAuthenticationTokens(ConcurrentMap<String, Token> authenticationTokens) {
//        this.authenticationTokens = authenticationTokens;
//    }
//
//}
