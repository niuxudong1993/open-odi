package com.spring.odi.query.common.bean;


import com.spring.odi.query.common.po.ColumnFilter;

import java.util.List;

public class QueryConditionBean implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private List<QueryOpBean> queryOpBeans;// 自定义的过滤条件
	private Integer templateId; // 模板Id
	private Integer templateSaveId; // 保存查询Id
	private Integer start;
	private Integer length;
	private String sortKey; // 待排序的字段
	private String sortOrder;// 排序的类型
	private String sortEntity;// 待排序的字段的entity
	private String fuzzyQueryValue;// 模糊查询的值
	private String queryName; // 查询名称
	private List<String> viewColumns;// 控制显示的列
	private List<ColumnFilter> columnFilter;// 控制过滤的列
	private String code;// 模板的Code
	private String isJsonData;
	private String exportWay;
	private String exportType;
	private List<String> fuzzyViewColumns ;//模糊查询的列

	public List<QueryOpBean> getQueryOpBeans() {
		return queryOpBeans;
	}

	public void setQueryOpBeans(List<QueryOpBean> queryOpBeans) {
		this.queryOpBeans = queryOpBeans;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public String getSortKey() {
		return sortKey;
	}

	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
	}

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getSortEntity() {
		return sortEntity;
	}

	public void setSortEntity(String sortEntity) {
		this.sortEntity = sortEntity;
	}

	public String getFuzzyQueryValue() {
		return fuzzyQueryValue;
	}

	public void setFuzzyQueryValue(String fuzzyQueryValue) {
		this.fuzzyQueryValue = fuzzyQueryValue;
	}

	public Integer getTemplateSaveId() {
		return templateSaveId;
	}

	public void setTemplateSaveId(Integer templateSaveId) {
		this.templateSaveId = templateSaveId;
	}

	public String getQueryName() {
		return queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public List<String> getViewColumns() {
		return viewColumns;
	}

	public void setViewColumns(List<String> viewColumns) {
		this.viewColumns = viewColumns;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<ColumnFilter> getColumnFilter() {
		return columnFilter;
	}

	public void setColumnFilter(List<ColumnFilter> columnFilter) {
		this.columnFilter = columnFilter;
	}

	public String getIsJsonData() {
		return isJsonData;
	}

	public void setIsJsonData(String isJsonData) {
		this.isJsonData = isJsonData;
	}

	public String getTemplateCode() {
		return code;
	}

	public String getExportWay() {
		return exportWay;
	}

	public void setExportWay(String exportWay) {
		this.exportWay = exportWay;
	}

	public String getExportType() {
		return exportType;
	}

	public void setExportType(String exportType) {
		this.exportType = exportType;
	}

	public List<String> getFuzzyViewColumns() {
		return fuzzyViewColumns;
	}

	public void setFuzzyViewColumns(List<String> fuzzyViewColumns) {
		this.fuzzyViewColumns = fuzzyViewColumns;
	}

}
