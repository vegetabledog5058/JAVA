package com.java.interface_ex;

import java.util.Arrays;
import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/29 20:14
 * @desciption:
 */
public class Linktest {
    public static void main(String[] args) {
        Linked linked = new Linked();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        linked.add("c");
        Linked newlink = (Linked) linked.subList(0,5);
        System.out.println(newlink.toString());
        linked.add(0,"f");
        linked.add(5,"g");
        linked.add(3,"x");
        System.out.println(linked.size());

        System.out.println(linked.toString());

        System.out.println("最后一个索引是"+linked.lastIndexOf("c"));
        System.out.println("第一个索引是"+linked.indexOf("c"));

        System.out.println(linked.toString());
        System.out.println("-------");
//        System.out.println(linked.size());
//        for (int i = 0; i <linked.size(); i++) {
//            System.out.print(linked.get(i)+"\t");
//        }
//       int a = linked.toArray().length;
//        System.out.println(a);
//        //System.out.println(linked.indexOf("a"));
//        //System.out.println(linked.remove("c"));
//        //linked.clear();
//        linked.set(2,"s");
//
//
//        for (int i = 0; i <linked.size(); i++) {
//            System.out.print(linked.get(i)+"\t");
//        }
//
//        System.out.println();
//        System.out.println(linked.toString());
//
//        System.out.println(linked.toString());
//        System.out.println(linked.contains("b"));
//        System.out.println(linked.indexOf("b"));



    }

}
