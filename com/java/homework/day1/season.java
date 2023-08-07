package com.java.homework.day1;

import java.util.Scanner;

public class season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        if(mon>=0&mon<=12) {
            switch (mon) {
                case 3, 4, 5 -> System.out.println("春天");
                case 6, 8, 7 -> System.out.println("夏天");
                case 11, 9, 10 -> System.out.println("秋天");
                case 12, 2, 1 -> System.out.println("冬天");
            }
        }else {
            System.out.println("输出错误");
        }
    }
}
