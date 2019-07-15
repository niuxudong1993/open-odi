package com.spring.odi.query.common.po;

public class FieldOp implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String op;//操作符
	private Integer fieldTypeId;//字段类型id
	private Integer orderIndex;
	private Integer isDelete;
	
	public Integer getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
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
	
	
}
