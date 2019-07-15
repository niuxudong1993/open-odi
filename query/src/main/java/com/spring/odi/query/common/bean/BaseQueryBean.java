package com.spring.odi.query.common.bean;

import com.spring.odi.query.common.po.TableView;
import com.spring.odi.query.common.po.Template;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class BaseQueryBean implements java.io.Serializable{
    private Template template ; //模板信息

    List<TableView> tableViews;

    List<TableConditionBean> tableConditions;

    private Object object;

    private boolean success; //能否成功查询

    private String message; //错误信息

    private Integer start; //分页数据 开始

    private Integer length; //分页数据 单页记录条数

    private Integer end; //分页数据 结束

    private QueryConditionBean queryConditionBean;

    private String bindSql; //待处理的sql

    private String companyCode;//当前公司信息

    private String loginUserName;//当前登录人

    private String isJsonData; //前台用到

    private TemplateParameter parameter;

    private ConcurrentHashMap<String, Object> parameterMap;

    private String version;//我的查询用到

    private String indentifier;//我的查询用到

    public Integer getEnd() {
        if (length == null) {
            return end;
        }
        end = start+length;
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public QueryConditionBean getQueryConditionBean() {
        return queryConditionBean;
    }

    public void setQueryConditionBean(QueryConditionBean queryConditionBean) {
        this.queryConditionBean = queryConditionBean;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public List<TableView> getTableViews() {
        return tableViews;
    }

    public void setTableViews(List<TableView> tableViews) {
        this.tableViews = tableViews;
    }

    public List<TableConditionBean> getTableConditions() {
        return tableConditions;
    }

    public void setTableConditions(List<TableConditionBean> tableConditions) {
        this.tableConditions = tableConditions;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCompanyCode() {
        companyCode = "";
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getLoginUserName() {
        loginUserName = "";
        return loginUserName;
    }

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public String getBindSql() {
        return bindSql;
    }

    public void setBindSql(String bindSql) {
        this.bindSql = bindSql;
    }

    public String getIsJsonData() {
        return isJsonData;
    }

    public void setIsJsonData(String isJsonData) {
        this.isJsonData = isJsonData;
    }

    public TemplateParameter getParameter() {
        return parameter;
    }

    public void setParameter(TemplateParameter parameter) {
        this.parameter = parameter;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getIndentifier() {
        return indentifier;
    }

    public void setIndentifier(String indentifier) {
        this.indentifier = indentifier;
    }

    public ConcurrentHashMap<String, Object> getParameterMap() {
        return parameterMap;
    }

    public void setParameterMap(ConcurrentHashMap<String, Object> parameterMap) {
        this.parameterMap = parameterMap;
    }
}
