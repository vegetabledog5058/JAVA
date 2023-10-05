package javaEx.plus.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/10/5 11:57
 * @desciption:
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface log {
    int id();
    String value();
}
