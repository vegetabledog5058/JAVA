package com.java.homework.day10String2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/24 22:14
 * @desciption: 给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。
 */
public class Excel {
    public static void main(String[] args) {
        System.out.println(Excel(54));
    }

    public static String Excel(long n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            long yushu = (n - 1) % 26;
            char ge = (char) ('A' + yushu);
            sb.insert(0, ge);  // 插入在开头以保持正确的顺序
            n = (n - 1) / 26;  // 更新 n
        }

        return sb.toString();
    }

        }



