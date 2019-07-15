package com.spring.odi.query.common.bean;

public class QueryOpBean extends CommonTableConditionBean implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer templateSaveId;
	private String opName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTemplateSaveId() {
		return templateSaveId;
	}
	public void setTemplateSaveId(Integer templateSaveId) {
		this.templateSaveId = templateSaveId;
	}
	public String getOpName() {
		return opName;
	}
	public void setOpName(String opName) {
		this.opName = opName;
	}
	
}
