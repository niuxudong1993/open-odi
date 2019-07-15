package com.spring.odi.query.common.service.impl;


import com.spring.odi.framework.common.util.SpringContextUtils;
import com.spring.odi.query.common.bean.*;
import com.spring.odi.query.common.bean.dataField.AbstractFieldType;
import com.spring.odi.query.common.bean.dataField.HandelFieldType;
import com.spring.odi.query.common.dao.QueryDao;
import com.spring.odi.query.common.lisenter.SqlParamListener;
import com.spring.odi.query.common.po.ColumnFilter;
import com.spring.odi.query.common.po.TableView;
import com.spring.odi.query.common.po.Template;
import com.spring.odi.query.common.service.QueryService;
import com.spring.odi.framework.util.SetUtil;
import com.spring.odi.query.common.service.QueryTemplateService;
import com.spring.odi.query.common.util.SqlConstants;
import com.spring.odi.framework.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.Query;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
@Service
@Transactional(transactionManager="transactionManager")
public class QueryServiceImpl implements QueryService {
    private final static String ORDER_BY=	"ORDER BY";
    private final static String ORDER_STATUS=	"normal";
    @Autowired
    private QueryDao dao;
    @Autowired
    private QueryTemplateService queryTemplateService;

    @Override
    public List<LinkedHashMap<String, Object>> queryListByPage(ConcurrentHashMap<String, Object> bean) {
        return dao.selectListByPage(bean);
    }

    @Override
    public Integer queryListForCounts(ConcurrentHashMap<String, Object> bean) {
        return dao.selectListCount(bean);
    }

    @Override
    public List<LinkedHashMap<String, Object>> queryList(ConcurrentHashMap<String, Object> bean) {
        return dao.selectList(bean);
    }

    @Override
    public QueryPageBase queryList(QueryBean querys) {
        return null;
    }

    @Override
    public <Ext extends BaseQueryBean> List<LinkedHashMap<String, Object>> queryList(Ext bean) {
        return dao.selectList(getQueryBeanMap(bean));
    }
    @Override
    public <Ext extends BaseQueryBean>ConcurrentHashMap<String, Object> getQueryBeanMap(Ext querys) {
        return null;
    }

    @Override
    public <Ext extends BaseQueryBean>Ext getHandeledBean(Ext querys) {
        return  getHandeledBean(querys,null);
    }
    @Override
    public <Ext extends BaseQueryBean>Ext getHandeledBean(Ext querys,SqlParamListener<Ext> listener) {
        return null;
    }

    @Override
    public ConcurrentHashMap<String, Object> getQueryBeanMap(QueryConditionBean queryConditionBean,String code) {
        return getQueryBeanMap(queryConditionBean,code,null);
    }

    @Override
    public <Ext extends BaseQueryBean> Ext getHandeledBean(QueryConditionBean queryConditionBean, String code) {
        return null;
    }

    @Override
    public <Ext extends BaseQueryBean>ConcurrentHashMap<String,Object> getQueryBeanMap(QueryConditionBean queryConditionBean, String code, SqlParamListener<Ext> listener){
        return null;
    }

    /**
     * 处理模糊查询
     * @param querys
     * @return
     */
    public  <Ext extends BaseQueryBean>Ext hanlelQuickSearch(Ext querys,HandelFieldType fieldType) {
        return null;
    }
    /**
     * 添加tableView配置
     * @param list
     * @return
     */
    private List<String> addViewColumn (List<TableView> list) {
        return null;
    }
    /**
     * 根据QueryOpBean生成过滤条件
     * @param querys
     * @return
     */
    public <Ext extends BaseQueryBean>Ext handleQueryCondition(Ext querys,HandelFieldType fieldType) {
        return null;
    }
    /**
     * 处理where的过滤条件
     * @param querys
     * @return
     */
    public <Ext extends BaseQueryBean>Ext handleWhereCondition(Ext querys,HandelFieldType fieldType) {
        return null;
    }
    /**
     * 处理筛选
     * @param querys
     * @return
     */
    public <Ext extends BaseQueryBean>Ext hanleFilterData(Ext querys,HandelFieldType fieldType) {
        return null;
    }
    /**
     * 处理排序
     * @param querys
     * @return
     */
    public <Ext extends BaseQueryBean>Ext hanleSortedData(Ext querys,HandelFieldType fieldType) {
        return null;
    }
}
