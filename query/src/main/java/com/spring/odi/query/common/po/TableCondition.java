package com.spring.odi.query.common.po;

import java.util.List;

/**
 * 处理where过滤条件
 * @author Administrator
 *
 */
public class TableCondition extends TableBase implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String key;
	private String alias;
	private String i18nKey;
	private String entity;
	private Integer isdefault;
	private Integer quick;//是否为快速查询
	private Integer filedType;
	private String dataservice;//获取数据集可以是url可以是templateCode
	private Integer defaultOp;//默认的操作符
	private List<TableOp> tableOps;//对应的操作符
	private Integer id;
	private Integer queryTemplateId;
	private String bindSql;//仅仅匹配前台传入的数据
	private Integer op;//仅仅匹配前台传入的数据
	private String value;//仅仅匹配前台传入的数据
	private String opType;//仅仅匹配前台传入的数据
	private String combineSql;//仅仅匹配前台传入的数据
	private Object realValue;
	private Integer innerSearchField;
	
	
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
	public Integer getDefaultOp() {
		return defaultOp;
	}
	public void setDefaultOp(Integer defaultOp) {
		this.defaultOp = defaultOp;
	}
	public List<TableOp> getTableOps() {
		return tableOps;
	}
	public void setTableOps(List<TableOp> tableOps) {
		this.tableOps = tableOps;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
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
	public Integer getFiledType() {
		return filedType;
	}
	public void setFiledType(Integer filedType) {
		this.filedType = filedType;
	}
	public String getDataservice() {
		return dataservice;
	}
	public void setDataservice(String dataservice) {
		this.dataservice = dataservice;
	}
	public String getBindSql() {
		return bindSql;
	}
	public void setBindSql(String bindSql) {
		this.bindSql = bindSql;
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
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public Object getRealValue() {
		return realValue;
	}
	public void setRealValue(Object realValue) {
		this.realValue = realValue;
	}
	public Integer getInnerSearchField() {
		return innerSearchField;
	}
	public void setInnerSearchField(Integer innerSearchField) {
		this.innerSearchField = innerSearchField;
	}
	
}
