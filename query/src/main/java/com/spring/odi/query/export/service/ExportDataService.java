package com.spring.odi.query.export.service;

import com.spring.odi.query.common.bean.BaseQueryBean;
import com.spring.odi.query.export.bean.MyForkJoinTask;
import com.spring.odi.query.export.bean.QueryForkJoinTask;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface ExportDataService<T extends Object> {
    int getCounts();
    <Ext extends BaseQueryBean> int getCounts(Ext queryBean);
    List<T> queryData(Integer start, Integer end, Map<String, Object> map);
    <Ext extends BaseQueryBean> List<T> queryData(Integer start, Integer end, Ext queryBean);
    ConcurrentHashMap<Integer, List<T>> initTask(MyForkJoinTask<T> task);
    <Ext extends BaseQueryBean>ConcurrentHashMap<Integer, List<T>> initTask(QueryForkJoinTask<T,Ext> task,Ext queryBean);
    List<T> getList(ExportDataService<T> dao);
    <Ext extends BaseQueryBean>List<T> getList(ExportDataService<T> dao,Ext queryBean);
}