package com.java.string.day1;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/23 11:28
 * @desciption:
 */
public class test2 {
    public static void main(String[] args) {
        String a = "---a-b-c-d--";
        String arr[] =a.split("-");
        System.out.println(Arrays.toString(arr));

    }
}
