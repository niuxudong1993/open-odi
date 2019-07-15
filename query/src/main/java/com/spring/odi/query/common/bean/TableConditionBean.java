package com.spring.odi.query.common.bean;

import java.util.List;

public class TableConditionBean extends CommonTableConditionBean implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer queryTemplateId;//模板Id
	private String i18nKey;
	private String entity;
	private String alias;
	private Integer isdefault;
	private Integer quick;//是否模糊查询
	private String dataservice;//获取数据集可以是url可以是templateCode
	private Integer defaultOp;//默认的操作符
	private Integer op;
	private List<TableOpBean> tableOps;	//可能的操作符集
	private Integer isDeleted;
	private Integer innerSearchField;

	public List<TableOpBean> getTableOps() {
		return tableOps;
	}
	public void setTableOps(List<TableOpBean> tableOps) {
		this.tableOps = tableOps;
	}
	public Integer getQueryTemplateId() {
		return queryTemplateId;
	}
	public void setQueryTemplateId(Integer queryTemplateId) {
		this.queryTemplateId = queryTemplateId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getI18nKey() {
		return i18nKey;
	}
	public void setI18nKey(String i18nKey) {
		this.i18nKey = i18nKey;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public Integer getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(Integer isdefault) {
		this.isdefault = isdefault;
	}
	
	public Integer getQuick() {
		return quick;
	}
	public void setQuick(Integer quick) {
		this.quick = quick;
	}
	public String getDataservice() {
		return dataservice;
	}
	public void setDataservice(String dataservice) {
		this.dataservice = dataservice;
	}
	public Integer getDefaultOp() {
		return defaultOp;
	}
	public void setDefaultOp(Integer defaultOp) {
		this.defaultOp = defaultOp;
	}
	public Integer getOp() {
		op = defaultOp;
		return op;
	}
	public void setOp(Integer op) {
		this.op = op;
	}
	public Integer getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Integer getInnerSearchField() {
		return innerSearchField;
	}
	public void setInnerSearchField(Integer innerSearchField) {
		this.innerSearchField = innerSearchField;
	}
	
}
