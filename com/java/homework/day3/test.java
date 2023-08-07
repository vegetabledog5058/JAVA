package com.java.homework.day3;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/4 18:56
 * @desciption: 空心三角形
 */
public class test {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("请输入边长:");
        int lon = scr.nextInt();

        for(int i = 1; i <=lon; i++){

            if (i ==1 || i == lon){
                for (int j = 1; j<=lon; j++){
                    if (j == 1 || j == lon){
                        System.out.print("# ");
                    }else {
                        System.out.print("@ ");
                    }
                }
                System.out.println();
            }else {
                for (int j = 1; j <= lon; j++){
                    if (j == 1 || j == lon){
                        System.out.print("@ ");
                    }else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

        }
    }
}
