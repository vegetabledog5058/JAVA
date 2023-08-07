package com.java.homework.day5;

import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 17:28
 * @desciption: 选手得分
 */
public class h9 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[5];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
            System.out.println(arr[i]+" ");
            sum +=arr[i];

        }
        System.out.println("sum值为"+sum);
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
       double fin = (sum-max-min)/3;
        System.out.println(fin);




    }
}
