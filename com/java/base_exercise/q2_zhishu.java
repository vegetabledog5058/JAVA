package com.java.base_exercise;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/15 8:23
 * @desciption: 输出101-200素数
 */
public class q2_zhishu {
    public static void main(String[] args) {
        /*题目：判断101-200之间有多少个素数，并输出所有素数。
        程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，
        如果能被整除， 则表明此数不是素数，反之是素数。*/

    /*   很low的程序
    outer: for (int i = 101; i < 200; i++) {
            for (int j = 2; j <i/2 ; j++) {
                if(i%j==0){
                    continue outer;
                }
            }

               System.out.println(i);
        }
    }*/
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("输入数字范围如101-200");
        bool(m,n);
        //判断是否素数

    }
    public static void bool(int m,int n){
        outer:
        for (int i = m; i <=n; i++) {
            double num = Math.sqrt(i);
            for (int j = 2; j <=num; j++) {
                if (i % j == 0) {
                    continue outer;
                }

            }

            System.out.print(i+" ");

        }
    }
    public static void printNum(){

    }
}
