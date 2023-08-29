package com.java.interface_ex;

import java.util.Arrays;

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


        System.out.println(linked.size());
        for (int i = 0; i <linked.size(); i++) {
            System.out.print(linked.get(i)+"\t");
        }
//       int a = linked.toArray().length;
//        System.out.println(a);
        System.out.println(linked.indexOf("a"));

    }

}
