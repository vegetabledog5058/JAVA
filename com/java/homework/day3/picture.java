package com.java.homework.day3;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/4 21:56
 * @desciption: 循环画图
 */

//一个循环，打印输出一个由字符构成的正方形图案，其中
//        边 长 由 用 户 输 入 确 定 。 要 求 字 符 按 照 以 下 顺 序 循 环 使
//        用：'#', '@', '*'。例如，当边长为 5 时，输出如下
public class picture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) { //行
            if( i==1||i==n) {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("#");
                    } else {
                        System.out.print("@");
                    }


                } System.out.println();


                //中间
            }else {
                for (int j = 1; j <=n; j++) {
                    if (j==1||j==n) {
                        System.out.print("@");
                    }else {
                        System.out.print("*");
                    }

                  } System.out.println();
                }

                }

            }
            }




