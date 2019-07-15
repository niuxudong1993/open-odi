package com.spring.odi.query.common.bean;

public class TemplateRequestBean implements java.io.Serializable {

	private Integer templateId;
	private String bindSql;
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public String getBindSql() {
		return bindSql;
	}
	public void setBindSql(String bindSql) {
		this.bindSql = bindSql;
	}
	
}
