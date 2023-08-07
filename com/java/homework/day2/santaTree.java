package com.java.homework.day2;

public class santaTree {
    public static void main(String[] args) {
        int j=0;
        for (int i = 1; i <=4; i++) {
            for (j = 12; j >= i; j--) {
                System.out.print(" ");
            }for (int k = 0; k <2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=3; i++) {
            for (j = 10; j >= i; j--) {
                System.out.print(" ");
            }for (int k = 0; k <(2*i-1)+4; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=3; i++) {
            for (j = 9; j >= i; j--) {
                System.out.print(" ");
            }for (int k = 0; k <(2*i-1)+6; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 7; i++) {
            for ( j = 1; j <= 11; j++) {
                System.out.print(" ");
            }for (int k = 0; k <3; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
