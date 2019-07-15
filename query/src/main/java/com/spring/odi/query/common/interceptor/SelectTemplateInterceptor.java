package com.spring.odi.query.common.interceptor;

import com.spring.odi.framework.util.PluginUtil;
import com.spring.odi.query.common.bean.TemplateParameter;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

@SuppressWarnings("all")
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class, Integer.class }) })
public class SelectTemplateInterceptor implements Interceptor {
	private Properties properties;

	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		return null;
	}

	@Override
	public Object plugin(Object target) {
		return null;
	}

	@Override
	public void setProperties(Properties properties) {
		this.properties = properties;

	}

	private String getPageSql(Integer maxRowsInNoPage, String sql) {
		return null;
	}
}
