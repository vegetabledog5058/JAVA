package com.java.homework.day6;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/9 14:09
 * @desciption: 排序后去重
 */
public class desrepeate2 {
    public static void main(String[] args) {
        int []arr ={1,2,3,2,4,7,6,4};
        arr= maopao(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] maopao(int []arr){
        //排序
        //int arr[] ={3,5,2,8,9,6};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        return arr;

    }

}
