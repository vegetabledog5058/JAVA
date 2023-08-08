package com.java.basis.comprehensive;

import java.util.Random;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 7:35
 * @desciption: 模拟双色球
 */
public class two_color_ball {
    public static void main(String[] args) {
//
        int arr[] = random();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int[] random() {
        Random r = new Random();
        int[] red = new int[7];
        int[] newarr = new int[red.length];
        for (int i = 0; i < 6; ) {
            int ball = r.nextInt(33) + 1;
            if (!repeat(red, ball)) {
                red[i] = ball;
                i++;
            }
        }
        int blue = r.nextInt(16) + 1;
        red[red.length - 1] = blue;
        return red;

    }

    public static boolean repeat(int arr[], int ball) {
        for (int i = 0; i < arr.length; i++) {
            if (ball == arr[i]) {
                return true;
            }
        }
        return false;
    }

}
