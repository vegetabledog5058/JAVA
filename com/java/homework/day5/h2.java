package com.java.homework.day5;

import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 16:20
 * @desciption: 计算数组元素和
 */
public class h2 {
        public static void main(String[] args) {
                int arr[]=new int[6];
                int sum =0;
                Random r = new Random();
                for (int i = 0; i < arr.length; i++) {
                        arr[i] = r.nextInt(100);
                        sum += arr[i];
                }
                System.out.println(sum);
        }
        }
