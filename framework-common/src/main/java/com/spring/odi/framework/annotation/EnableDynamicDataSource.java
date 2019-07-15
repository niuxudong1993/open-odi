package com.spring.odi.framework.annotation;

import com.spring.odi.framework.datasource.registrar.DynamicDataSourceRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({java.lang.annotation.ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({DynamicDataSourceRegister.class})
public @interface EnableDynamicDataSource {
}