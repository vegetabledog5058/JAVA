package com.java.homework.day5;

import java.util.Random;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 16:55
 * @desciption: 数组次数
 */
public class h6 {
    public static void main(String[] args) {
        int []arr=new int[20];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count=0;
        for (int i:arr
             ) {
            i = r.nextInt(21)+20;
            System.out.print(i+" "); // 检查随机数
            if(a==i){
                count++;
            }

        }
        System.out.println(count);
    }
}
