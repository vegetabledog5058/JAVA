package com.java.base_exercise.string.s1;

import java.util.StringTokenizer;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/19 21:27
 * @desciption:
 */
public class substring {
    public static void main(String[] args) {
        String phone = "505831532";
        String q = phone.substring(0,3);
        String h = phone.substring(6);
        String result = q+"***"+h;
        System.out.println(result);

    }
}

