package com.spring.odi.query.export.service.impl;


import com.spring.odi.query.common.bean.BaseQueryBean;
import com.spring.odi.query.export.bean.MyForkJoinTask;
import com.spring.odi.query.export.bean.QueryForkJoinTask;
import com.spring.odi.query.export.service.ExportDataService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class ExportBaseImpl<T extends Object> {

    public ExportBaseImpl() {
        // TODO Auto-generated constructor stub
    }
    public ConcurrentHashMap<Integer, List<T>> initTask(MyForkJoinTask<T> task) {
        return null;
    }
    public <Ext extends BaseQueryBean> ConcurrentHashMap<Integer, List<T>> initTask(QueryForkJoinTask<T, Ext> task, Ext queryBean) {
        return null;
    }
    public List<T> getList(ExportDataService<T> dao) {
        return null;
    }
    public <Ext extends BaseQueryBean> List<T> getList(ExportDataService<T> dao,Ext queryBean) {
        return null;
    }
}