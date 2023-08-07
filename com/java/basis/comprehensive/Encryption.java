package com.java.basis.comprehensive;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 21:15
 * @desciption: 数字加密
 */
public class Encryption {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    //计算输入数字的位数
        int count = 0;
        int tem_a = a;
        while (a!=0) {
            a = a / 10;
            count++;
        }
    int []arr = new int[count];
        //将输入的数字存到到数组
        int k = arr.length-1;
        while(tem_a!=0){
            int ge = tem_a%10;
            tem_a = tem_a /10;
            arr[k] =ge;
            k--;
        }



        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]+5;
            arr[i] = arr[i]%10;

        }
        //翻转数组
        //1.利用新数组  2.利用ij两个指针数组内调换
        for(int i=0,j=arr.length-1;i< j;i++,j--){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int num =0;
        for (int i = 0; i < arr.length; i++) {
            num = num*10 +arr[i];
        }
        System.out.println(num);

    }
}
