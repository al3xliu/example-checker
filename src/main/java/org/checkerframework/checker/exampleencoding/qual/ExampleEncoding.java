package org.checkerframework.checker.exampleencoding.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

/**
 * The value is definitely TODO. It is safe to use for TODO.
 */
@Documented
@SubtypeOf({ExampleEncodingUnknown.class})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface ExampleEncoding {
    String[] value() default {};
}
