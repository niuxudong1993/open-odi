package com.spring.odi.query.common.po;




import java.util.Date;

public class Template {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String code;
	private String name;
	private String i18nName;
	private String module;
	private String version;
	//private String search;
	private Integer viewComponent;//2017-7-15马总建议修改search->viewComponent
	private Integer valid;
	private String customViewComponent;//用户展示组件
	private String extendedService;//扩展的服务
	private Integer logType;
	
	private String queryConditionDisplay;//下拉选字符串
	private Integer checkboxType;
	private Integer columnSelectable;
	private Integer pagenation;
	private String selectArea;
	private String fromArea;
	private String whereArea;
	private String groupbyArea;
	private String orderbyArea;
	private Integer isDelete;
	private Integer showColumnIndex;
	private Integer showImportButton;
	private Integer showExportButton;
	private Integer maxRowsInNoPage;
	/**/
    private Integer parentId;
 	/**/
    private Date parentLastTime;
 	/*跨版本整个平台唯一标识*/
    private String uuid;
	/*发布时间*/
    private Date publishTime;
    
    private String script;
    
    private String css;
    
    private String formLayout ;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getI18nName() {
		return i18nName;
	}
	public void setI18nName(String i18nName) {
		this.i18nName = i18nName;
	}
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getViewComponent() {
		return viewComponent;
	}
	public void setViewComponent(Integer viewComponent) {
		this.viewComponent = viewComponent;
	}
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	public String getCustomViewComponent() {
		return customViewComponent;
	}
	public void setCustomViewComponent(String customViewComponent) {
		this.customViewComponent = customViewComponent;
	}
	public String getExtendedService() {
		return extendedService;
	}
	public void setExtendedService(String extendedService) {
		this.extendedService = extendedService;
	}
	public Integer getLogType() {
		return logType;
	}
	public void setLogType(Integer logType) {
		this.logType = logType;
	}
	public Integer getCheckboxType() {
		return checkboxType;
	}
	public void setCheckboxType(Integer checkboxType) {
		this.checkboxType = checkboxType;
	}
	public Integer getColumnSelectable() {
		return columnSelectable;
	}
	public void setColumnSelectable(Integer columnSelectable) {
		this.columnSelectable = columnSelectable;
	}
	public Integer getPagenation() {
		return pagenation;
	}
	public void setPagenation(Integer pagenation) {
		this.pagenation = pagenation;
	}
	public String getSelectArea() {
		return selectArea;
	}
	public void setSelectArea(String selectArea) {
		this.selectArea = selectArea;
	}
	public String getFromArea() {
		return fromArea;
	}
	public void setFromArea(String fromArea) {
		this.fromArea = fromArea;
	}
	public String getWhereArea() {
		return whereArea;
	}
	public void setWhereArea(String whereArea) {
		this.whereArea = whereArea;
	}
	public String getGroupbyArea() {
		return groupbyArea;
	}
	public void setGroupbyArea(String groupbyArea) {
		this.groupbyArea = groupbyArea;
	}
	public String getOrderbyArea() {
		return orderbyArea;
	}
	public void setOrderbyArea(String orderbyArea) {
		this.orderbyArea = orderbyArea;
	}
	public Integer getShowColumnIndex() {
		return showColumnIndex;
	}
	public void setShowColumnIndex(Integer showColumnIndex) {
		this.showColumnIndex = showColumnIndex;
	}
	public Integer getShowImportButton() {
		return showImportButton;
	}
	public void setShowImportButton(Integer showImportButton) {
		this.showImportButton = showImportButton;
	}
	public Integer getShowExportButton() {
		return showExportButton;
	}
	public void setShowExportButton(Integer showExportButton) {
		this.showExportButton = showExportButton;
	}
	public Integer getMaxRowsInNoPage() {
		return maxRowsInNoPage;
	}
	public void setMaxRowsInNoPage(Integer maxRowsInNoPage) {
		this.maxRowsInNoPage = maxRowsInNoPage;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Date getParentLastTime() {
		return parentLastTime;
	}
	public void setParentLastTime(Date parentLastTime) {
		this.parentLastTime = parentLastTime;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	public String getCss() {
		return css;
	}
	public void setCss(String css) {
		this.css = css;
	}
	public String getQueryConditionDisplay() {
		return queryConditionDisplay;
	}
	public void setQueryConditionDisplay(String queryConditionDisplay) {
		this.queryConditionDisplay = queryConditionDisplay;
	}
	public String getFormLayout() {
		return formLayout;
	}
	public void setFormLayout(String formLayout) {
		this.formLayout = formLayout;
	}
	
	
}
