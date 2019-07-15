package com.spring.odi.query.common.po;



/**
 * 保存查询关联模的tableCondition
 * @author Administrator
 *
 */
public class TemplateCondition {

	private Integer id;
	private Integer tableConditionId;
	private Integer queryTemplateId;
	private Integer templateSaveId;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTableConditionId() {
		return tableConditionId;
	}
	public void setTableConditionId(Integer tableConditionId) {
		this.tableConditionId = tableConditionId;
	}
	public Integer getQueryTemplateId() {
		return queryTemplateId;
	}
	public void setQueryTemplateId(Integer queryTemplateId) {
		this.queryTemplateId = queryTemplateId;
	}
	public Integer getTemplateSaveId() {
		return templateSaveId;
	}
	public void setTemplateSaveId(Integer templateSaveId) {
		this.templateSaveId = templateSaveId;
	}
	
}
