package com.spring.odi.query.common.bean;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class TemplateParameter implements Serializable{

	private ConcurrentHashMap<String, Object> map;
	private Integer start; //分页数据 开始
	private Integer end; //分页数据 结束
	private Integer length; //分页数据 单页记录条数
	private Integer maxRowsInNoPage; //不分页的显示数据
	private Integer pagenation;//分页数据条数
	
	public ConcurrentHashMap<String, Object> getMap() {
		return map;
	}
	public void setMap(ConcurrentHashMap<String, Object> map) {
		this.map = map;
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
	public Integer getEnd() {
		if (start == null || length == null) {
			return end;
		}
		end = start+length;
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}
	public Integer getMaxRowsInNoPage() {
		return maxRowsInNoPage;
	}
	public void setMaxRowsInNoPage(Integer maxRowsInNoPage) {
		this.maxRowsInNoPage = maxRowsInNoPage;
	}
	public Integer getPagenation() {
		return pagenation;
	}
	public void setPagenation(Integer pagenation) {
		this.pagenation = pagenation;
	}
	
}
