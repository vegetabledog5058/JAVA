package com.java.homework.day6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 18:50
 * @desciption: 去重
 */
public class disrepeate {
    public static void main(String[] args) {
        int []arr ={1,2,3,2,4,7,6,4};

        int []newarr = new int[arr.length];
        // 使用排序赋值给旧数组
         arr= maopao(arr);
        int k = 0;
        //直接查找重复元素,打印到新数组
        outer:for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    continue outer;
                }

            }
            newarr[k] = arr[i];
            k++;

        }
        System.out.println(Arrays.toString(newarr));
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


