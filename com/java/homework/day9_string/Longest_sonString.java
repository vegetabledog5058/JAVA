package com.java.homework.day9_string;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/23 22:43
 * @desciption: 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Longest_sonString {
    public static void main(String[] args) {

        String str = "pwwkew";
        String str4 = "abcabcd";
        String str2 = "dvdf";

//        String sub = subString(str);
        String sub = mySubString(str2);
        System.out.println(sub);

    }

    public static String baolipojie(String str) {
        String max = "";
        for (int start = 0; start < str.length(); start++) {
            String sub = str.substring(start, start + 1);
            for (int end = start + 1; end < str.length(); end++) {
                String current = str.substring(end, end + 1);

                if (sub.contains(current)) {
                    if (sub.length() > max.length()) {
                        max = sub;
                    }
                    break;
                } else {
                    sub += current;
                }
            }
        }
        return max;
    }

    public static String subString1(String str) {
        String max = "";
        int start = 0;
        for (int i = 1; i < str.length(); i++) {
            //子串
            String a = str.substring(start, i);
            //当前位置
            String current = str.substring(i, i + 1);
            if (a.indexOf(current) != -1) {
                if (max.length() < a.length()) {
                    max = a;
                }
                start = str.indexOf(current, start) + 1;
                if (max.length() > str.length() - start - 1) {
                    break;
                }
            } else if (i == str.length() - 1) {
                a = str.substring(start);
                if (max.length() < a.length()) {
                    max = a;
                }
            }


        }

        return max;
    }


    public static String subString(String str) {
        String max = ""; // 存储最长子串
        int start = 0; // 子串的起始下标
        for (int end = start + 1; end < str.length(); end++) {
            // 子串的范围
            String sub = str.substring(start, end);
            // 当前位置的字符
            String current = str.substring(end, end + 1);
            // 当前位置的字符是否在子串中存在
            if (sub.indexOf(current) != -1) {
                // 当前子串和目前最大子串谁大
                if (sub.length() > max.length()) {
                    max = sub;
                }

                // 找下一个子串的开始坐标
//                str.indexOf(current);  sub.indexOf()
                start = str.indexOf(current, start) + 1;

                // 最长子串比剩下的长度还长
                if (max.length() > str.length() - start - 1) {
                    break;
                }
            } else if (end == str.length() - 1) { // 不存在并且是最后一个
                sub = str.substring(start); // 一直到最后一个都没有重复的
                // 当前子串和目前最大子串谁大
                if (sub.length() > max.length()) {
                    max = sub;
                }
            }

        }
        return max;
    }

    public static String mySubString(String s) {
        s=s+" ";
        String max = "";
        int start = 0;
        for (int end = start + 1; end < s.length(); end++) {
            String sub = s.substring(start, end);
            char current = s.charAt(end);
            if (sub.indexOf(current) != -1||end==s.length()-1) {
                if (max.length() < sub.length()) {
                    max = sub;

                }
                start = s.indexOf(current, start) + 1;

            }
        }
        return max;
    }
}