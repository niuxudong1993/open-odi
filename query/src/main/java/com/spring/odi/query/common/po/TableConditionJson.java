package com.spring.odi.query.common.po;

import com.spring.odi.query.common.bean.QueryOpBean;

import java.util.List;

public class TableConditionJson implements java.io.Serializable {

	private String sortKey;
	private String sortEntity;
	private String sortOrder;
	private String fuzzyQueryValue;
	private String webUrl;
	private String queryName;
	private Integer pagenation;
	private List<QueryOpBean>  queryOpBeans;
	private List<String> viewColumns;
	private List<ColumnFilter> filters;
	public String getSortKey() {
		return sortKey;
	}
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}
	public String getSortEntity() {
		return sortEntity;
	}
	public void setSortEntity(String sortEntity) {
		this.sortEntity = sortEntity;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getFuzzyQueryValue() {
		return fuzzyQueryValue;
	}
	public void setFuzzyQueryValue(String fuzzyQueryValue) {
		this.fuzzyQueryValue = fuzzyQueryValue;
	}
	public String getWebUrl() {
		return webUrl;
	}
	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}
	public String getQueryName() {
		return queryName;
	}
	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}
	public Integer getPagenation() {
		return pagenation;
	}
	public void setPagenation(Integer pagenation) {
		this.pagenation = pagenation;
	}
	public List<QueryOpBean> getQueryOpBeans() {
		return queryOpBeans;
	}
	public void setQueryOpBeans(List<QueryOpBean> queryOpBeans) {
		this.queryOpBeans = queryOpBeans;
	}
	public List<String> getViewColumns() {
		return viewColumns;
	}
	public void setViewColumns(List<String> viewColumns) {
		this.viewColumns = viewColumns;
	}
	public List<ColumnFilter> getFilters() {
		return filters;
	}
	public void setFilters(List<ColumnFilter> filters) {
		this.filters = filters;
	}
	

}
