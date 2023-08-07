package com.java.homework.day1;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        double a = sc.nextInt();
        switch (c){
            case "C"-> System.out.println(((a*9)/5)+32);
            case "F"-> System.out.println((((a-32)*5)/9));
        }
    }
    }

