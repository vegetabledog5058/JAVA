package com.java.homework.day7;

import com.java.homework.day2.tri;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 20:54
 * @desciption: arrays_fill填充数组写出杨辉三角形
 */
/*
        杨辉三角
           1          0
           1 1        1
           1 2 1      2
           1 3 3 1
           1 4 6 4 1
           1 5 10 10 5 1

           1. 每行元素个数是 下标 + 1
           2. 每行第一个和最后一个是 1, 其余元素的值为其上一行的元素 + 上一行元素的前一个元素
         */
public class yanghui_tri2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tri = new int[n][];
        for (int i = 0; i < tri.length; i++) {
            tri[i] = new int[i + 1];
            Arrays.fill(tri[i], 1);
            // j = 1 每行的第一个元素跳过, j < nums[i].length - 1 跳过最后一个  i > 1 跳过前两行
            for (int j = 1; i>1&&j < tri[i].length-1; j++) {
                tri[i][j] = tri[i-1][j-1]+tri[i-1][j];
            }

        }

        for (int i = 0; i < tri.length; i++) {
            for (int j = 0; j < tri[i].length; j++) {
                System.out.print(tri[i][j] + "\t");

            }
            System.out.println();
        }
    }
}
