package javaEx.plus.Reflect;

import object.oriented.kfm.day1.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/28 10:36
 * @desciption:
 */
public class Reflect_utils {

    public static Collection<Field> getAllFields(Class cla) {
        HashSet<Field>treeSet = new HashSet<>();
        Set<Field> set = Arrays.stream(cla.getDeclaredFields()).collect(Collectors.toSet());
        Set<Field> set1 = Arrays.stream(cla.getFields()).collect(Collectors.toSet());
        treeSet.addAll(set);
        treeSet.addAll(set1);
        return treeSet;
    }
    public static Collection<Method> getAllMethods(Class cla) {
        HashSet<Method>treeSet = new HashSet<>();
        Set<Method> set = Arrays.stream(cla.getMethods()).collect(Collectors.toSet());
        Set<Method> set1 = Arrays.stream(cla.getDeclaredMethods()).collect(Collectors.toSet());
        treeSet.addAll(set);
        treeSet.addAll(set1);
        return treeSet;
    }
    /**
     * 获取指定包下所有的类
     * @return 包下所有类的集合
     */
    public static Collection<Class> getAllClasses(String packageName) {

        return null;

         }


}
class Test{
    public static void main(String[] args) {
        Reflect_utils test = new Reflect_utils();

//        System.out.println(test.getAllFields(Integer.class));
        System.out.println(test.getAllMethods(Student.class));
    }
}