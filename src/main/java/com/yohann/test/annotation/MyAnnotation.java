package com.yohann.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p>
 * MyAnnotation
 * </p >
 *
 * @author yuhui.fan
 * @since 2023/12/18 13:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {

    String value() default "Default Value";

    int count() default 1;
}
