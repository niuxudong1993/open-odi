package com.spring.odi.query.common.bean;

public class TableOpBean implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer queryTemplateId;
	private Integer tableConditionId;
	private String opName;//显示的操作符
	private Integer opTypId;//操作符类型
	private Integer defaultOp;
	private Integer isDeleted;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getQueryTemplateId() {
		return queryTemplateId;
	}
	public void setQueryTemplateId(Integer queryTemplateId) {
		this.queryTemplateId = queryTemplateId;
	}
	public Integer getTableConditionId() {
		return tableConditionId;
	}
	public void setTableConditionId(Integer tableConditionId) {
		this.tableConditionId = tableConditionId;
	}
	public String getOpName() {
		return opName;
	}
	public void setOpName(String opName) {
		this.opName = opName;
	}
	public Integer getOpTypId() {
		return opTypId;
	}
	public void setOpTypId(Integer opTypId) {
		this.opTypId = opTypId;
	}
	public Integer getDefaultOp() {
		return defaultOp;
	}
	public void setDefaultOp(Integer defaultOp) {
		this.defaultOp = defaultOp;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
