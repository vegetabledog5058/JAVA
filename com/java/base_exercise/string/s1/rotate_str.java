package com.java.base_exercise.string.s1;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 15:25
 * @desciption:计算翻转几次可以达到目标数组
 */
public class rotate_str {
    static String targetStr = "dfgas";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "asdfg";
        int seconds = rotate(a);
        if (boolsame(a)) {
            System.out.println(0);
        } else {
            if (-1 == rotate(a)) {
                System.out.println("不匹配");
            } else {
                System.out.println(seconds);
            }
        }
    }

    public static int rotate(String a) {
        int count = 0;
        while (count < a.length()) {
            // char fir = a.charAt(count++);
            String fir = a.substring(0, ++count);
            String newa = a.substring(count);
            String fin = "" + newa + fir;
            if (boolsame(fin)) {
                return count;
            }
        }
        return -1;
    }

    public static boolean boolsame(String fin) {
        if (fin.equals(targetStr)) {
            return true;
        }
        return false;
    }
}
