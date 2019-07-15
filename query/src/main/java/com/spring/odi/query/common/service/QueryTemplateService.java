package com.spring.odi.query.common.service;

import com.spring.odi.framework.common.bean.ResponseApiBean;
import com.spring.odi.query.common.bean.QueryBean;
import com.spring.odi.query.common.bean.TableConditionBean;
import com.spring.odi.query.common.bean.TemplateBean;
import com.spring.odi.query.common.bean.TemplateObjBean;
import com.spring.odi.query.common.po.TableView;
import com.spring.odi.query.common.po.Template;
import com.spring.odi.query.common.po.TemplateJsonObj;
import java.util.List;


public interface QueryTemplateService {
	/**
	 * 功能描述: <br>
	 * 添加模板信息
	 * @param template
	 * @param tableViews
	 * @param tableConditions
	 * @param contextPath
	 * @param systemId
	 * @return:com.spring.odi.query.common.po.Template
	 **/
	Template addQueryTemplate(Template template, List<TableView> tableViews, List<TableConditionBean> tableConditions, String contextPath, Integer systemId);

	/**
	 * 功能描述: <br>
	 * 分页查询模板信息
	 * @param templateBean
	 * @return:com.spring.odi.query.common.bean.TemplateBean
	 **/
	TemplateBean queryTemplateListByPage(TemplateBean templateBean);

	/**
	 * 功能描述: <br>
	 * 获取模板配置明细
	 * @param code
	 * @param templateSaveId
	 * @return:com.spring.odi.query.common.bean.TemplateObjBean
	 **/
	TemplateObjBean queryTempalteDetail(String code, Integer templateSaveId);

	/**
	 * 功能描述: <br>
	 * 获取模板配置
	 * @param code
	 * @param templateSaveId
	 * @return:com.spring.odi.query.common.bean.QueryBean
	 **/
	QueryBean queryTempalteDetailByCode(String code, Integer templateSaveId);

	/**
	 * 功能描述: <br>
	 * 更新模板
	 * @param template
	 * @param tableViews
	 * @param tableConditions
	 * @param contextPath
	 * @return:com.spring.odi.query.common.po.Template
	 **/
	Template updateQueryTemplate(Template template, List<TableView> tableViews, List<TableConditionBean> tableConditions, String contextPath);

	/**
	 * 功能描述: <br>
	 * 删除模板
	 * @param templateId
	 * @return:int
	 **/
	int deleteQueryTemplate(Integer templateId);

	/**
	 * 功能描述: <br>
	 * 添加历史查询条件配置
	 * @param templateSave
	 * @return:int
	 **/;
	int addTemplateSave(TemplateJsonObj templateSave);

	/**
	 * 功能描述: <br>
	 * 更新历史查询条件配置
	 * @param templateSave
	 * @return:int
	 **/
	int updateTemplateSave(TemplateJsonObj templateSave);

	/**
	 * 功能描述: <br>
	 * 删除历史查询条件配置
	 * @param id
	 * @return:int
	 **/
	int deleteTemplateSave(Integer id);

	/**
	 * 功能描述: <br>
	 * 获取所有历史查询条件配置
	 * @param queryBean
	 * @return:com.spring.odi.framework.common.bean.ResponseApiBean
	 **/
	ResponseApiBean queryTemplateSaveBeanList(QueryBean queryBean);

	/**
	 * 功能描述: <br>
	 * 根据配置生成原生sql
	 * @param querys
	 * @return:com.spring.odi.framework.common.bean.ResponseApiBean
	 **/
	ResponseApiBean generateSqlByTemplate(QueryBean querys);

	/**
	 * 通过moduleId查询template
	 * @param id
	 * @param code
	 * @param i18nName
	 * @return
	 */
	List<TemplateBean> selectTemplateListByMouduleId(Integer id, String code, String i18nName);
	
	/**
	 * 查询条件lsit
	 * @param queryBean
	 * @return
	 */
	ResponseApiBean queryTemplateSaveListAll(QueryBean queryBean);

	/**
	 * 功能描述: <br>
	 * 更新前端配置信息
	 * @param template
	 * @return:void
	 * @Date: 2019/7/13 11:02
	 **/
	void updateFormLayout(TemplateBean template);
}
