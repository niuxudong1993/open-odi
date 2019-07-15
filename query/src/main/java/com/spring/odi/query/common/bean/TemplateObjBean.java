package com.spring.odi.query.common.bean;



import com.spring.odi.query.common.po.TableView;
import com.spring.odi.query.common.po.Template;

import java.util.List;


public class TemplateObjBean implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Template template;
	private List<TableView> tableViews;
	private List<TableConditionBean> tableConditions;
	private boolean success;
	private String message;
	private String bindSql;
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
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getBindSql() {
		return bindSql;
	}
	public void setBindSql(String bindSql) {
		this.bindSql = bindSql;
	}
	
	
	
}

