package com.java.basis.comprehensive;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 22:04
 * @desciption: 解密
 */
public class decryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //输入数字 8346
        int count=0;
        int tem =a;
        while (a!=0){
            a = a/10;
            count++;
        }
        //将数字存入数组.
        int []arr = new int[count];
        int k= 0;
        while (tem!=0){
            int ge = tem%10;
            tem = tem/10;
            arr[k] = ge;
            k++;

        }
        for (int i = 0; i < arr.length; i++) {
           arr[i] = (arr[i]+5)%10;
            System.out.println(arr[i]);
        }


    }
}
