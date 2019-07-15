package com.spring.odi.query.export.service.impl;


import com.spring.odi.query.common.bean.BaseQueryBean;
import com.spring.odi.query.common.bean.QueryBean;
import com.spring.odi.query.common.dao.QueryDao;
import com.spring.odi.query.common.service.QueryService;
import com.spring.odi.query.export.bean.QueryForkJoinTask;
import com.spring.odi.query.export.service.ExportDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@Transactional(transactionManager="transactionManager")
public class ExportDataImpl extends ExportBaseImpl<LinkedHashMap<String,Object>> implements ExportDataService<LinkedHashMap<String,Object>> {
@Autowired
private QueryService service;
    public ExportDataImpl() {
    }

    @Override
    public int getCounts() {
        return 1000001;
    }

    @Override
    public <Ext extends BaseQueryBean> int getCounts(Ext queryBean) {
        return null;
    }

    @Override
    public List<LinkedHashMap<String,Object>> queryData(Integer start, Integer end, Map<String, Object> map) {
        return null;
    }

    @Override
    public <Ext extends BaseQueryBean> List<LinkedHashMap<String, Object>> queryData(Integer start, Integer end, Ext queryBean) {
        return null;
    }



}
