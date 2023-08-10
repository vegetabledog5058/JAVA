package com.java.homework.day7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 16:48
 * @desciption: 二维数组求其和
 */
  /*
          有一个 n * m 的二维数组（n 表示二维数组的长度， m 表示二维数组每个元素的长度）
          1. 找出最小值是多少
          2. 计算以最小值为中心其 9宫格内所有元素的和
            如果最小值在边界则不存在的按 0 计算
         */
public class two_arr_p1 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        //生成数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = r.nextInt(10)+1;
            }
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        //遍历找到最小值
        int numi =0;
        int numj=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[numi][numj]<arr[i][j]){
                    numi = i;
                    numj =j;
                }
            }
        }

        System.out.print("i的值为:"+numi+" ");
        System.out.println("j的值为:"+numj);

        //左上
        int tl = 0, t = 0, tr = 0, l = 0, rh = 0, bl = 0, b = 0, br = 0;
        if(numi-1>=0&&numj-1>=0){
            tl = arr[numi-1][numj-1];

        }
        //上
        if(numi-1>=0){
            t= arr[numi-1][numj];

        }
        //右上
        if(numi-1<=0&&numj+1>=m){
            tr = arr[numi-1][numj+1];

        }
        //右
        if(numj+1<=m){
            rh= arr[numi][numj+1];

        }
        //右下
        if(numi+1<=n&&numj+1<=m){
            br = arr[numi+1][numj+1];
        }
        //下
        if(numi+1<=n){
            b = arr[numi+1][numj];

        }
        //左下
        if(numi+1<=n&&numj-1>=0){
            bl= arr[numi+1][numj-1];

        }
        //左
        if(numj-1>=0){
            l = arr[numi][numj-1];

        }
        int sum = tl + t + tr + l + arr[numi][numj] + rh + bl + b + br;


        System.out.println(sum);



    }
}
