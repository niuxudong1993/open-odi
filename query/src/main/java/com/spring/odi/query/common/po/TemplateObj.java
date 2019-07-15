package com.spring.odi.query.common.po;


import com.spring.odi.query.common.bean.TableConditionBean;

import java.util.List;

public class TemplateObj implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Template template;
	private List<TableView> tableViews;
	private List<TableConditionBean> tableConditions;
	private String isJsonData;
	private String contextPath;
	private Integer systemId;
	public Template getTemplate() {
		return template;
	}
	public void setTemplate(Template template) {
		this.template = template;
	}
	public List<TableView> getTableViews() {
		return tableViews;
	}
	public void setTableViews(List<TableView> tableViews) {
		this.tableViews = tableViews;
	}
	public List<TableConditionBean> getTableConditions() {
		return tableConditions;
	}
	public void setTableConditions(List<TableConditionBean> tableConditions) {
		this.tableConditions = tableConditions;
	}
	public String getIsJsonData() {
		return isJsonData;
	}
	public void setIsJsonData(String isJsonData) {
		this.isJsonData = isJsonData;
	}
	public String getContextPath() {
		return contextPath;
	}
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	public Integer getSystemId() {
		return systemId;
	}
	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}
	
}
