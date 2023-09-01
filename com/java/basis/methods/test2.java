package com.java.basis.methods;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/12 0:48
 * @desciption: 测试
 */
public class test2 {
    public static void main(String[] args) {
        double a = 7.88;
        float f = 4.7F;
        long u = 7L ;
        byte x=6;
        double y =1.5;
        float z =test(x,y);
        System.out.println(z);
/*
       int []arr = {1,2,3,4,5,6,7,8};
       int [] newarr = new int[arr.length-1];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.arraycopy(arr,0,newarr,0,n-1);
       System.arraycopy(arr,n,newarr,n-1,arr.length-n);
        System.out.println(Arrays.toString(newarr));
*/
    }

    public static short test(byte x,double y){

        return (short)(x/y*3);
    }

}
