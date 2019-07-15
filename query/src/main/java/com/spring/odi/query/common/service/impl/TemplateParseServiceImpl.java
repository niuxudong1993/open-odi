package com.spring.odi.query.common.service.impl;


import com.spring.odi.framework.common.util.SpringContextUtils;
import com.spring.odi.framework.util.ConstantUtil;
import com.spring.odi.query.common.bean.*;
import com.spring.odi.query.common.bean.dataField.HandelFieldType;
import com.spring.odi.query.common.bean.defaultValue.AbstractConditionValue;
import com.spring.odi.query.common.bean.defaultValue.BaseConditionValue;
import com.spring.odi.query.common.bean.defaultValue.UserConditionValue;
import com.spring.odi.query.common.lisenter.SqlParamListener;
import com.spring.odi.query.common.po.TableView;
import com.spring.odi.query.common.po.Template;
import com.spring.odi.query.common.service.TemplateParseService;
import com.spring.odi.framework.util.SetUtil;
import com.spring.odi.query.common.util.SqlConstants;
import com.spring.odi.query.common.util.SqlFormateUtil;
import com.spring.odi.framework.util.StringUtil;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.*;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Xu dong
 *
 */
@Service
@Transactional(transactionManager="transactionManager")
public class TemplateParseServiceImpl implements TemplateParseService {
    @SuppressWarnings({ "rawtypes", "static-access" })
    private static final Map<String, Class> map = BaseConditionValue.INSTANCE.map;

    @Override
    public TemplateObjBean parseSql(String sql) {
        return parseSql(sql, false);
    }

    public <Ext extends BaseQueryBean> Object getValueNew(String leftExpression, Ext queryBean) {
        return null;

    }
    public Object getValueNew(String leftExpression) {
        return null;

    }
    private <Ext extends BaseQueryBean> Object getCommonTableConditionBeanNew(String value,Ext queryBean) {
        return null;
    }
    private <Ext extends BaseQueryBean> Object[] getCommonTableConditionBeanNew(String valueStart,String valueEnd,Ext queryBean) {
        return null;
    }
    private <Ext extends BaseQueryBean> String getHandelSql(String partSql, List<String> items, HandelFieldType fieldType,Ext queryBean) {
        return null;
    }
    @Override
    public <Ext extends BaseQueryBean>Ext parseSql(Ext bean, HandelFieldType fieldType) {
        return null;
    }

    @Override
    public TemplateObjBean parseSql(String sql,Boolean isPreview) {
        return null;
    }


    public TemplateObjBean processSelectBody(SelectBody selectBody) {
        return null;
    }

    public TemplateObjBean processPlainSelect(PlainSelect plainSelect) {
        return null;
    }
    public void processJoinItem(List<Join> joins) {
        return;
    }
    public void processFromItem(FromItem fromItem) {
        return;
        //Table时不用处理
    }

    public boolean orderByHashParameters(List<OrderByElement> orderByElements) {
        return false;
    }
    private List<TableView> getTableViews(PlainSelect plainSelect) {
        return null;
    }
    private TableView getKeyAndAlias(SelectItem selectItem, Integer index) {
        return null;
    }
    private List<String> getGroupByKey(PlainSelect plainSelect) {
        return null;
    }
    private List<String> getOrderByKey(PlainSelect plainSelect) {
        return null;
    }
    private List<TableView> handelTableView(List<TableView> tableView,Map<String, List<String>> map) {
        return null;
    }

    public Template getTemplate(PlainSelect plainSelect) {
        return null;

    }
    private List<TableConditionBean> getTableConditions(List<String> statements) {
        return null;
    }
    private TableConditionBean getTableCondition(String state) {
        return null;
    }
    private static TableConditionBean getTableOp(Expression expression, TableConditionBean tableCondition, String type) {
        return null;
    }
    public static TableConditionBean getKeyAndAlias(String expression,TableConditionBean tableConditionBean) {
        return null;
    }

    public  String[]  handelWhereArea(String leftValue) {
        return null;
    }
    public  String handelWhere(String whereArea,List<String> conditionItems) {
        return null;
    }
    private String getCommonTableConditionBean(String value) {
        return null;
    }
    public String[] handelWhereArea(String valueStart,String valueEnd) {
        return null;

    }

    @SuppressWarnings("all")
    public static String getValue(String leftExpression) {
        return null;

    }
}
