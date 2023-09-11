package javaEx.plus.homework.day0905;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/5 20:25
 * @desciption:## 差集运算
 *
 * 有两个List集合, 计算第一个集合对第二个集合的差集元素。
 */
public class exercise3 {
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
        stringList.add("b");
        stringList.add("c");

        list.removeAll(stringList);
        System.out.println(list);
    }
}
