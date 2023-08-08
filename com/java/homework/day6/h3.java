package com.java.homework.day6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 19:47
 * @desciption: 去第n个大数
 */
public class h3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= {2,3,1,8,3,9,6};
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int index = i-1;
            while (index>=0&&cur<arr[index]){
                arr[index+1] = arr[index];
                index--;
            }
            arr[index+1] = cur;
        }
        System.out.println(arr[arr.length-n]);
    }
}
