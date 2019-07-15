package com.spring.odi.query.common.service.impl;

import com.spring.odi.framework.common.bean.ResponseApiBean;
import com.spring.odi.framework.exception.ServiceException;
import com.spring.odi.framework.util.JsonUtil;
import com.spring.odi.framework.util.PropertiesUtil;
import com.spring.odi.framework.util.SetUtil;
import com.spring.odi.framework.util.StringUtil;
import com.spring.odi.query.common.bean.*;
import com.spring.odi.query.common.bean.dataField.HandelFieldType;
import com.spring.odi.query.common.dao.QueryTemplateDao;
import com.spring.odi.query.common.po.*;
import com.spring.odi.query.common.service.QueryTemplateService;
import com.spring.odi.query.common.service.RedisResourceService;
import com.spring.odi.query.common.util.SqlFormateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
@Transactional(transactionManager="transactionManager")
public class QueryTmplateServiceImpl implements QueryTemplateService {
	private final static byte[] lock = new byte[0]; 
	@Autowired
	private QueryTemplateDao queryTemplateDao;
	@Autowired
	private RedisResourceService redisResourceService;
	
	/**
	 * 添加 模板
	 * @param template
	 * @param tableViews
	 * @param tableConditions
	 * @param contextPath
	 * @return
	 */
	@Override
	public Template addQueryTemplate(Template template, List<TableView> tableViews, List<TableConditionBean> tableConditions, String contextPath, Integer systemId) {
		return null;
	}

	
	/**
	 * 查询模板列表
	 * @param templateBean
	 * @return
	 */
	@Override
	public TemplateBean queryTemplateListByPage(TemplateBean templateBean) {
		return null;
	}
	
	/**
	 * 查询模板内容
	 * @param code
	 * @param templateSaveId
	 * @return
	 */
	@Override
	public TemplateObjBean queryTempalteDetail(String code,Integer templateSaveId) {
		return null;
	}

	/**
	 * 更新模板
	 * @param template
	 * @param tableViews
	 * @param tableConditions
	 * @param contextPath
	 * @return
	 */
	@Override
	public Template updateQueryTemplate(Template template, List<TableView> tableViews, List<TableConditionBean> tableConditions,String contextPath) {
		return null;
	}
	
	/**
	 * 删除模板
	 * @param templateId
	 * @return
	 */
	@Override
	public int deleteQueryTemplate(Integer templateId) {
		return null;
	}
	
	/**
	 * 添加保存查询
	 * @param templateSave
	 * @return
	 */
	@Override
	public int addTemplateSave(TemplateJsonObj templateSave) {
		return addTemplateSave(templateSave, false);
	}
	
	/**
	 * 更新保存查询
	 * @param templateSave
	 * @return
	 */
	@Override
	public int updateTemplateSave(TemplateJsonObj templateSave) {
		return addTemplateSave(templateSave, true);
	}
	
	
	public int addTemplateSave(TemplateJsonObj save, Boolean isUpdate) {
		return null;
		
		
	}
	/**
	 * 添加模板内容
	 * @param template
	 * @return
	 */
	private Template addTemplate(Template template,String systemId) {
		return null;
	}
	/**
	 * 添加tableCondition
	 * @param list
	 * @param templateId
	 * @return
	 */
	private List<TableConditionBean> addTableConditions(List<TableConditionBean> list,Integer templateId) {
		return null;
	}
	
	/**
	 * 添加tableView
	 * @param list
	 * @param templateId
	 */
	private void addTableViews(List<TableView> list,Integer templateId) {
		return null;
	}
	
	/**
	 * 添加tableOP
	 * @param list
	 * @param templateId
	 * @param tableConditionId
	 */
	private void addTableOps(List<TableOpBean> list, Integer templateId, Integer tableConditionId) {
		return null;
	}
	
	/**
	 * 删除保存查询
	 * @param id
	 * @return
	 */
	@Override
	public int deleteTemplateSave(Integer id) {
		return null;
	}
	
	/**
	 * 查询保存查询列表
	 * @param queryBean
	 * @return
	 */
	@Override
	public ResponseApiBean queryTemplateSaveBeanList(QueryBean queryBean) {
		return null;
	}

	@Override
	/**
	 * 根据配置生成sql
	 * @param querys
	 * @return
	 */
	public ResponseApiBean generateSqlByTemplate(QueryBean querys) {
		return null;
	}
	
	@Override
	/**
	 * 更据模板Code 获得查询结果
	 * @param code
	 * @return
	 */
	public QueryBean queryTempalteDetailByCode(String code,Integer templateSaveId) {
		return covertQueryBean(code,templateSaveId);
	}

	private QueryBean covertQueryBean(String code,Integer templateSaveId) {
		return null;
	}
	/**
	 * preview tableConditio处理
	 * @param whereArea
	 * @param conditions
	 * @return
	 */
	private String handelTableCondition(String whereArea,List<TableConditionBean> conditions) {
		return null;
	}
	private TemplateObjBean geTemplateObj(String code,Integer templateSaveId) {
		return null;
	}

	
	/**
	 * 添加 保存查询where条件 templateCondition
	 * @param tableConditions
	 * @param queryTemplateId
	 * @param templateSaveId
	 * @return
	 */
	private List<TemplateCondition> addTemplateCondition(List<TableConditionBean> tableConditions,Integer queryTemplateId,Integer templateSaveId) {
		return null;
	}

	/**
	 *  查询模块关联的module
	 * @param id
	 * @param code
	 * @param i18nName
	 * @return
	 */
	@Override
	public List<TemplateBean> selectTemplateListByMouduleId(Integer id,String code,String i18nName) {
		return queryTemplateDao.selectTemplateListByMouduleId(id,code,i18nName);
	}

	/**
	 * 查询条件
	 * @param queryBean
	 * @return
	 */
	@Override
	public ResponseApiBean queryTemplateSaveListAll(QueryBean queryBean) {
		return null;
	}

	@Override
	public void updateFormLayout(TemplateBean template) {
		return null;
	}

}
