package com.java.homework.day7;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/9 19:43
 * @desciption: 数组排序
 */
public class two_array_cal {
    public static void main(String[] args) {
        String[] names = {"安琪拉", "王昭君", "蔡文姬", "妲己", "张良"};
        String[] courses = {"C++", "JAVA", "PYthon"};
        int[][] scores = {
                {90, 89, 78},
                {59, 40, 100},
                {100, 99, 80},
                {80, 61, 61},
                {60, 100, 99}
        };



        int[] newarr = {89, 40, 99, 61, 100};
        for (int i = 0; i < newarr.length - 1; i++) {
            for (int j = 0; j < newarr.length - 1 - i; j++) {
                if (newarr[j] < newarr[j + 1]) {
                    int tem = newarr[j];
                    newarr[j] = newarr[j + 1];
                    newarr[j + 1] = tem;

                    int[] sco = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = sco;

                    String nam = names[j];
                    names[j] = names[j+1];
                    names[j+1] = nam;
                }
            }
        }
        //=========================================//
//        int[] sumArr = new int[scores.length];
//        for (int i = 0; i < scores.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < scores[i].length; j++) {
//                sum += scores[i][j];
//            }
//            sumArr[i] = sum;
//
//        }
//        System.out.println(Arrays.toString(sumArr));
//        for (int i = 0; i < sumArr.length; i++) {
//            for (int j = 0; j < sumArr.length-1-i ; j++) {
//                if(sumArr[j]<sumArr[j+1]){
//                    int tem = sumArr[j];
//                    sumArr[j] = sumArr[j+1];
//                    sumArr[j+1] = tem;
//
//                    int []sco = scores[j];
//                    scores[j] = scores[j+1];
//                    scores[j+1] = sco;
//
//                    String nam = names[j];
//                    names[j] = names[j+1];
//                    names[j+1] = nam;
//
//                }
//            }
//
//        }
        JAVA(scores, names, courses);


    }


    public static void JAVA(int scores[][], String names[], String courses[]) {
        for (int i = 0; i < scores.length; i++) {
            System.out.print(names[i] + " => "); // 输出学生姓名
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(courses[j] + ":");// 输出课程名称
                System.out.print(scores[i][j]); // 输出课程成绩
                if (j < scores[i].length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.println();
        }


    }
}