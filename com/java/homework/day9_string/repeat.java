package com.java.homework.day9_string;

import javax.xml.transform.Result;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/23 21:01
 * @desciption:去除重复字符 编写一个程序，去除字符串中的重复字符
 */
public class repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int a = 0;
        String result = distinct(input);
        System.out.println(result);
    }

    public static String distinct(String str) {
        String result = str;
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            if (str.indexOf(b) == str.lastIndexOf(b)) {
                continue;
            } else {

                int index = str.lastIndexOf(b);
                result = str.substring(0, index ) + str.substring(index+1, str.length());


            }

            }if (result.equals(str)) {
            return result;
        }
        return distinct(result);
    }
}
