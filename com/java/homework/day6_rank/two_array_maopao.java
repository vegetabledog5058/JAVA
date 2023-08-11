package com.java.homework.day6_rank;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 19:26
 * @desciption: 二维数组排序
 */
public class two_array_maopao {
    public static void main(String[] args) {
        int[][] scores = {
                {78, 89, 93}, // 260
                {88, 92, 89}, // 269
                {79, 87, 88}, // 254
                {92, 96, 99}, // 287
                {94, 90, 87}  // 271
        };

        //遍历每一个数组
        for (int i = 0; i < scores.length; i++) {
            //进行每个数组内排序
            for (int j = 0; j < scores[i].length - 1; j++) {
                for (int k = 0; k < scores[i].length-1-j ; k++) {
                    if (scores[i][k] < scores[i][k + 1]) {
                        int tem = scores[i][k];
                        scores[i][k] = scores[i][k + 1];
                        scores[i][k + 1] = tem;
                    }
                }

            }

        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(Arrays.toString(scores[i]));


        }
    }
    }