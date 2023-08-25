package com.java.homework.day10String2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/24 20:56
 * @desciption:
 */
public class Longest_qinazhui {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        StringBuilder sb = new StringBuilder(strs[0]);
        sb.deleteCharAt(strs[0].length() - 1 - 0);
        sb.deleteCharAt(strs[0].length() - 1 - 1);
//        sb.deleteCharAt(strs[0].length() - 1 - 2);
//        System.out.println(sb);
//        System.out.println(strs[1]);
//        System.out.println(sb.toString().equals(strs2[1]));
        // System.out.println(sb.length());


        String result = Long(strs2);
        System.out.println(result);
    }

    public static String Long(String[] strs) {

        int index = 1;
        int i = 0;
        StringBuilder sb = new StringBuilder(strs[0]);
        while (index < strs.length) {
            int length = Math.min(sb.length(), strs[index].length());  // 获取较小的长度

            if (sb.toString().equals(strs[index].substring(0, length))) {
                //true
                index++;
                continue;
            } else {
                //false
                if (i != strs[0].length() - 1) {
                    sb.deleteCharAt(strs[0].length() - 1 - i);
                    i++;
                    continue;
                } else {
                    return "";
                }
            }


        }
        return sb.toString();
    }

}
