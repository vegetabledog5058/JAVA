package com.java.methods;

import jdk.swing.interop.SwingInterOpUtils;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/9 8:35
 * @desciption: 季度和
 */
public class quater_sum {
    public static void main(String[] args) {
        int arr[][]={
                {34,35,76,15},
                {35,57,78,13},
                {66,32,57,24},
                {24,46,86,24}
        };
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
             sum =sum(arr[i]);
            System.out.println(sum);
        }

    }

    public static int sum(int arr[]) {
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }



}
