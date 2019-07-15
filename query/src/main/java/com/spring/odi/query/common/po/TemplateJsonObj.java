package com.spring.odi.query.common.po;


public class TemplateJsonObj{

	private Integer queryTemplateId;
	private String code;
	private TableConditionJson tableConditionJson;
	private String conditionJson;
	private String tableConditionRef;
	private Integer id;
	private Integer templateSaveId;
	private String isJsonData;
	public Integer getQueryTemplateId() {
		return queryTemplateId;
	}
	public void setQueryTemplateId(Integer queryTemplateId) {
		this.queryTemplateId = queryTemplateId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTableConditionRef() {
		return tableConditionRef;
	}
	public void setTableConditionRef(String tableConditionRef) {
		this.tableConditionRef = tableConditionRef;
	}
	public Integer getTemplateSaveId() {
		return templateSaveId;
	}
	public void setTemplateSaveId(Integer templateSaveId) {
		this.templateSaveId = templateSaveId;
	}
	public String getIsJsonData() {
		return isJsonData;
	}
	public void setIsJsonData(String isJsonData) {
		this.isJsonData = isJsonData;
	}
	public TableConditionJson getTableConditionJson() {
		return tableConditionJson;
	}
	public void setTableConditionJson(TableConditionJson tableConditionJson) {
		this.tableConditionJson = tableConditionJson;
	}
	public String getConditionJson() {
		return conditionJson;
	}
	public void setConditionJson(String conditionJson) {
		this.conditionJson = conditionJson;
	}
	

}
