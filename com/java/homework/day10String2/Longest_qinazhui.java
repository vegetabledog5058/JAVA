package com.java.homework.day10String2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/24 20:56
 * @desciption:
 */
public class Longest_qinazhui {
    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};
        String[] arr2 = {"dog", "racecar", "car"};
        StringBuilder sb = new StringBuilder(arr[0]);
        sb.deleteCharAt(arr[0].length() - 1 - 0);
        sb.deleteCharAt(arr[0].length() - 1 - 1);
//        sb.deleteCharAt(arr[0].length() - 1 - 2);
//        System.out.println(sb);
//        System.out.println(arr[1]);
//        System.out.println(sb.toString().equals(arr2[1]));
        // System.out.println(sb.length());


        String result = Long(arr2);
        System.out.println(result);
    }

    public static String Long(String[] arr) {

        int index = 1;
        int i = 0;
        StringBuilder sb = new StringBuilder(arr[0]);
        while (index < arr.length) {
            int length = Math.min(sb.length(), arr[index].length());  // 获取较小的长度

            if (sb.toString().equals(arr[index].substring(0, length))) {
                //true
                index++;
                continue;
            } else {
                //false
                if (i != arr[0].length() - 1) {
                    sb.deleteCharAt(arr[0].length() - 1 - i);
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
