package com.java.homework.day6_rank;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 14:11
 * @desciption: 插入排序
 */
public class two_insert {
    public static void main(String[] args) {
        int[][] scores = {
                {78, 89, 93}, // 260
                {88, 92, 89}, // 269
                {79, 87, 88}, // 254
                {92, 96, 99}, // 287
                {94, 90, 87}  // 271
        };
        int left = 0;
        int right = scores.length - 1;
        for (int i = 1; i < scores.length; i++) {
            int index = i - 1;
            int cur = scores[i][0];
            while (index >= 0 && cur > scores[index][0]) {

                scores[index + 1][0] = scores[index][0];
                index--;
            }
            scores[index + 1][0] = cur;

            //遍历
        }
        for (int i = 0; i < scores.length; i++) {
            System.out.println(Arrays.toString(scores[i]));
        }
    }
}
