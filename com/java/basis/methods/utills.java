package com.java.basis.methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/11 14:13
 * @desciption: 工具类
 */
public class utills {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int length =  sc.nextInt();


    }
    public static void array_length(){
        Scanner sc = new Scanner(System.in);
       //一维数组长度
        int  n = sc.nextInt();
        int array[] = new int[n];

    }
    public static int [] input_array(int array[]){
        array_length();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
}
