package com.java.homework.day5;

import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 16:26
 * @desciption: 寻找奇数
 */
public class h3 {
    public static void main(String[] args) {
        int arr[]=new int[6];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            if (arr[i]%2!=0&&i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
