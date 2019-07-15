package com.spring.odi.query.common.bean.defaultValue;





import com.spring.odi.framework.util.StringUtil;
import com.spring.odi.query.common.bean.BaseQueryBean;
import org.springframework.cglib.beans.BeanMap;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressWarnings("all")
public abstract class AbstractConditionValue<T,EXT extends BaseQueryBean> extends BaseConditionValue{
	private T t;
	private EXT ext;
	public AbstractConditionValue() {
		
	}
	abstract Object getObject();
	
	abstract String getShortName();


	public Object getFieldValue(String fieldName,Object objectTarget) {
		return null;
	}
	public Object gethandledValue (String fieldName) {
		return null;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}

	public <Ext extends BaseQueryBean>EXT getExt() {
		return ext;
	}

	public <Ext extends BaseQueryBean> void setExt(EXT ext) {
		this.ext = ext;
	}
}
