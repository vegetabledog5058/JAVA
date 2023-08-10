package com.java.methods;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 22:46
 * @desciption: 测试
 */
public class test {
    public static void main(String[] args) {
        int[] numbers = {45,65,21,31,12};
        System.out.println("利用for——each语句打印数组的内容");
        // for-each语句
        for (int abc : numbers) {
           abc = 48;

            System.out.println("数组中的内容为" + abc);
        }
        System.out.println(numbers[0]);
    }

}
