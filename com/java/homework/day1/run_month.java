package com.java.homework.day1;

import java.util.Scanner;

public class run_month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份");
        int year = sc.nextInt();
        System.out.println("输入月份");
        int month = sc.nextInt();

        switch (month){
            case 1,3,5,7,8,10,12 -> System.out.println("31");
            case 2 -> {
                if (year % 4 == 0&&year%100!=0) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
            }
            case 4,6,9,11 -> System.out.println("30");

        }

    }
}
