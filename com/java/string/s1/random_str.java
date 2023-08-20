package com.java.string.s1;

import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 16:29
 * @desciption:
 */
public class random_str {
    public static void main(String[] args) {
        String str = "abcde";
        Random r = new Random();
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
           int index =  r.nextInt(arr.length) ;
           char tem = arr[i];
           arr[i]= arr[index];
           arr[index] = tem;
        }
        String newstr = new String(arr);
        System.out.println(newstr);
    }
}
