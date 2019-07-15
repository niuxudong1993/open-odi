package com.spring.odi.query.common.service;


import com.spring.odi.query.common.bean.BaseQueryBean;
import com.spring.odi.query.common.bean.QueryBean;
import com.spring.odi.query.common.bean.QueryConditionBean;
import com.spring.odi.query.common.bean.QueryPageBase;
import com.spring.odi.query.common.lisenter.SqlParamListener;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public interface QueryService {
    /**
     * 功能描述: <br>
     * 根据map参数分页查询
     * @param bean
     * @return:java.util.List<java.util.LinkedHashMap<java.lang.String,java.lang.Object>>
     **/
    List<LinkedHashMap<String,Object>> queryListByPage( ConcurrentHashMap<String, Object> bean);

    /**
     * 功能描述: <br>
     * 根据map参数获取总记录数
     * @param bean
     * @return:java.lang.Integer
     **/
    Integer queryListForCounts( ConcurrentHashMap<String, Object> bean);

    /**
     * 功能描述: <br>
     * 根据map参数不分页查询
     * @param bean
     * @return:java.util.List<java.util.LinkedHashMap<java.lang.String,java.lang.Object>>
     **/
    List<LinkedHashMap<String,Object>> queryList( ConcurrentHashMap<String, Object> bean);

    /**
     * 功能描述: <br>
     * 模板配置查询
     * @param bean
     * @return:com.spring.odi.query.common.bean.QueryPageBase
     **/
    QueryPageBase queryList(QueryBean bean);

    /**
     * 功能描述: <br>
     * 泛型类模板配置查询
     * @param bean
     * @return:java.util.List<java.util.LinkedHashMap<java.lang.String,java.lang.Object>>
     **/
    <Ext extends BaseQueryBean>List<LinkedHashMap<String,Object>> queryList(Ext bean);

    /**
     * 功能描述: <br>
     * 泛型类获取模板配置信息
     * @param bean
     * @return:java.util.List<java.util.LinkedHashMap<java.lang.String,java.lang.Object>>
     **/
    <Ext extends BaseQueryBean> ConcurrentHashMap<String,Object> getQueryBeanMap(Ext bean);

    /**
     * 功能描述: <br>
     * 泛型类获取模板配置信息
     * @param bean
     * @return:Ext
     **/
    <Ext extends BaseQueryBean>Ext getHandeledBean(Ext bean);

    /**
     * 功能描述: <br>
     * 泛型类依据页面参数获取模板配置信息
     * @param bean
     * @param code
     * @return:Ext
     **/
    <Ext extends BaseQueryBean>Ext getHandeledBean(QueryConditionBean bean,String code);

    /**
     * 功能描述: <br>
     * 泛型类依据页面参数获取模板配置信息
     * @param bean
     * @param code
     * @return:java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.Object>
     * @Date: 2019/7/13 10:55
     **/
    ConcurrentHashMap<String,Object> getQueryBeanMap(QueryConditionBean bean, String code);

    /**
     * 功能描述: <br>
     * 泛型类依据页面参数重复获取模板配置信息
     * @param bean
     * @param code
     * @param listener
     * @return:java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.Object>
     **/
    <Ext extends BaseQueryBean>ConcurrentHashMap<String,Object> getQueryBeanMap(QueryConditionBean bean, String code, SqlParamListener<Ext> listener);

    /**
     * 功能描述: <br>
     * 泛型类依据页面参数重复获取模板配置信息
     * @param bean
     * @param listener
     * @return:Ext
     **/
    <Ext extends BaseQueryBean>Ext getHandeledBean(Ext bean, SqlParamListener<Ext> listener);

}
