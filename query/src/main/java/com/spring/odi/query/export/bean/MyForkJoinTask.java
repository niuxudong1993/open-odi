package com.spring.odi.query.export.bean;


import com.spring.odi.query.export.service.ExportDataService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RecursiveTask;

public class  MyForkJoinTask <T extends Object> extends RecursiveTask<ConcurrentHashMap<Integer, List<T>>> {

    private final Integer rowNum = 500;


    // 子任务开始计算的值
    private Integer startValue;

    // 子任务结束计算的值
    private Integer endValue;

    private Integer pageNo;

    private Integer total;

    private ExportDataService<T> dao;

    public MyForkJoinTask(){

    }
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ExportDataService<T> getDao() {
        return dao;
    }
    public void setDao(ExportDataService<T> dao) {
        this.dao = dao;
    }

    public Integer getStartValue() {
        return startValue;
    }
    public void setStartValue(Integer startValue) {
        this.startValue = startValue;
    }
    public Integer getEndValue() {
        return endValue;
    }
    public void setEndValue(Integer endValue) {
        this.endValue = endValue;
    }
    @Override
    protected ConcurrentHashMap<Integer, List<T>> compute() {
        // 如果条件成立，说明这个任务所需要计算的数值分为足够小了
        // 可以正式进行累加计算了
        // 否则再进行任务拆分，拆分成两个任务
       return null;
    }
    public List<T> getPageList(ConcurrentHashMap<Integer, List<T>> map) {

        return null;
    }
    public static void main(String[] args) {

    }
    public Integer getTotalPageNo() {
        return null;
    }
    public Integer getFirstPageNo(Integer rownum,Integer startValue) {
        return null;
    }
    public ConcurrentHashMap<Integer, List<T>> getMaps(ConcurrentHashMap<Integer, List<T>> map1,ConcurrentHashMap<Integer, List<T>> map2) {
        return null;
    }
}