package com.java.homework.day3;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/4 21:06
 * @desciption: 回文
 */
//回文数
public class huiwen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        // int wei = sc.nextInt();
        int ge =0;
        int tem=num;
        int n=0;

        while(num!=0){
            //从右到左依次获得数字
          ge = num%10;
          num = num/10;
          n = n*10 +ge;
        }
        String flag = n==tem?"是":"不是";
        System.out.println(flag);



    }
}
