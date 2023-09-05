package javaEx.plus.collection.homework.day0905;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/5 20:27
 * @desciption: ## ## 对称差集运算
 *
 * 有两个List集合, 计算两个集合的对称差集元素。
 */
public class exercise4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        Set<String> treeSet= new TreeSet<>();
        treeSet.add("d");
        treeSet.add("e");
        treeSet.add("z");
        treeSet.add("h");
        Set tem = new TreeSet(){};
        tem.addAll(treeSet);
        System.out.println(tem);
        List tem1 = new ArrayList(){};
        tem1.addAll(list);
        System.out.println(tem1);
        //交集
        tem.retainAll(tem1);
        System.out.println("tem"+tem);


        //并集
        list.addAll(treeSet);
        System.out.println("并集:"+list);

        //结果
        list.removeAll(tem);
        System.out.println("对称差集"+list);





    }
}
