package com.tnsif.userdefinedannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Features {
	String material() default "Carbon-Fiber";
	int CC() default 200;
	
}
