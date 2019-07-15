package com.spring.odi.framework.util;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringUtil {
private final static String EMPTY_STR = "";
public static final String DFT_DELIMITER = "|";
public static final String DFT_NUMBER = "0";
public static final Boolean isOracle = false;
    /**
     * check the str if it's empty (null or '').
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
    	return false;
    }
    
    public static boolean isNumeric(String str){
        return false;
    }
    /**
     * capitalize the first letter of word
     *
     * @param str
     * @return
     */
    public static String capitalize(String str) {
    	return null;
    }

    /**
     * uncapitalize the first letter of word
     *
     * @param str
     * @return
     */
    public static String uncapitalize(String str) {
        return null;
    }

    public static String escapeHtml(String in) {
        return null;
    }

    public static String escapeJavascript(String in) {
        return null;
    }

    /**
     * target should be string or number
     * source can be array, list or string splitted by '|'
     * @param target
     * @param source
     * @return
     */
    public static boolean isIn(Object target, Object source) {
        return false;
    }

    public static String arrayToString(Object[] array) {
        return null;
    }

    /**
     * return '-' if input string is null or '', otherwise input string.
     *
     * @param in
     * @return
     */
    public static String getNonEmpty(String in) {
        return null;
    }

    /**
     * return '' if input string is null, otherwise input string.
     *
     * @param in
     * @return
     */
    public static String getNonNull(String in) {
        return null;
    }

    public static boolean isDigit(String str) {
    	return false;
    }
    
    public static boolean isValidNumber(String str) {
    	return false;
    }

    /**
     * return sub-string of input string. by default first 120 characters.
     *
     * @param desc
     * @return
     */
    public static String getShortDesc(String desc) {
        return null;
    }

    public static String getShortDesc(String desc, int size) {
        return null;
    }

    public static String[] cut(final String in, final int length) {
        return null;
    }

    public static String replaceLast(String text, String regex, String replacement) {
        return null;
    }

    public static String showTextArea(String val) {
        return null;
    }
    public static String formatTime(){
    	return null;
    }
    /**
     * 产生4位随机数(0000-9999)
     * @return 4位随机数
     */
    public static String getFourRandom(){
        return null;
    }
    public static String contractBindSql(String entity,String key) {
		return null;
	}
    /**
     * 拼接多个like的过滤条件
     * @param entity
     * @param key
     * @param param
     * @return
     */
	public static String contractBindSqlConditionLike(String entity,String key,String param) {
		return null;
	}
	/**
     * 拼接单个like的过滤条件
     * @param entity
     * @param key
     * @param param
     * @return
     */
	public static String contractLike(String entity,String key,String param) {
		return null;
	}
	
	/**
	 * 将参数强制转换为数据库中的数字类型
	 * @param param
	 * @return
	 */
	public static String changeToNumeric(String param) {
		return null;
	}
	
	/**
	 * 将参数强制转换为数据库中的日前类型
	 * @param param
	 * @return
	 */
	public static String changeToDate(String param) {
		return null;
	}
	
	/**
	 * 将参数强制转换为数据库中的日前类型
	 * @param param
	 * @return
	 */
	public static String changeToTime(String param) {
		return null;
	}
	
	/**
	 * 将参数强制转换为数据库中的日期类型
	 * @param param
	 * @return
	 */
	public static String changeToDateTime(String param) {
		return null;
	}

	/**
	 *  数据库加一天
	 * @param days
	 * @param sql
	 * @return
	 */
	public static String addDay(String days,String sql) {
		return null;
	}

	/**
	 *  数据库添加时间戳
	 * @param type
	 * @param sql
	 * @return
	 */
	public static String addTimeStamp(String type,String sql) {
		return null;
	}
	
	/**
	 * 将参数强制转换为数据库中的字符串类型
	 * @param param
	 * @return
	 */
	public static String changeToVarchar(String param) {
		return null;
	}

	/**
	 *  将参数强制转换为数据库中的字符串类型
	 * @param params
	 * @return
	 */
	public static String changeToVarchar(List<String> params) {
		return  null;
	}
	
	/**
	 * 将数据的日期格式格式化为字符串类型
	 * @param param （yyyy-MM-dd）
	 * @return
	 */
	public static String changeDateToVarchar(String param) {
		return null;
	}
	
	/**
	 * 将数据的日期格式格式化为字符串类型
	 * @param param
	 * @param mType
	 * @param oType
	 * @return
	 */
	public static String changeDateToVarchar(String param,String mType,String oType) {
		return null;
	}
	/**
	 * 将数据的日期格式格式化为字符串类型
	 * @param param
	 * @return
	 */
	public static String changeTimeToVarchar(String param) {
		return null;
	}
	
	/**
	 * 将数据的日期格式格式化为字符串类型
	 * @param param
	 * @return
	 */
	public static String changeDateTimeToVarchar(String param) {
		return null;
	}
	
	/**
	 * 强制改变参数的数据类型
	 * @param param
	 * @param type
	 * @param parseType
	 * @return
	 */
	public static String changeJdbcType(String param,String type,String parseType) {
		return null;
	}

	/**
	 *
	 * @param param
	 * @return
	 */
	public static String andSql(String param) {
		return null;
	}
	/**
	 *
	 * @param param
	 * @return
	 */
	public static String likeSql(String key,String param) {
		return null;
	}
	/**
	 * 添加通配符
	 * @param condition
	 * @return
	 */
    public static String like(String condition){
    	return null;
    }
    
    /**
     * 将对象所有的字符串类型由Null改为空字符串
     * @param o
     * @return
     */
    public static Object  changeToNotNull(Object o) {
		return null;
	}
    
    /**
     * 将所有字母大写
     * @param str
     * @return
     */
    public static String getUpperStr(String str) {
    	return "";
    }
    
    /**
     * 将参数改为数据库可识别的字符串类型
     * @param str
     * @return
     */
    public static String changeToString(String str) {
    	return "";
    }
    
    /**
     * 获得当前时间
     * @return
     */
    public static String getNewDate() {
    	return getNewDate("yyyy-MM-dd");
    }
    /**
     * 获得当前时间
     * @return
     */
    public static String getNewDate(String patten) {
    	return null;
    }
    /**
     * 获得当前时间
     * @return
     */
    public static String getNewDateTime() {
    	return getNewDate("yyyy-MM-dd HH:mm:ss");
    }
    /**
     * 获得动态默认数据（#{value}）
     * @param key
     * @return
     */
    public static String getSqlDefaultValue(String key) {
    	return "}";
    }

	public static void main(String[] args) {
System.out.println(StringUtil.likeSql("a","b"));
	}
}
