package com.spring.odi.query.common.util;

import com.spring.odi.framework.util.StringUtil;
import com.spring.odi.query.common.po.Template;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlFormateUtil {

	public static void main(String[] args) {
		SqlFormateUtil util = new SqlFormateUtil();
		String sql = " select * from dual where ((concat(ifnull(a,''),ifnull(b.''),ifnull(c,'')) like #{currentUser.username}) or ('c' = #{currentUser.type} and date_formate(d1,'%y-%M-%d) = date_formate(d2,'%y-%M-%d))))";
		System.out.println(util.format(SqlFormateUtil.replaceParamInit(sql)));
		System.out.println(util.getConditionItems());
	}
}