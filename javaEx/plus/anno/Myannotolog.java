package javaEx.plus.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/10/5 14:25
 * @desciption:
 */
@Target({ ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Myannotolog {

}
