package com.java.homework.day6_rank;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 14:16
 * @desciption: 选择排序
 */
public class two_select {
    public static void main(String[] args) {
        int[][] scores = {
                {78, 89, 93}, // 260
                {88, 92, 89}, // 269
                {79, 87, 88}, // 254
                {92, 96, 99}, // 287
                {94, 90, 87}  // 271
        };
        for (int i = 0; i <scores.length; i++) {
            //System.out.println(scores[i][2]);
            //最小值
            int min =i;
            for (int j = i+1; j < scores.length; j++) {

                if(scores[j][2]>scores[min][2]){
                    min = j;
                }
            }
            int []tem =  scores[i];
            scores[i] = scores[min];
            scores[min] = tem;
        }


        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
