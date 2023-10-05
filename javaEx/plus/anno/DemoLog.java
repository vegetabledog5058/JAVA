package javaEx.plus.anno;

import EX_JDBC.EXAM0923.Log;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/10/5 14:03
 * @desciption:
 */
public class DemoLog {
    @log(id = 1,value = "测试方法")
    public void test() {
        // 在这里添加方法的实现
    }
}
class test{
    public static void main(String[] args) {
        Class<DemoLog>demoLogClass = DemoLog.class;
        try {
            Method test = demoLogClass.getMethod("test");
            log(test);

        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    public static void log(Method method){
        log annotation = method.getAnnotation(log.class);
        if (annotation != null){
            // 有 Log 注解
            String value = annotation.value();

            System.out.println(value);
        }
    }
}
