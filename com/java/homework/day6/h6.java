package com.java.homework.day6;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 21:12
 * @desciption: 数组的交集
 */
public class h6 {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5,6};
        int []arr2 = {2};
        int k=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    arr2[k]= arr1[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
