package com.spring.odi.query.common.po;

import java.util.ArrayList;
import java.util.List;


public class TemplateJsonObjQueryBean{

	private Integer count;
	private List resultList=new ArrayList<>();
	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List getResultList() {
		return resultList;
	}

	public void setResultList(List resultList) {
		this.resultList = resultList;
	}
	
	
}
