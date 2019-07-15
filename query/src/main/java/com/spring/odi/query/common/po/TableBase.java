package com.spring.odi.query.common.po;

/**
 * 模板配置信息的父类 用于关联外键
 * @author Administrator
 *
 */
public class TableBase implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer queryTemplateId;
	private Integer tableConditionId;
	private Integer isDeleted;
	
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
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
