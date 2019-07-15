package com.spring.odi.query.common.bean;

public class TableViewBean implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer queryTemplateId;
	private String key;//字段
	private String alias;//别名
	private String i18nKey;
	private String entity;
	private Integer defaultView;//是否显示
	private Integer groupby;
	private Integer summary;
	private Integer orderby;//是否需要排序
	private Integer filterby;
	private Integer orderIndex;//展示的顺序
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
	public Integer getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Integer orderIndex) {
		this.orderIndex = orderIndex;
	}
}
