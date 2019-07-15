package com.spring.odi.query.common.service.impl;

import com.spring.odi.framework.redis.bean.RedisCacheWriter;
import com.spring.odi.framework.util.CommonConstant;
import com.spring.odi.framework.util.JsonUtil;
import com.spring.odi.framework.util.SetUtil;
import com.spring.odi.query.common.bean.TableConditionBean;
import com.spring.odi.query.common.bean.TableOpBean;
import com.spring.odi.query.common.bean.TemplateObjBean;
import com.spring.odi.query.common.dao.QueryDao;
import com.spring.odi.query.common.dao.QueryTemplateDao;
import com.spring.odi.query.common.po.*;
import com.spring.odi.query.common.service.RedisResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings("all")
@Service
@Transactional(transactionManager="transactionManager")
public class RedisResourceServiceImpl implements RedisResourceService {
	@Autowired
	private QueryTemplateDao queryTemplateDao;
	@Autowired
	private QueryDao queryDao;
	@Autowired
	private RedisCacheWriter redislistObj;
	
	@Override
	public List<TableConditionBean> queryTableConditionBean(Integer templateId) {
		return null;
	}
	
	@Override
	public List<TableView> queryTableView(Integer templateId) {
		return null;
	}
	
	@Override
	public List<TableOpBean> queryTableOp(Integer id) {
		return null;
	}
	
	@Override
	public Template getTemplateById(Integer id) {
		return null;
	}
	
	@Override
	public Template getTemplateByCode(String code) {
		return null;

	}

	@Override
	public TemplateObjBean geTemplateObjBean(String code) {
		return null;
	}
	@Override
	public void updateTemplate(Template template, TemplateObjBean bean) {
		return null;
	}

	@Override
	public void updateTableOp(List<TableOpBean> beans,Integer tableConditionId) {
		return null;
	}

	@Override
	public void updateTableView(List<TableView> tableView,Integer templateId) {
		return null;
	}

	@Override
	public void updateTableCondition(List<TableConditionBean> beans,Integer templateId) {
		return null;
		
	}

	@Override
	public void updateTemplateSave(TemplateSave templateSave, Integer templateId) {
		return null;
	}

	@Override
	public TemplateSave queryTemplateSaveBean(Integer templateSaveId) {
		return null;
	}
	
	public void updateTemplateObjBean(TemplateObjBean template,String code) {
		return null;
	}

	@Override
	public void updateTemplateLayoutBean(TemplateObjBean templateObjBean, String formLayout, String code) {
		return null;
	}

	private void clearRedis(String key) {
		redislistObj.deleteDataByKey(key);
	}

	
}
