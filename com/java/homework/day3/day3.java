package com.java.homework.day3;

import java.util.Scanner;

public class day3 {
    public static void main(String[] args) {
//输出1-100所有质数
        Scanner sc = new Scanner(System.in);

        for (int num = 1; num <= 100; num++) {
            for ( int i = 1;i <=num>>1 ; i++) {
                if(i!=1&&num%i==0){
                    break;
                }
                if(i==num>>1){
                    System.out.println(num+"是");
                }
            }

        }



    }
}
