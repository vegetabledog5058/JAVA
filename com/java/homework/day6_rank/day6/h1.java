package com.java.homework.day6_rank.day6;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 18:38
 * @desciption: 输出成绩
 */

public class h1 {
    public static void main(String[] args) {
        //一个班级有若干学生，每个学生的成绩以整数表示。请实现一个程序，根据学生的成绩对
//        他们进行排名并输出。
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "位学生成绩：");
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length - 1; j++) {
            for (int n = 0; n < arr.length - 1 - j; n++) {
                if (arr[n] < arr[n + 1]) {
                    int temp = arr[n + 1];
                    arr[n + 1] = arr[n];
                    arr[n] = temp;
                }
            }
        }
        System.out.println("排名" + "\t" + "成绩");
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "\t" + arr[i]);
        }
    }
}
