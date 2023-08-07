package com.java.homework.day1;

import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        String c = sc.next();

        switch (c){
           case "+"-> System.out.println(a+b);
           case "-"-> System.out.println(a-b);
           case "*"-> System.out.println(a*b);
           case "/"-> System.out.println(a/b);
            default -> System.out.println("无效");

       };

        }
    }

