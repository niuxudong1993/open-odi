package com.spring.odi.query.common.bean.dataField;


import com.spring.odi.framework.util.StringUtil;
import com.spring.odi.query.common.bean.CommonTableConditionBean;
import com.spring.odi.query.common.bean.QueryBean;
import com.spring.odi.query.common.lisenter.SqlParamListener;
import com.spring.odi.query.common.util.SqlConstants;

/**
 * 数字类型
 *
 * @author Administrator
 */
public class NumberFieldType extends HandelFieldType {

    /**
     *
     */
    private static final long serialVersionUID = 235736600080426871L;
    private static Integer count = 0;

    public NumberFieldType(SqlParamListener listener) {
        super(listener);
    }

    /**
     * 处理Number数据类型（（key op value 逻辑符 。。））
     *
     * @param t（value以~分隔）
     * @return
     */
    @Override
    public <T extends CommonTableConditionBean> T getHandledObject(T t) {
        return null;
    }

    public Object changeJavaType(String value) {
        return null;
    }

    public <T extends CommonTableConditionBean> String handleCommonData(T t1, T t2) {
        return null;
    }

    public static void main(String[] args) {
        /*System.out.println(StringUtil.isValidNumber("0.01"));*/
        CommonTableConditionBean bean = new CommonTableConditionBean();
        bean.setFiledType(SqlConstants.FieldType.Number);
        bean.setOp(SqlConstants.OpType.between_in);
        bean.setKey("id");
        bean.setValue("2.3~2.5");
        new NumberFieldType(new SqlParamListener(new QueryBean())).getHandledObject(bean);
        System.out.println(bean);
    }
}
