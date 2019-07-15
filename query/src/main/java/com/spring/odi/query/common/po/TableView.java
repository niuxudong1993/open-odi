package com.spring.odi.query.common.po;

public class TableView extends TableBase implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String key;
	private String alias;
	private String i18nKey;
	private String entity;
	private Integer defaultView;
	private Integer groupby;
	private Integer summary;
	private Integer orderby;
	private Integer filterby;
	private Integer orderIndex;
	private String display;
	private String validation;
	private String extend ;
//	private Integer id;
//	private Integer queryTemplateId;
	
	

//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public Integer getQueryTemplateId() {
//		return queryTemplateId;
//	}
//	public void setQueryTemplateId(Integer queryTemplateId) {
//		this.queryTemplateId = queryTemplateId;
//	}
	public Integer getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
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
	public Integer getDefaultView() {
		return defaultView;
	}
	public void setDefaultView(Integer defaultView) {
		this.defaultView = defaultView;
	}
	public Integer getGroupby() {
		return groupby;
	}
	public void setGroupby(Integer groupby) {
		this.groupby = groupby;
	}
	public Integer getSummary() {
		return summary;
	}
	public void setSummary(Integer summary) {
		this.summary = summary;
	}
	public Integer getOrderby() {
		return orderby;
	}
	public void setOrderby(Integer orderby) {
		this.orderby = orderby;
	}
	public Integer getFilterby() {
		return filterby;
	}
	public void setFilterby(Integer filterby) {
		this.filterby = filterby;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getValidation() {
		return validation;
	}
	public void setValidation(String validation) {
		this.validation = validation;
	}
	public String getExtend() {
		return extend;
	}
	public void setExtend(String extend) {
		this.extend = extend;
	}

}
