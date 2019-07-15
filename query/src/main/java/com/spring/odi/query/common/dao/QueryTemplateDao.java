package com.spring.odi.query.common.dao;

import com.spring.odi.query.common.bean.*;
import com.spring.odi.query.common.po.TableView;
import com.spring.odi.query.common.po.Template;
import com.spring.odi.query.common.po.TemplateJsonObj;
import com.spring.odi.query.common.po.TemplateSave;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QueryTemplateDao {

	int addQueryTemplate(Template template);
	
	int addTableView(@Param(value = "items") List<TableView> tableViews);

	int addTableCondition(@Param(value = "items") List<TableConditionBean> tableConditions);

	int addTableOp(@Param(value = "items") List<TableOpBean> tableOps);

	int selectTempalteMaxId();

	int selectTableViewMaxId();

	int selectTableConditionMaxId();


	int updateQueryTemplate(Template template);

	int updateTableView(@Param(value = "items") List<TableView> tableViews);

	int updateTableCondition(@Param(value = "items") List<TableConditionBean> tableConditions);

	int updateTableOp(@Param(value = "items") List<TableOpBean> tableOps);

	int deleteQueryTemplate(Template template);

	List<TemplateBean> selectTemplateListByPage(TemplateBean templateBean);

	int selectTemplateListCount(TemplateBean templateBean);

	Template selectTemplateDetailById(@Param(value = "templateId") Integer id);

	List<TableView> selectTableViewListByTemplateId(@Param(value = "templateId") Integer id);

	List<TableConditionBean> selecetTableConditionListByTemplateId(@Param(value = "templateId") Integer id);

	TableConditionBean selecetTableConditionListById(@Param(value = "id") Integer id);

	List<TableOpBean> selectTableOpListByConditionId(@Param(value = "tableConditionId") Integer id);

	int deleteTableOp(@Param(value = "tableOps") List<TableOpBean> tableOps, @Param(value = "tableConditionId") Integer id);

	int deleteTableView(@Param(value = "tableViews") List<TableView> tableViews, @Param(value = "templateId") Integer id);

	int deleteTableCondition(@Param(value = "tableConditions") List<TableConditionBean> tableConditions, @Param(value = "templateId") Integer id);

	int addTemplateSave(TemplateJsonObj templateSave);

	int deleteTemplateSave(@Param(value = "id") Integer id);

	int updateTemplateSave(TemplateSave templateSave);

	TemplateJsonObj queryTemplateSave(@Param(value = "id") Integer id);

	int deleteTableOpByTableConditionId(@Param(value = "tableConditionId") Integer id);

	int selectTemplateSaveMaxId();

	List<TemplateJsonObj> queryTemplateSaveList(QueryBean queryBean);

	Template selectTemplateDetailByCode(@Param(value = "code") String code);

	List<TemplateBean> selectTemplateListByMouduleId(@Param(value = "moduleId") Integer id, @Param(value = "code") String code, @Param(value = "i18nName") String i18nName);

	TemplateObjBean selectTemplateObjBeanById(@Param(value = "id") Integer id);

	TemplateObjBean selectTemplateObjBeanByCode(@Param(value = "code") String  code);

	/**
	 * 通过moduleId查询
	 * @Date        :      2017年9月21日
	 * @param id
	 * @return
	 */
	List<Integer> selectTemplateIdsByMouduleId(@Param(value = "moduleId") Integer id);

	/**
	 * template在系统下面唯一。name暂定为系统标识符字段
	 * @Date        :      2017年9月21日
	 * @param systemId
	 * @param name
	 * @return
	 */
	int selectTemplateCountByName(@Param(value = "systemId") String systemId, @Param(value = "name") String name);

	/**
	 * 复制当前template的templateCondition---》需要复制queryTemplateId下面的condition去templateId
	 * @Date        :      2017年9月22日
	 * @return
	 */
	int templateConditionCopy(@Param(value = "templateId") Integer templateId, @Param(value = "templateCode") String templateCode, @Param(value = "queryTemplateId") Integer queryTemplateId, @Param(value = "user") String user, @Param(value = "companyCode") String companyCode);

	/**
	 * 通过queryTemplateId查询该公司的condition的数量
	 * @Date        :      2017年9月22日
	 * @param queryTemplateId
	 * @param companyCode
	 * @return
	 */
	int templateConditionCount(@Param(value = "queryTemplateId") Integer queryTemplateId, @Param(value = "companyCode") String companyCode);
	
	/**
	 * 查询当前登陆用户的condition总数
	 * @Date        :      2017年9月25日
	 * @param queryBean
	 * @return
	 */
	int queryTemplateSaveCount(QueryBean queryBean);
	
	/**
	 *  查询当前登陆用户的condition
	 * @Date        :      2017年9月26日
	 * @param queryBean
	 * @return
	 */
	List<TemplateJsonObj> queryTemplateSaveListByLoginUser(QueryBean queryBean);

	void updateFormLayout(TemplateBean template);
	Integer updateTemplateSave(TemplateJsonObj save);
	
}
