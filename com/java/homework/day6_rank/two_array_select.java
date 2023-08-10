package com.java.homework.day6_rank;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 23:26
 * @desciption: 二维选择排序
 */
public class two_array_select {
    public static void main(String[] args) {
        int[][] scores = {
                {78, 89, 93}, // 260
                {88, 92, 89}, // 269
                {79, 87, 88}, // 254
                {92, 96, 99}, // 287
                {94, 90, 87}  // 271
        };

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length-1; j++) {
                int min =j;
                for (int k = j+1; k < scores[i].length; k++) {

                    if(scores[i][k]<scores[i][min]){
                        min = k;

                    }

                }
                int tem = scores[i][j];
                scores[i][j] = scores[i][min];
                scores[i][min] = tem;

            }
        }
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
