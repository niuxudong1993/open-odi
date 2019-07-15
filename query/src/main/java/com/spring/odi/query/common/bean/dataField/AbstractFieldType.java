package com.spring.odi.query.common.bean.dataField;


import com.spring.odi.query.common.bean.CommonTableConditionBean;

import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("all")
/**
 * 处理各类数据类型的抽象父类
 * @author Administrator
 *
 */
public abstract class AbstractFieldType extends CommonTableConditionBean {
    /**
     *
     */
    private static final long serialVersionUID = 8820161034216632688L;
    public static ConcurrentHashMap<String, Object> parameters = new ConcurrentHashMap<>();
    public static Integer index = 0;

    /**
     * 处理特殊数据类型
     *
     * @param t
     * @return
     */
    public abstract <T extends CommonTableConditionBean> T getHandledObject(T t);//一些特殊的数据类型 用combineSql 拼接

}
