package com.spring.odi.query.common.util;

import com.spring.odi.query.common.bean.dataField.AbstractFieldType;
import com.spring.odi.query.common.bean.dataField.ListFieldType;
import com.spring.odi.query.common.bean.dataField.NumberFieldType;
import com.spring.odi.query.common.bean.dataField.TimeStampFieldType;
import org.apache.ibatis.type.JdbcType;

import java.util.HashMap;
import java.util.Map;


public class SqlConstants {
	public static String exportWay_frontend = "frontend";
	public static String exportWay_backend = "backend";
	public static String exportType_pdf = "pdf";
	public static String exportType_excel = "excel";
	public static String exportType_csv = "csv";
	public static String sqlParam_string = "String";
	public static String sqlParam_number = "Number";
	
	public static class FieldType {
		public static Map<Integer,Class<? extends AbstractFieldType>> map =null;
		public static Map<Integer,String> JdbcMap =null;
		public final static Integer Text=0;
		public final static Integer Number=1;
		public final static Integer List=2;
		public final static Integer Date = 3;
		public final static Integer Boolean = 4;
		public final static Integer User = 5;
		public final static Integer Time = 6;
		public final static Integer DateTime = 7;
		public final static Integer Default = -1;
		static {
			JdbcMap = new HashMap<>();
			JdbcMap.put(FieldType.Time, JdbcType.TIME.name());
			JdbcMap.put(FieldType.DateTime, JdbcType.DATETIMEOFFSET.name());
			JdbcMap.put(FieldType.Date, JdbcType.DATE.name());
			JdbcMap.put(FieldType.Text, JdbcType.VARCHAR.name());
			JdbcMap.put(FieldType.Number, JdbcType.NUMERIC.name());
			JdbcMap.put(FieldType.Boolean, JdbcType.NUMERIC.name());
			map = new HashMap<>();//获取数据类型对象
			map.put(FieldType.Default, AbstractFieldType.class);
			map.put(FieldType.Time, TimeStampFieldType.class);
			map.put(FieldType.DateTime, TimeStampFieldType.class);
			map.put(FieldType.Date, TimeStampFieldType.class);
			map.put(FieldType.List, ListFieldType.class);
			map.put(FieldType.Number, NumberFieldType.class);
		}
	}
	public static class OpType {
		public static Map<Integer, String> map = null;//用于数据库执行拼接的运算符
		public static Map<Integer, String> map2 = null;//用于返回给前台的运算符
		public final static Integer eq = 0;
		public final static Integer not_eq = 1;
		public final static Integer gt = 2;
		public final static Integer lt = 3;
		public final static Integer ge = 4;
		public final static Integer le = 5;
		public final static Integer Like = 6;
		public final static Integer is_not = 7 ;
		public final static Integer is = 8;
		public final static Integer between_in = 9;
		public final static Integer between_not = 10;
		public final static Integer today = 11;
		static {
			map = new HashMap<>();
			map.put(0, " = ");
			map.put(1, " != ");
			map.put(2, " > ");// >
			map.put(3, " < ");// <
			map.put(4, " >= ");// >=
			map.put(5, " <= ");// <=
			map.put(6, " like ");
			map.put(7, " is not ");
			map.put(8, " is ");
			map2 = new HashMap<>();
			map2.put(0, "=");
			map2.put(1, "!=");
			map2.put(2, ">");// >
			map2.put(3, "<");// <
			map2.put(4, ">=");// >=
			map2.put(5, "<=");// <=
			map2.put(6, "like");
			map2.put(7, "is not null");
			map2.put(8, "is null");
			map2.put(9, "between(in)");
			map2.put(10, "between(not in)");
			map2.put(11, "today");
		}
		public static String getOp(Integer opType) {
			return map.get(opType);
		}
		public static String getOpName(Integer opType) {
			return map2.get(opType);
		}
	}
}
