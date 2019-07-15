package com.spring.odi.query.common.bean;

import java.io.Serializable;


public class CommonTableConditionBean implements Serializable {
	private String key;
	private Integer op;
	private String value;
	private String bindSql;
	private Integer filedType;
	private String opType;
	private String combineSql;
	private Object realValue;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Integer getOp() {
		return op;
	}
	public void setOp(Integer op) {
		this.op = op;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getBindSql() {
		return bindSql;
	}
	public void setBindSql(String bindSql) {
		this.bindSql = bindSql;
	}
	public Integer getFiledType() {
		return filedType;
	}
	public void setFiledType(Integer filedType) {
		this.filedType = filedType;
	}
	public String getOpType() {
		return opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}
	public String getCombineSql() {
		return combineSql;
	}
	public void setCombineSql(String combineSql) {
		this.combineSql = combineSql;
	}
	public Object getRealValue() {
		return realValue;
	}
	public void setRealValue(Object realValue) {
		this.realValue = realValue;
	}
	
}
