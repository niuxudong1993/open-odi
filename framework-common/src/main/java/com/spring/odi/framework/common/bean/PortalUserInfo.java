package com.spring.odi.framework.common.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class PortalUserInfo implements Serializable {
    private String username;
    private String realName;
    private String group;
    private String companyCode;
    private PortalDepartmentInfo departmentInfo;
    private List<PortalMenuInfo> menuInfo;
    private List<PortalRoleInfo> roleInfo;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public PortalDepartmentInfo getDepartmentInfo() {
        return departmentInfo;
    }

    public void setDepartmentInfo(PortalDepartmentInfo departmentInfo) {
        this.departmentInfo = departmentInfo;
    }

    public List<PortalMenuInfo> getMenuInfo() {
        return menuInfo;
    }

    public void setMenuInfo(List<PortalMenuInfo> menuInfo) {
        this.menuInfo = menuInfo;
    }

    public List<PortalRoleInfo> getRoleInfo() {
        return roleInfo;
    }

    public void setRoleInfo(List<PortalRoleInfo> roleInfo) {
        this.roleInfo = roleInfo;
    }

    public LocalDateTime getDate() {
        return date;
    }


    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
