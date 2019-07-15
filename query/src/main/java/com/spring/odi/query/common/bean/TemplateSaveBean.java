package com.spring.odi.query.common.bean;


import com.spring.odi.query.common.po.Template;
import com.spring.odi.query.common.po.TemplateCondition;

import java.util.List;


public class TemplateSaveBean implements java.io.Serializable {

	private Integer id;
	private Integer templateId;
	private String code;
	private Integer templateSaveId;
	private Template template;
	private String sortKey;//排序的字段
	private String sortEntity;
	private String fuzzyQueryValue;//模糊茶香的值
	private String webUrl;//前台跳转页面
	private String queryName;//保存查询的名称
	private String moduleName;
	private Integer pagenation;//每页的记录数
	private List<QueryOpBean>  queryOpBeans;
	private List<TemplateCondition> conditions;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Template getTemplate() {
		return template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}
	public String getSortKey() {
		return sortKey;
	}
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}
	public String getSortEntity() {
		return sortEntity;
	}
	public void setSortEntity(String sortEntity) {
		this.sortEntity = sortEntity;
	}
	public String getFuzzyQueryValue() {
		return fuzzyQueryValue;
	}
	public void setFuzzyQueryValue(String fuzzyQueryValue) {
		this.fuzzyQueryValue = fuzzyQueryValue;
	}
	public String getWebUrl() {
		return webUrl;
	}
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}
	public String getQueryName() {
		return queryName;
	}
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public Integer getPagenation() {
		return pagenation;
	}
	public void setPagenation(Integer pagenation) {
		this.pagenation = pagenation;
	}
	public List<QueryOpBean> getQueryOpBeans() {
		return queryOpBeans;
	}
	public void setQueryOpBeans(List<QueryOpBean> queryOpBeans) {
		this.queryOpBeans = queryOpBeans;
	}
	public List<TemplateCondition> getConditions() {
		return conditions;
	}
	public void setConditions(List<TemplateCondition> conditions) {
		this.conditions = conditions;
	}
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public Integer getTemplateSaveId() {
		return templateSaveId;
	}
	public void setTemplateSaveId(Integer templateSaveId) {
		this.templateSaveId = templateSaveId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
