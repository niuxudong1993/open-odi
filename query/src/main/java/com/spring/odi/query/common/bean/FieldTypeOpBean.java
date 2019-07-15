package com.spring.odi.query.common.bean;



public class FieldTypeOpBean extends QueryPageBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String op;
	private Integer fieldTypeId;
	private String fileTypeName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public Integer getFieldTypeId() {
		return fieldTypeId;
	}
	public void setFieldTypeId(Integer fieldTypeId) {
		this.fieldTypeId = fieldTypeId;
	}
	public String getFileTypeName() {
		return fileTypeName;
	}
	public void setFileTypeName(String fileTypeName) {
		this.fileTypeName = fileTypeName;
	}

}
