package com.java.homework.day7;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/9 9:41
 * @desciption: 二分法查询下标
 */
public class biary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = {1,2,3,4,5,6};
        int left =0;
        int right = arr.length-1;
        int index = -1;
        while (left<=right) {
            int middle = (left + right) >> 1;
            if (arr[middle] == n) {
                index = middle;
                break;
            } else if (arr[middle] > n) {
                right = middle - 1;
            } else if (arr[middle] < n) {
                left = middle + 1;
            }
        }
        System.out.println(index);
    }
}
