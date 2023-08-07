package com.java.homework.day2;

public class NN {
    public static void main(String[] args) {
        int j=0;
        //while(i<=6){}
        for (int i = 9; i >=1 ; i--) {

            for ( j = 9; j > 9-i; j--) {

                System.out.print(i+"*"+j+"="+i*j+'\t');

            }
            System.out.println();

        }

    }
}
