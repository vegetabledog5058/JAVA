package com.java.homework.day5;

import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 17:48
 * @desciption: 反转数组
 */
public class h10 {
    public static void main(String[] args) {
        int []arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("新数组");
        int []tem = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tem[i]=arr[arr.length-1-i];
            System.out.print(tem[i]+" ");

        }
    }
}
