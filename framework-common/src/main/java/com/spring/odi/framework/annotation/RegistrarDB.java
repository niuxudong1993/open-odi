package com.spring.odi.framework.annotation;

import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RegistrarDB {
    String prefix() default "";
}
