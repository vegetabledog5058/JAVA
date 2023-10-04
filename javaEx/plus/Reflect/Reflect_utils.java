package javaEx.plus.Reflect;


import javaEx.plus.collection.Student;

import java.io.File;

import java.io.FileFilter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
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
        HashSet<Field> treeSet = new HashSet<>();
        Set<Field> set = Arrays.stream(cla.getDeclaredFields()).collect(Collectors.toSet());
        Set<Field> set1 = Arrays.stream(cla.getFields()).collect(Collectors.toSet());
        treeSet.addAll(set);
        treeSet.addAll(set1);
        return treeSet;
    }

    public static Method[] getAllMethod(Class cla) {
        // 保存所有的方法
        List<Method> result = new ArrayList<>();
        // 1. 获取类中声明的方法
        Method[] methods = cla.getDeclaredMethods();
        result.addAll(List.of(methods));

        // 2. 获取父类中的方法
        List<Method> parentMethod = getParentMethods(cla);

        // 添加到结果集中
        result.addAll(parentMethod);

        return result.toArray(new Method[]{});
    }

    private static List<Method> getParentMethods(Class cla) {
        List<Method> result = new ArrayList<>();
        Class superclass = cla.getSuperclass();
        if (superclass != null) {
            Method methods[] = superclass.getDeclaredMethods();
            //获取父类非私有
            Object supermethods[] =
                    Arrays.stream(methods).filter(method -> !Modifier.isPrivate(method.getModifiers())).toArray();
            List<Method> parentmethod = getParentMethods(superclass);
            result.addAll(parentmethod);

        }
        return result;
    }

    /**
     * 获取指定包下所有的类
     *
     * @return 包下所有类的集合
     */
    public static Collection<Class> getAllClasses(String packageName) throws ClassNotFoundException {

        List<Class> list = new ArrayList<>();
        String packagePath = packageName.replace(".", "/");
        //当前主线程的类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        //获取包url路径
        URL url = classLoader.getResource(packagePath);
        //得到文件url
        File file = new File(url.getFile());
        if(!file.exists()){
            return null;
        }

        if (file.isDirectory() && file.exists()) {
            List<File> listClass = getPackage(file);
//            Iterator iterator = listClass.iterator();
//            while (iterator.next()!=null) {
//                List<Class<?>> classes = Arrays.stream(iterator.getClass().getDeclaredClasses()).toList();
//                list.addAll(classes);
//            }
            for (int i = 0; i < listClass.size(); i++) {
                String className = packageName + "." + listClass.get(i).getName().replace(".class", "");
                Class<?> clazz = Class.forName(className);
                list.add(clazz);

                Class<?>[] innerClasses = clazz.getDeclaredClasses();
                for (Class<?> innerClass : innerClasses) {
                    list.add(innerClass);
                }
            }
        }
        return list;

    }

    /**
     * 递归得到一个包内的所有类文件
     */
    private static List<File> getPackage(File file) {
        List<File> list = new ArrayList();
        File files[] = file.listFiles();
        if (files != null) {
            for (File tem : files) {
                if (tem.isDirectory()) {
                    list.addAll(getPackage(tem));
                }
                list.add(tem);
            }
        }
        return list;
    }

}


class Test {
    public static void main(String[] args) {
        Reflect_utils test = new Reflect_utils();

//        System.out.println(Reflect_utils.getAllClasses("com.java").size());
        List list = null;
        try {
            list = Reflect_utils.getAllClasses("LeetCode").stream().toList();
            System.out.println(list.size());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


//        System.out.println(test.getAllFields(Integer.class));
//        System.out.println(Arrays.toString(test.getAllMethod(Student.class)));


    }
}