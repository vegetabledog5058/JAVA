package com.java.homework.day9_string;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/23 18:56
 * @desciption:输入一个电子邮箱，判断是否是正确电子邮箱地址。 正确的邮箱地址：
 * 必须包含 @ 字符，不能是开头或结尾
 * 必须以 .com结尾
 * @和.com之间必须有其他字符
 */
public class address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = booladd(input) ? "格式正确" : "格式错误";
        System.out.println(result);

    }

    public static boolean booladd(String str) {
        boolean flag = str.substring(str.length() - 4).equals(".com");
        boolean flag1 = str.indexOf('@')!=0&&str.lastIndexOf("@")!=str.length()-1;
        boolean flag2 = false;
        int result = str.substring(1,str.length()-6).lastIndexOf('@');
        if(result!=-1){
            if(!str.substring(1,result).isBlank()){
                flag2 = true;
            }
        }
            return flag2&&flag&&flag1;
        }

    }

