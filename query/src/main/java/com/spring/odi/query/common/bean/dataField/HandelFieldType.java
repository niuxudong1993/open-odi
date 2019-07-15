package com.spring.odi.query.common.bean.dataField;


import com.spring.odi.framework.util.StringUtil;
import com.spring.odi.query.common.bean.CommonTableConditionBean;
import com.spring.odi.query.common.lisenter.SqlParamListener;
import com.spring.odi.query.common.util.SqlConstants;
/**
 * 通用处理数据类型
 *
 *
 */
public class HandelFieldType extends AbstractFieldType {
    private SqlParamListener listener;

    public HandelFieldType(SqlParamListener listener) {
        this.listener = listener;
    }

    @Override
    public <T extends CommonTableConditionBean> T getHandledObject(T op) {
        return null;
    }

    public <T extends CommonTableConditionBean> CommonTableConditionBean handelCondition(T op, Boolean isDefaultValue) {
        return null;
    }

    /**
     * 获得bindSql的通用方法
     *
     * @param op
     * @return
     */
    public <T extends CommonTableConditionBean> String contactSql(T op, String oldKey) {
        return null;
    }

    public <T extends CommonTableConditionBean> String covertSql(String key, String value, Integer op, Integer fieldType) {
        return null;
    }

    public SqlParamListener getListener() {
        return listener;
    }

    public void setListener(SqlParamListener listener) {
        this.listener = listener;
    }
}
