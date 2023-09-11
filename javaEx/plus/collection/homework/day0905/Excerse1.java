package javaEx.plus.collection.homework.day0905;

import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/5 18:48
 * @desciption: ## 去重统计  使用一个List集合存储多个元素。计算集合中共有多少个不重复元素并输出。
 */
public class Excerse1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("e");
        list.add("a");
        list.add("b");
        list.add("b");
        System.out.println("元素:"+list);



        Set<String> hashSet = new HashSet<>(list);
        //System.out.println(hashSet);
        Set<String> treeSet = new TreeSet<>(list);
        System.out.println("元素个数:"+treeSet.size());
        System.out.println(treeSet);
        //System.out.println(hashSet);





    }
}
