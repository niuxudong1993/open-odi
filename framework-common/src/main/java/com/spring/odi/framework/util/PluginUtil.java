package com.spring.odi.framework.util;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.lang.reflect.Proxy;

public final class PluginUtil {

	private PluginUtil() {} // private constructor

	/**
	 * <p>Recursive get the original target object.
	 * <p>If integrate more than a plugin, maybe there are conflict in these plugins, because plugin will proxy the object.<br>
	 * So, here get the orignal target object
	 *
	 * @param target proxy-object
	 * @return original target object
	 */
	public static Object processTarget(Object target) {
		if(Proxy.isProxyClass(target.getClass())) {
			MetaObject mo = SystemMetaObject.forObject(target);
			return processTarget(mo.getValue("h.target"));
		}
		return target;
	}

}
