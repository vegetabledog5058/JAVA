package javaEx.plus.homework.day0905;

import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/5 19:57
 * @desciption:## 交集计算
 * 有两个List集合, 计算两个集合的交集元素。
 */
public class exercise2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("e");
        list.add("a");
        list.add("b");
        list.add("b");
        Set<String> stringList = new TreeSet<>();
        stringList.add("a");
        stringList.add("d");
        stringList.add("c");


//        String arr[] = stringList.toArray(new String[stringList.size()]);
//        String array[] = stringList.toArray(arr);
//        //System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(array));
        list.retainAll(stringList);
        System.out.println(list);


    }
}
