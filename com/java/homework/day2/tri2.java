package com.java.homework.day2;

public class tri2 {
    public static void main(String[] args) {
        for(int i=1;i<=7;i++){
            for(int j=7;j>i;j--){
                System.out.printf(" ");

            }  for (int k = 0; k <2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<7;i++){
            for(int j=0;j<i;j++){
                System.out.printf(" ");

            }  for (int k =2*(7-i)-1; k >0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
