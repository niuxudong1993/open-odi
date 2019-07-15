package com.spring.odi.query.common.po;

import java.io.Serializable;

public class OptionSelectBean implements Serializable {

	private Integer optionKey;
	private String optionDesc;
	private String moduleVersion;
	public Integer getOptionKey() {
		return optionKey;
	}
	public void setOptionKey(Integer optionKey) {
		this.optionKey = optionKey;
	}
	public String getOptionDesc() {
		return optionDesc;
	}
	public void setOptionDesc(String optionDesc) {
		this.optionDesc = optionDesc;
	}
	public String getModuleVersion() {
		return moduleVersion;
	}
	public void setModuleVersion(String moduleVersion) {
		this.moduleVersion = moduleVersion;
	}
	
	
}
