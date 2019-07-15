package com.spring.odi.framework.datasource.bean;

import com.spring.odi.framework.util.ConstantUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态数据源上下文
 */
public class DbContextHolder {
    private static final ThreadLocal contextHolder = new ThreadLocal<>();
 
    /*
     * 管理所有的数据源id;
     * 主要是为了判断数据源是否存在;
     */
    public static List<String> dataSourceIds = new ArrayList<String>();
 
    /**
     * 设置数据源
     * @param dbTypeEnum
     */
    public static void setDbType(String dbTypeEnum) {
        contextHolder.set(dbTypeEnum);
    }
 
    /**
     * 取得当前数据源
     * @return
     */
    public static String getDbType() {
       String dbName= (String)contextHolder.get();
       if (dbName == null) {
           setDbType(ConstantUtil.defalutDBPrefix);
       }
        return (String)contextHolder.get();
    }
    /**
     * 清除上下文数据
     */
    public static void clearDbType() {
        contextHolder.remove();
    }
 
    /**
     * 判断指定DataSrouce当前是否存在
     * @param dataSourceId
     * @return
     */
    public static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }
}
