package com.spring.odi.query.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/******************************************************************************
 * @File name   :      QueryFormBase.java
 *
 * @Author      :      fxm
 *
 * @Date        :      2016-9-19
 *
 * @Copyright Notice: 
 * Copyright (c) 2016 Efast Serv. All  Rights Reserved.
 * This software is published under the terms of the Efast Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------
 * Date                   Who         Version        Comments
 * 2016-9-19 下午5:45:45        fxm     1.0            Initial Version
 *****************************************************************************/
public class QueryPageBase implements Serializable{

	private Integer start;
	
	private Integer length;
	
	private String orderBy;
	
	private String sort;
	
	private List resultList=new ArrayList<>();
	
	private Integer totalRows=0;
	

	public List getResultList() {
		return resultList;
	}

	public void setResultList(List resultList) {
		this.resultList = resultList;
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

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Integer getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}

}
