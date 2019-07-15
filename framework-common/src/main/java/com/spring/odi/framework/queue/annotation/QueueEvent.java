package com.spring.odi.framework.queue.annotation;

import java.lang.annotation.*;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QueueEvent {
}
