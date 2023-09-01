package com.java.base_exercise.string.s1;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/19 10:15
 * @desciption:翻转字符串
 */
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newstr = re1(str);
        String newstr1 = dou(str);
        System.out.println(newstr1);
    }
    public static String re1(String str){
        // 翻转遍历顺序
        String fir = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char a = str.charAt(i);
            fir= fir+a;
        }
        return fir;
    }
    //双指针交换位置
    public static String dou(String str){
        char []arr = str.toCharArray();
        String fir = "";
        for (int i = 0,j=arr.length-1; i<j; i++,j--) {
            char tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;

        }
        //第一种拼接方法:字符串拼接
       /* for (int i = 0; i < arr.length; i++) {
            fir+= arr[i];
        }*/
        String newfir = new String(arr);

        return newfir;
    }

}
