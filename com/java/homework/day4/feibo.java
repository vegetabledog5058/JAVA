package com.java.homework.day4;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/6 23:42
 * @desciption: 斐波那契数列
 */
public class feibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = 1;
        int h = 1;
        int i = 0;
        while (n !=0) {
            if (i < 2) {
                System.out.println(1);
                n--;
            } else {
                if (i == q + h) {
                    q = i;
                    q = q ^ h;
                    h = q ^ h;
                    q = q ^ h;
                    System.out.println(i);
                    n--;
                }

            }

            //n必须在上述两者条件满足其一再减
            i++;

        }

    }
}

