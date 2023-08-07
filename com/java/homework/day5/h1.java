package com.java.homework.day5;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 16:06
 * @desciption: 求数组最小值
 */
public class h1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
           if (arr[i]<min){
              min = arr[i];
           }
        }
        System.out.println(min);




    }
}
