package com.spring.odi.framework.oauth.bean;

import com.spring.odi.framework.common.bean.PortalUserInfo;

public class PortalUserInfoBean  {
    private PortalUserInfo userInfo;
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public PortalUserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(PortalUserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
