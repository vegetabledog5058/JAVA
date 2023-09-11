package javaEx.plus.homework.day0905;

import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/5 21:08
 * @desciption: ## 并集  有两个List集合, 计算两个集合的并集元素
 */
public class Exeercise5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        Set<String> hashSet= new HashSet<>();
        hashSet.add("d");
        hashSet.add("e");
        hashSet.add("z");
        hashSet.add("h");
        list.addAll(hashSet);
        System.out.println("并集:"+list);
    }
}
