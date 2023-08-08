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
        int []arr ={3,2,1,4,5};
        int count=0; //重复次数
        int []newarr = new int[arr.length];
        int k =0;
        int j =0;
        for (int i = 0; i < arr.length ; i++) {
            for ( j = i+1; j < arr.length; j++) {
                if(arr[i]!=arr[j]){


                }
            }


        }
        System.out.println(Arrays.toString(newarr));

    }

}
