package com.spring.odi.framework.oauth.encoder;

import org.springframework.security.crypto.password.PasswordEncoder;

public class NoEncryptPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return (String) charSequence;
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        //密码对比 密码对 true 反之 false
        //CharSequence 数据库中的密码
        //s 前台传入的密码
        return s.equals(charSequence);
    }
}