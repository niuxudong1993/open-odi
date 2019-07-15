package com.spring.odi.query.common.po;




import com.spring.odi.query.common.bean.QueryOpBean;

import java.util.List;

/**
 * 保存查询的信息（主表） portal_query_template_save
 * @author Administrator
 *
 */
public class TemplateSave {

	private Integer id;
	private Integer queryTemplateId;
	private String code;
	private String sortKey;
	private String sortEntity;
	private String sortOrder;
	private String fuzzyQueryValue;
	private String webUrl;
	private String queryName;
	private String moduleName;
	private Integer pagenation;
	private List<QueryOpBean>  queryOpBeans;
	private List<TemplateCondition> conditions;
	private List<TemplateKey> keys;
	private List<String> viewColumns;
	private List<ColumnFilter> filters;
	private Integer templateSaveId;
	private String isJsonData;
	private String tableConditionJson;
	private String tableConditionRef;
	
	public String getTableConditionJson() {
		return tableConditionJson;
	}
	public void setTableConditionJson(String tableConditionJson) {
		this.tableConditionJson = tableConditionJson;
	}
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
	public String getSortKey() {
		return sortKey;
	}
	public void setSortKey(String sortKey) {
		this.sortKey = sortKey;
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
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
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
	public List<TemplateCondition> getConditions() {
		return conditions;
	}
	public void setConditions(List<TemplateCondition> conditions) {
		this.conditions = conditions;
	}
	public List<String> getViewColumns() {
		return viewColumns;
	}
	public void setViewColumns(List<String> viewColumns) {
		this.viewColumns = viewColumns;
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
	public Integer getTemplateSaveId() {
		return templateSaveId;
	}
	public void setTemplateSaveId(Integer templateSaveId) {
		this.templateSaveId = templateSaveId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<TemplateKey> getKeys() {
		return keys;
	}
	public void setKeys(List<TemplateKey> keys) {
		this.keys = keys;
	}
	public List<ColumnFilter> getFilters() {
		return filters;
	}
	public void setFilters(List<ColumnFilter> filters) {
		this.filters = filters;
	}
	public String getIsJsonData() {
		return isJsonData;
	}
	public void setIsJsonData(String isJsonData) {
		this.isJsonData = isJsonData;
	}
	public String getTableConditionRef() {
		return tableConditionRef;
	}
	public void setTableConditionRef(String tableConditionRef) {
		this.tableConditionRef = tableConditionRef;
	}
	

}
