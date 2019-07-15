package com.spring.odi.query.common.bean.dataField;


import com.spring.odi.framework.util.StringUtil;
import com.spring.odi.query.common.bean.CommonTableConditionBean;
import com.spring.odi.query.common.lisenter.SqlParamListener;
import com.spring.odi.query.common.util.SqlConstants;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TimeStampFieldType extends HandelFieldType {

    /**
     *
     */
    private static final long serialVersionUID = 2921439629914131861L;
    private static Integer count = 0;
    private static Boolean isDate = false;

    public TimeStampFieldType(SqlParamListener listener) {
        super(listener);
    }

    @Override
    public <T extends CommonTableConditionBean> T getHandledObject(T t) {
        return null;
    }

    /**
     * 处理单个时间类型
     *
     * @param t
     * @return
     */
    public <T extends CommonTableConditionBean> T handleCommonData(T t, boolean isBetween) {
        return null;
    }

    /**
     * 处理时间范围
     *
     * @param t
     * @param value1 （小）
     * @param value2 （大）
     * @return
     */
    public <T extends CommonTableConditionBean> T handleBetweenData(T t, String value1, String value2) {
        return null;
    }

    private String parseDateToDateTime(String value1) {
        return null;

    }

    private String parseDateToDateTime(String value1, Integer days) {
        return null;
    }

    private static String addTime(String value1, Integer fieldType, Integer seconds) {
        return null;
    }

    public static void main(String[] args) {
		/*CommonTableConditionBean bean = new CommonTableConditionBean();
		bean.setFiledType(FieldType.Date);
		bean.setOp(OpType.between_in);
		bean.setKey("time");
		bean.setValue("2017-08-23~2017-08-25");
		new TimeStampFieldType().getHandledObject(bean);
		System.out.println(bean);
		System.out.println(addTime("10:00:00", FieldType.Time, 1));*/

    }

}
