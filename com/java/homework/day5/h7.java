package com.java.homework.day5;

import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 17:09
 * @desciption: 数组表示整数值
 */
public class h7 {
    public static void main(String[] args) {
        int []arr = new int[5];
        Random r = new Random();
        int num =0;
        int ge =0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            ge = arr[i];
            num = num *10 +ge;
        }

        System.out.println(num);
    }
}
