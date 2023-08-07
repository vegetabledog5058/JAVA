package com.java.homework.day5;

import java.util.Random;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 16:30
 * @desciption: 筛选数组中倍数输出
 */
public class h4 {
    public static void main(String[] args) {
        int []arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入5个1-60的数字");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Random r = new Random();
        int a = r.nextInt(9)+2;
        System.out.println("随机数是"+a);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%a!=0){
                System.out.println(arr[i]);
            }
        }




    }
}
