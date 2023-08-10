package com.java.homework.day7;

import com.java.basis.dayarray.array;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/9 15:43
 * @desciption: 二维数组排序
 */
public class two_array {
    public static void main(String[] args) {
        int arr[][]={
                {34,35,76,15},
                {35,99,78,13},
                {66,32,57,24},
                {24,46,86,56}};
        for (int k = 0; k < arr.length; k++) {

            for (int i = 0; i < arr[k].length; i++) {
                for (int j = 0; j < arr[i].length - 1-i ; j++) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        int tem = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = tem;
                    }
                }
            }
        }

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();

        }
    }
}
