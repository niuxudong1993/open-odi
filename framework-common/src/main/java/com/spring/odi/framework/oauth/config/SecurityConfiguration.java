package com.spring.odi.framework.oauth.config;

import com.spring.odi.framework.oauth.encoder.NoEncryptPasswordEncoder;
import com.spring.odi.framework.oauth.handler.ODILoginAuthenticationFailureHandler;
import com.spring.odi.framework.oauth.handler.ODILoginAuthenticationSuccessHandler;
import com.spring.odi.framework.oauth.provider.ODISSOAuthenticationProvider;
import com.spring.odi.framework.oauth.filter.ODISSOAuthenticationProcessingFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration
@EnableWebSecurity
@SuppressWarnings("unused")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
    public static String logoutUrl="/common/logout";
    public static String openUrl="/open/**";
    public static String loginUrlRequest = "/common/login";

    @Autowired
    private ODISSOAuthenticationProvider odissoAuthenticationProvider;

    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;

    @Autowired
    private ODILoginAuthenticationSuccessHandler successHandler;

    @Autowired
    private ODILoginAuthenticationFailureHandler failureHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()//处理登录
                .loginProcessingUrl(loginUrlRequest)
                .permitAll()
                .and()
                .authorizeRequests()//请求授权
                .antMatchers("/file/download","/file/upload","/static/**",openUrl).permitAll()//开放接口与前端资源可以直接访问
                .anyRequest().authenticated()
                .and()
                .csrf()
                .disable()
                .addFilterAt(odiSsoAuthenticationFilter(),UsernamePasswordAuthenticationFilter.class);
    }


    @Bean
    public ODISSOAuthenticationProcessingFilter odiSsoAuthenticationFilter() {
        ODISSOAuthenticationProcessingFilter filter = new ODISSOAuthenticationProcessingFilter();
        filter.setAuthenticationManager(authenticationManager);
        filter.setAuthenticationSuccessHandler(successHandler);
        filter.setAuthenticationFailureHandler(failureHandler);
        return filter;
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(this.odissoAuthenticationProvider);

    }

    @Bean
    public NoEncryptPasswordEncoder get() {
        return new NoEncryptPasswordEncoder();
    }


}