package com.java.homework.day6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 20:05
 * @desciption: 输出取掉第n大的数
 */
public class h4 {
    public static void main(String[] args) {
        int []arr= {2,3,1,8,3,9,6};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < arr.length-1; i++) {
            //记录索引
            int min =i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[min]){
                    min = j;
                }

            }  int tem = arr[i];
            arr[i] = arr[min];
            arr[min] = tem;
      }
        System.out.println(Arrays.toString(arr));
        int newarr[] = new int[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
           if(i<n-1){
               newarr[i] = arr[i];
           } else if (i==n-1) {
               continue;
           } else {
               newarr[i-1] = arr[i];
           }

           }
        System.out.println(Arrays.toString(newarr));
        }

    }

