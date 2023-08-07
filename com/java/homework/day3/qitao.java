package com.java.homework.day3;

import java.util.Scanner;

public class qitao {
//    天朝有一个乞丐姓洪，去天桥要钱
//            第一天要了1块钱
//    第二天要了2块钱
//            第三天要了4块钱
//    第四天要了8块钱
//            以此类推a天一共多少钱
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int sal =1;
        int daysal=1;


        for (int i = 1; i <a; i++) {
            if(a==1){
                System.out.println(1);
                continue;
            } else if (a==0) {
                System.out.println(0);
            } else {
                daysal *= 2;
            }
            sal += daysal;

        }
            System.out.println(sal);
        }
    }

