package com.iglory.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author 84426
 * 自定义注解
 * 
 *
 */
@Target({ElementType.TYPE})  //作用于接口、类、枚举、注解
@Retention(RetentionPolicy.RUNTIME) //注解保留的位置，会在class字节码中存在，在运行时可以通过反射获取
@Documented
@Inherited
public @interface HandlerType {
	String value();
}
