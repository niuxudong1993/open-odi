package com.spring.odi.query.common.po;

import java.io.Serializable;

public class TemplateKey implements Serializable {

	private Integer type;// 0:排序 sort 1:过滤 filter 2:查看 view
	private Integer templateSaveId;
	private String key;
	private String value;
	private Integer id;
	
	public static Integer Sort = 0;
	
	public static Integer Filter = 1;
	
	public static Integer View = 0;
	
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getTemplateSaveId() {
		return templateSaveId;
	}
	public void setTemplateSaveId(Integer templateSaveId) {
		this.templateSaveId = templateSaveId;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	

}
