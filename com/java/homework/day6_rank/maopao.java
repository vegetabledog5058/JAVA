package com.java.homework.day6_rank;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 11:36
 * @desciption: 冒泡排序
 */
public class maopao {
    public static void main(String[] args) {
        int []array = {5,1,2,4,9,3};
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j]>array[j+1]){
                    int tem = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
