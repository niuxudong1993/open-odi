package com.spring.odi.framework.datasource.config;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import com.spring.odi.framework.datasource.bean.DynamicDataSource;
import com.spring.odi.framework.datasource.registrar.DynamicDataSourceRegister;
import com.spring.odi.framework.datasource.registrar.ODIMapperScannerRegistrar;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.source.ConfigurationPropertyName;
import org.springframework.boot.context.properties.source.ConfigurationPropertyNameAliases;
import org.springframework.boot.context.properties.source.ConfigurationPropertySource;
import org.springframework.boot.context.properties.source.MapConfigurationPropertySource;
import org.springframework.boot.jdbc.DatabaseDriver;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.jta.JtaTransactionManager;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

import javax.sql.XADataSource;
import java.util.List;

@Component
public class DataSourceConfig implements BeanClassLoaderAware {

	private ClassLoader beanClassLoader;
	
	protected XADataSource createXaDataSource(DataSourceProperties properties) {
		String className = properties.getXa().getDataSourceClassName();
		if (!StringUtils.hasLength(className)) {
			className = DatabaseDriver.fromJdbcUrl(properties.determineUrl())
					.getXaDataSourceClassName();
		}
		Assert.state(StringUtils.hasLength(className),
				"No XA DataSource class name specified");
		XADataSource dataSource = createXaDataSourceInstance(className);
		bindXaProperties(dataSource, properties);
		return dataSource;
	}

	private XADataSource createXaDataSourceInstance(String className) {
		try {
			Class<?> dataSourceClass = ClassUtils.forName(className, this.beanClassLoader);
			Object instance = BeanUtils.instantiateClass(dataSourceClass);
			Assert.isInstanceOf(XADataSource.class, instance);
			return (XADataSource) instance;
		}
		catch (Exception ex) {
			throw new IllegalStateException(
					"Unable to create XADataSource instance from '" + className + "'");
		}
	}

	private void bindXaProperties(XADataSource target,
			DataSourceProperties dataSourceProperties) {
		Binder binder = new Binder(getBinderSource(dataSourceProperties));
		binder.bind(ConfigurationPropertyName.EMPTY, Bindable.ofInstance(target));
	}

	private ConfigurationPropertySource getBinderSource(
			DataSourceProperties dataSourceProperties) {
		MapConfigurationPropertySource source = new MapConfigurationPropertySource();
		source.put("user", dataSourceProperties.determineUsername());
		source.put("password", dataSourceProperties.determinePassword());
		source.put("url", dataSourceProperties.determineUrl());
		source.putAll(dataSourceProperties.getXa().getProperties());
		ConfigurationPropertyNameAliases aliases = new ConfigurationPropertyNameAliases();
		aliases.addAliases("user", "username");
		return source.withAliases(aliases);
	}
	@Bean(value = "defaultDataSource")
	@Primary
	public DynamicDataSource getDynamicDataSource(ApplicationContext applicationContext) {
		DynamicDataSourceRegister register = new DynamicDataSourceRegister();
		return register.registerBeanDefinitions(applicationContext);
	}

	@Bean(name = "jdbcTemplate")
	public JdbcTemplate jdbcTemplate(DynamicDataSource dataSource) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		return jdbcTemplate;
	}
	@Bean(name = "atomikosTransactionManager", initMethod = "init", destroyMethod = "close")
	public UserTransactionManager atomikosTransactionManager() {
		UserTransactionManager atomikosTransactionManager = new UserTransactionManager();
		atomikosTransactionManager.setForceShutdown(true);
		return atomikosTransactionManager;
	}

	@Bean(name = "atomikosUserTransaction")
	public UserTransactionImp atomikosUserTransaction() {
		UserTransactionImp atomikosUserTransaction = new UserTransactionImp();
		try {
			atomikosUserTransaction.setTransactionTimeout(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return atomikosUserTransaction;
	}
	@Bean(name = "transactionManager")
	public JtaTransactionManager transactionManager(UserTransactionManager atomikosTransactionManager,
													UserTransactionImp atomikosUserTransaction) {
		JtaTransactionManager transactionManager = new JtaTransactionManager();
		transactionManager.setTransactionManager(atomikosTransactionManager);
		transactionManager.setUserTransaction(atomikosUserTransaction);
		transactionManager.setAllowCustomIsolationLevels(true);
		return transactionManager;
	}
	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		this.beanClassLoader=classLoader;
	}
}
