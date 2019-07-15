package com.spring.odi.query.common.service;


import com.spring.odi.query.common.bean.BaseQueryBean;
import com.spring.odi.query.common.bean.QueryBean;
import com.spring.odi.query.common.bean.TemplateObjBean;
import com.spring.odi.query.common.bean.dataField.HandelFieldType;

public interface TemplateParseService {
    /**
     * 功能描述: <br>
     * 根据原生sql获取解析对象
     * @param sql
     * @return:com.spring.odi.query.common.bean.TemplateObjBean
     * @Date: 2019/7/13 11:03
     **/
    TemplateObjBean parseSql(String sql);

    /**
     * 功能描述: <br>
     * 根据模板配置获取处理后的对象
     * @param bean
     * @param fieldType
     * @return:Ext
     * @Date: 2019/7/13 11:03
     **/
    <Ext extends BaseQueryBean> Ext parseSql(Ext bean, HandelFieldType fieldType);

    /**
     * 功能描述: <br>
     * 根据原生sql获取解析对象支持预览查询
     * @param sql
     * @param isPreview
     * @return:com.spring.odi.query.common.bean.TemplateObjBean
     * @Date: 2019/7/13 11:03
     **/
    TemplateObjBean parseSql(String sql, Boolean isPreview);
}