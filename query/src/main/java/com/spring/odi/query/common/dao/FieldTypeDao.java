package com.spring.odi.query.common.dao;

import com.spring.odi.query.common.bean.FieldTypeBean;
import com.spring.odi.query.common.bean.FieldTypeOpBean;
import com.spring.odi.query.common.po.FieldOp;
import com.spring.odi.query.common.po.FieldType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FieldTypeDao {
	
	 int addFieldType(FieldType fieldType);
	 
	 int deleteFieldType(@Param(value = "fieldTypeid") Integer id);

	 int addFieldOp(FieldOp fieldOp);

	 int deleteFieldOp(@Param(value = "fieldOpId") Integer id);

	 List<FieldTypeBean> selectFieldTypeById(@Param(value = "filedTypeId") Integer filedTypeId);

	 List<FieldTypeOpBean> selectOpbyFieldTypeId(@Param(value = "filedTypeId") Integer fieldTypeId);

	 int selectOpCountByFieldTypeId(@Param(value = "filedTypeId") Integer fieldTypeId);
}
