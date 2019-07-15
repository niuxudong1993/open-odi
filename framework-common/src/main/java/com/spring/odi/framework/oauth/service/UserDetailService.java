package com.spring.odi.framework.oauth.service;

import com.spring.odi.framework.oauth.bean.PortalUserInfoObjBean;
import com.spring.odi.framework.oauth.bean.SsoUserAccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userDetailService")
public class UserDetailService implements UserDetailsService {
    @Autowired
    private PasswordEncoder passwordEncode;

    public PortalUserInfoObjBean loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username=" + username);
        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
        list.add(new SimpleGrantedAuthority("ROLE_USER"));
        PortalUserInfoObjBean auth_user = new PortalUserInfoObjBean();
        auth_user.setUsername("aaaa");
        auth_user.setPassword(passwordEncode.encode("123"));
        return auth_user;
    }

    public PortalUserInfoObjBean getTokenByUsername(String username) throws UsernameNotFoundException {
        return loadUserByUsername(username);
    }

    public SsoUserAccountInfo getUserInfoBySSO(String token) throws UsernameNotFoundException {
        return null;
    }

}