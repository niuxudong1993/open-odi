package com.spring.odi.query.common.po;

public class TableOp extends TableBase implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String opName;
	private Integer opTypId;
	private Integer defaultOp;



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

}
