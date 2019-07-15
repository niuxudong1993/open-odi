package com.spring.odi.query.common.lisenter;


import com.spring.odi.query.common.bean.BaseQueryBean;
import com.spring.odi.query.common.bean.CommonTableConditionBean;
import com.spring.odi.query.common.bean.QueryBean;
import com.spring.odi.query.common.util.SqlConstants;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class SqlParamListener<Ext extends BaseQueryBean> {
    private Ext bean;
    private AtomicInteger atomicIndex;
    private ConcurrentHashMap<String, Object> templateMap;
    private static final String DEFAULT_NAME = "param";
    public Integer getIndex() {
        Integer index = atomicIndex.getAndAdd(1);
        return index;
    }
    public String getKeyRandomName(String name) {
        return null;
    }
    public String getKeyRandomName() {
        return null;
    }
    public String setParam(Object param,String type,String name) {
        return null;
    }
    public String setParam(Object param) {
        return null;
    }
    public SqlParamListener(Ext bean) {
        this.bean = bean;
        templateMap = new ConcurrentHashMap<String, Object>();
        atomicIndex = new AtomicInteger(0);
    }
    public <T extends CommonTableConditionBean> String setParam(T bean) {
        return null;
    }

    public ConcurrentHashMap<String, Object> getTemplateMap() {
        return templateMap;
    }

    public void setTemplateMap(ConcurrentHashMap<String, Object> templateMap) {
        this.templateMap = templateMap;
    }

}
