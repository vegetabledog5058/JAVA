package com.java.basis.comprehensive;

import java.util.Arrays;
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

        int ball[] = random();
        System.out.println("========================================================");
        System.out.println(Arrays.toString(ball));
        System.out.println("========================================================");
        int input[] = input();
       int redcount = 0;
       int bluecount =0;
        for (int i = 0; i < input.length-1 ; i++) {
            int redcountnum =i;
            for (int j = 0; j < ball.length-1; j++) {
                if(redcountnum==ball[j]){
                    redcount++;
                    break;
                }

            }
        }
        int bluecountnum = input[input.length-1];
        if (bluecountnum==ball[ball.length-1]){
            bluecount++;
        }
        System.out.println("红色中奖数为:"+redcount);
        System.out.println("蓝色中奖数为:"+bluecount);


    }

    public static int[] input() {
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个数字");
            int a = sc.nextInt();
            if (a >= 1 && a <= 33) {
                boolean flag = repeat(arr, a);
                if (!flag) {
                    arr[i] = a;
                    i++;
                } else {
                    System.out.println("红球已经存在请重新输入");
                }
            } else {
                System.out.println("超出范围");
            }

        }
        System.out.println("请输入篮球号码");
        while (true) {

            int blue = sc.nextInt();
            if (blue >= 1 && blue <= 16) {
                arr[arr.length - 1] = blue;
                break;
            } else {
                System.out.println("超出范围");
            }
        }
        return arr;

    }

    public static int[] random() {
        Random r = new Random();
        int[] red = new int[7];
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
