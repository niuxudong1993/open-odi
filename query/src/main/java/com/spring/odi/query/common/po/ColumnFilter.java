package com.spring.odi.query.common.po;

import java.io.Serializable;

public class ColumnFilter implements Serializable {

	
	private String filterKey;
	private String filterValue;
	
	
	public String getFilterKey() {
		return filterKey;
	}
	public void setFilterKey(String filterKey) {
		this.filterKey = filterKey;
	}
	public String getFilterValue() {
		return filterValue;
	}
	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
	}
	


}
