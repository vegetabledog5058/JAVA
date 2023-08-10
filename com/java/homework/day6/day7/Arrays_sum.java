package com.java.homework.day6.day7;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/9 20:15
 * @desciption: 计算总分
 */
public class Arrays_sum {

        public static void main(String[] args) {
        /*
            多维数组排序
               每个同学有三门课的成绩分别是数组的 1 2 3 个元素
              一个班有 5 个同学，按他们的总成绩输出每个同学的各科成绩

              92 96 99
              94 90 87

         */

            int[][] scores = {
                    {78, 89, 93}, // 260
                    {88, 92, 89}, // 269
                    {79, 87, 88}, // 254
                    {92, 96, 99}, // 287
                    {94, 90, 87}  // 271
            };

            // 对成绩进行排序
            // 将每位同学成绩的和放到新数组中
            int[] sumArr = new int[scores.length];

            for (int i = 0; i < scores.length; i++) {
                int sum = 0;
                for (int j = 0; j < scores[i].length; j++) {
                    sum += scores[i][j];
                }
                sumArr[i] = sum;
            }

            // 对总分数组排序
            for (int i = 0; i < sumArr.length - 1; i++) {
                for (int j = 0; j < sumArr.length - 1 - i; j++) {
                    if (sumArr[j] < sumArr[j + 1]){
                        // 换总分顺序
                        int temp = sumArr[j];
                        sumArr[j] = sumArr[j + 1];
                        sumArr[j + 1] = temp;
                        // 换各科的顺序
                        int[] score = scores[j];
                        scores[j] = scores[j + 1];
                        scores[j + 1] = score;
                    }
                }
            }

//        System.out.println(Arrays.toString(sumArr));


            // 遍历输出
            for (int i = 0; i < scores.length; i++) {
                for (int j = 0; j < scores[i].length; j++) {
                    System.out.print(scores[i][j] + "\t");
                }
                System.out.println();
            }
        }

}
