package com.java.homework.day6_rank.day6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 20:46
 * @desciption: 插入k新数组
 */
public class h5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr= {2,3,1,8,3,9,6};
        int []newarr = new int[arr.length+1];
        for (int i = 0; i < arr.length+1; i++) {
            if(i<n-1){
            newarr[i] = arr[i];
            } else if (i==n-1) {
                newarr[i] = k;
            }else {
                newarr[i] = arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
