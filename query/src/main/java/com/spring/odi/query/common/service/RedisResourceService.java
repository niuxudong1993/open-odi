package com.spring.odi.query.common.service;

import com.spring.odi.query.common.bean.TableConditionBean;
import com.spring.odi.query.common.bean.TableOpBean;
import com.spring.odi.query.common.bean.TemplateObjBean;
import com.spring.odi.query.common.po.TableView;
import com.spring.odi.query.common.po.Template;
import com.spring.odi.query.common.po.TemplateSave;

import java.util.List;


public interface RedisResourceService {
	/**
	 * 功能描述: <br>
	 * 获取模板
	 * @param code
	 * @return:com.spring.odi.query.common.po.Template
	 **/
	Template getTemplateByCode(String code);

	/**
	 * 功能描述: <br>
	 * 获取模板
	 * @param id
	 * @return:com.spring.odi.query.common.po.Template
	 **/
	Template getTemplateById(Integer id);

	/**
	 * 功能描述: <br>
	 * 获取模板运算条件模块
	 * @param id
	 * @return:java.util.List<com.spring.odi.query.common.bean.TableOpBean>
	 **/
	List<TableOpBean> queryTableOp(Integer id);

	/**
	 * 功能描述: <br>
	 * 获取模板显示数据模块
	 * @param templateId
	 * @return:java.util.List<com.spring.odi.query.common.po.TableView>
	 **/
	List<TableView> queryTableView(Integer templateId);

	/**
	 * 功能描述: <br>
	 * 获取模板查询条件模块
	 * @param templateId
	 * @return:java.util.List<com.spring.odi.query.common.bean.TableConditionBean>
	 **/
	List<TableConditionBean> queryTableConditionBean(Integer templateId);

	/**
	 * 功能描述: <br>
	 * 查询历史查询条件
	 * @param templateSaveId
	 * @return:com.spring.odi.query.common.po.TemplateSave
	 **/
	TemplateSave queryTemplateSaveBean(Integer templateSaveId);

	/**
	 * 功能描述: <br>
	 * 更新模板配置
	 * @param template
	 * @param bean
	 * @return:void
	 **/;
	void updateTemplate(Template template, TemplateObjBean bean);

	/**
	 * 功能描述: <br>
	 * 更新模板运算条件模块
	 * @param beans
	 * @param tableConditionId
	 * @return:void
	 **/
	void updateTableOp(List<TableOpBean> beans, Integer tableConditionId);

	/**
	 * 功能描述: <br>
	 * 更新模板显示数据模块
	 * @param tableView
	 * @param templateId
	 * @return:void
	 **/
	void updateTableView(List<TableView> tableView, Integer templateId);

	/**
	 * 功能描述: <br>
	 * 更新模板查询条件模块
	 * @param beans
	 * @param templateId
	 * @return:void
	 **/
	void updateTableCondition(List<TableConditionBean> beans, Integer templateId);

	/**
	 * 功能描述: <br>
	 * 更新历史查询
	 * @param templateSave
	 * @param templateId
	 * @return:void
	 **/
	void updateTemplateSave(TemplateSave templateSave, Integer templateId);

	/**
	 * 功能描述: <br>
	 * 获取模板配置
	 * @param code
	 * @return:com.spring.odi.query.common.bean.TemplateObjBean
	 **/
	TemplateObjBean geTemplateObjBean(String code);

	/**
	 * 功能描述: <br>
	 * 更新前端配置内容
	 * @param templateObjBean
	 * @param formLayout
	 * @param code
	 * @return:void
	 **/
	void updateTemplateLayoutBean(TemplateObjBean templateObjBean, String formLayout, String  code);

}
