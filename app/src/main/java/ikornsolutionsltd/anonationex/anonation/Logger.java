package ikornsolutionsltd.anonationex.anonation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Ikorn Solutions Co.,Ltd ... on 28-Dec-16.
 * All rights reserved
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Logger {
    String logger() default "unknow";
}
