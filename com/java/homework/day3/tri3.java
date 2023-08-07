package com.java.homework.day3;

public class tri3 {
    public static void main(String[] args) {
        int row =8;
        for(int i=1;i<=row;i++){
            for(int j=row;j>=i;j--) {
                System.out.printf(" ");
            }
                if (i == 1 || i == row) {
                    for (int k = 1; k <= 2 * i - 1; k++) {
                        System.out.print("*");
                    }
                } else {System.out.print("*");

                    for (int k = 1; k <= 2 * i - 1; k++) {

                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
            System.out.println();

            }
        }

    }

