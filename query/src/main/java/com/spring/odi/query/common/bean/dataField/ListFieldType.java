package com.spring.odi.query.common.bean.dataField;


import com.spring.odi.query.common.bean.CommonTableConditionBean;
import com.spring.odi.query.common.lisenter.SqlParamListener;
import com.spring.odi.query.common.util.SqlConstants;
import com.spring.odi.framework.util.StringUtil;

/**
 * List数据类型 多选
 *
 * @author Administrator
 */
public class ListFieldType extends HandelFieldType {

    /**
     *
     */
    private static final long serialVersionUID = -8581155006743199069L;

    public ListFieldType(SqlParamListener listener) {
        super(listener);
    }

    /**
     * 处理list数据类型（（key op value 逻辑符 。。））
     *
     * @param t（value以~分隔）
     * @return
     */
    @Override
    public <T extends CommonTableConditionBean> T getHandledObject(T t) {
        return null;
    }
}
