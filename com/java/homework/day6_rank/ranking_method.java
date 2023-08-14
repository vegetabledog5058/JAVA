package com.java.homework.day6_rank;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/9 7:42
 * @desciption: 排序方法
 */
public class ranking_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // select();
       //insert();
        bubble();


    }
    public static void bubble(){
        int arr[] ={3,5,2,8,9,6};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void insert() {
        int arr[] ={3,5,2,8,9,6};
        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];
            int preIdex = i - 1;
            while (preIdex >= 0 && current > arr[preIdex]) {
                arr[preIdex + 1] = arr[preIdex];
                preIdex--;
            }
            arr[preIdex+1] = current;


        }
        System.out.println(Arrays.toString(arr));
    }


    public static void select() {
        int arr[] = {3, 5, 2, 8, 9, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int tem = arr[i];
            arr[i] = arr[min];
            arr[min] = tem;
        }
        System.out.println(Arrays.toString(arr));
    }
}
