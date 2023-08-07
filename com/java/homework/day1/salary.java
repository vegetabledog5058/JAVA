package com.java.homework.day1;

import java.util.Scanner;

//计算工龄
public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int sal = sc.nextInt();
        sal *=12;
        if (year < 5&year>0) {
            sal *= 105;
        } else if (year <= 10) {
            sal *= 110;
        } else {
            sal *=115;
        }


        System.out.println(sal/100);
    }
}

