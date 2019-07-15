package com.spring.odi.framework.common.bean;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 通用返回对象
 *
 */
public class ResponseApiBean<T> implements Serializable {
    private String message;
    private T object;
    private String operateUser;
    private List<PortalUserInfo> test;
    private LocalDateTime responseBackTime;
    private String tokenId;
    private Boolean isSuccess;

    public ResponseApiBean(String message, T object) {
        this.message = message;
        this.object = object;
    }

    public ResponseApiBean() {
    }

    public ResponseApiBean(LocalDateTime responseBackTime) {
        this.responseBackTime = responseBackTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public LocalDateTime getResponseBackTime() {
        return responseBackTime;
    }

    public void setResponseBackTime(LocalDateTime responseBackTime) {
        this.responseBackTime = responseBackTime;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Boolean success) {
        isSuccess = success;
    }

    public List<PortalUserInfo> getTest() {
        return test;
    }

    public void setTest(List<PortalUserInfo> test) {
        this.test = test;
    }
}
