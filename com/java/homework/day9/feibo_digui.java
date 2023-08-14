package com.java.homework.day9;

import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/14 16:02
 * @desciption: 递归
 */
public class feibo_digui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int ret = fibbo(n);
        for (int i = 0; i <n ; i++) {
            System.out.println(fibbo(n));
        }



    }
    public static int fibbo(int n){
        //结束条件
        if(n==1){
            return 0;
        }
        if (n==2){
            return 1;
        }
        //递归
        return fibbo(n-2)+fibbo(n-1);

    }

}
