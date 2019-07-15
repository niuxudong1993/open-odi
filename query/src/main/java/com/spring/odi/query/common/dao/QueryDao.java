package com.spring.odi.query.common.dao;


import com.spring.odi.query.common.bean.QueryBean;
import com.spring.odi.query.common.po.OptionSelectBean;
import com.spring.odi.query.common.po.Template;
import org.apache.ibatis.annotations.Mapper;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public interface QueryDao {

	List<LinkedHashMap<String,Object>> selectList(ConcurrentMap<String, Object> map);
	
	List<LinkedHashMap<String,Object>> selectListByPage(ConcurrentMap<String, Object> map);
	
	int selectListCount(ConcurrentMap<String, Object> map);
	
	int selectTemplateListCount(QueryBean querys);
	
	List<Template> selectTemplateList(QueryBean querys);
	
	List<OptionSelectBean> queryModuleList();
	
	
}
