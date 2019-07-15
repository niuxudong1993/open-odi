package com.spring.odi.query.common.bean.defaultValue;




import com.spring.odi.framework.util.ClassUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

@SuppressWarnings("all")
public class BaseConditionValue {
	public static final BaseConditionValue INSTANCE = new BaseConditionValue();
	public static ConcurrentMap<String, Class> map = new ConcurrentHashMap<>();
	public BaseConditionValue() {
		
	}
}
