package com.spring.odi.query.common.po;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TemplateV2  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String code;
	private String name;
	private String i18nName;
	private String module;
	private String version;
	private Page page;// 关于翻页查询的实体
	private String entityName;// 需要查询的是哪个实体（也是查询的主实体）
	private List<TableView> tableViews;// 需要显示的字段
	private List<Condition> conds;// 设置查询条件的集合
	private List<String> groupFields;// 分组字段集合
	protected List<Orders> orders = new ArrayList<>();// 排序字段
	private Integer isDelete;
	private Integer showColumnIndex;
	private Integer showImportButton;
	private Integer showExportButton;
	private Integer maxRowsInNoPage;
	/**/
	private Integer parentId;
	/**/
	private Date parentLastTime;
	/* 跨版本整个平台唯一标识 */
	private String uuid;
	/* 发布时间 */
	private Date publishTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getI18nName() {
		return i18nName;
	}

	public void setI18nName(String i18nName) {
		this.i18nName = i18nName;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public List<TableView> getTableViews() {
		return tableViews;
	}

	public void setTableViews(List<TableView> tableViews) {
		this.tableViews = tableViews;
	}

	public List<Condition> getConds() {
		return conds;
	}

	public void setConds(List<Condition> conds) {
		this.conds = conds;
	}

	public List<String> getGroupFields() {
		return groupFields;
	}

	public void setGroupFields(List<String> groupFields) {
		this.groupFields = groupFields;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getShowColumnIndex() {
		return showColumnIndex;
	}

	public void setShowColumnIndex(Integer showColumnIndex) {
		this.showColumnIndex = showColumnIndex;
	}

	public Integer getShowImportButton() {
		return showImportButton;
	}

	public void setShowImportButton(Integer showImportButton) {
		this.showImportButton = showImportButton;
	}

	public Integer getShowExportButton() {
		return showExportButton;
	}

	public void setShowExportButton(Integer showExportButton) {
		this.showExportButton = showExportButton;
	}

	public Integer getMaxRowsInNoPage() {
		return maxRowsInNoPage;
	}

	public void setMaxRowsInNoPage(Integer maxRowsInNoPage) {
		this.maxRowsInNoPage = maxRowsInNoPage;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Date getParentLastTime() {
		return parentLastTime;
	}

	public void setParentLastTime(Date parentLastTime) {
		this.parentLastTime = parentLastTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public static class Page {
		// 页码
		protected int pagenum = 0;

		// 每页显示的条数
		protected int pageSize = 10;
		// 总页数
		protected long totalResultsCount;

		public Page() {
		}

		public Page(int pagenum, int pageSize, int pagesize) {
			this.pagenum = pagenum;
			this.pageSize = pagesize;
		}

		public int getPagenum() {
			return pagenum;
		}

		public void setPagenum(int pagenum) {
			this.pagenum = pagenum;
			if (pagenum < 0) {
				this.pagenum = 0;
			}
		}

		/**
		 * 设置每页的记录数量, 低于1时自动调整为1.
		 */
		public void setPageSize(final int pageSize) {
			this.pageSize = pageSize;

			if (pageSize < 1) {
				this.pageSize = 1;
			} else if (pageSize > 100) {
				this.pageSize = 100;
			}
		}

		public long getTotalResultsCount() {
			return totalResultsCount;
		}

		public void setTotalResultsCount(long totalResultsCount) {
			this.totalResultsCount = totalResultsCount;
		}
	}

	public static class Orders {
		private String sortdatafield;
		private Direction sortorder;

		public Orders() {
		}

		public Orders(String sortdatafield, Direction sortorder) {
			this.sortdatafield = sortdatafield;
			this.sortorder = sortorder;
		}

		public String getSortdatafield() {
			return sortdatafield;
		}

		public void setSortdatafield(String sortdatafield) {
			this.sortdatafield = sortdatafield;
		}

		public Direction getSortorder() {
			return sortorder;
		}

		public void setSortorder(Direction sortorder) {
			this.sortorder = sortorder;
		}
	}

	public static enum Direction {
		ASC, DESC;
	}

	public static class Condition {
		private String item;
		private Integer fieldType;
		private ConditionOPEnum op;
		private Object value;

		public Condition(String item, Integer fieldType, ConditionOPEnum op, Object value) {
			this.item = item;
			this.fieldType = fieldType;
			this.op = op;
			this.value = value;
		}

		public Condition() {
		}

		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public Integer getFieldType() {
			return fieldType;
		}

		public void setFieldType(Integer fieldType) {
			this.fieldType = fieldType;
		}

		public ConditionOPEnum getOp() {
			return op;
		}

		public void setOp(ConditionOPEnum op) {
			this.op = op;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}
	}

	public static enum ConditionOPEnum {
		NONE, EQ, NE, LIKE, NLIKE, START, GT, GTE, LT, LTE, IN, ALL, NIN, EXISTS, AND, OR;
	}
}
