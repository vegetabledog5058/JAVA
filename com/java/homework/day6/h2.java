package com.java.homework.day6;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 18:41
 * @desciption: 输出下标
 */
public class h2 {
    public static void main(String[] args) {
        int []arr ={3,2,1,4,5};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index =-1;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==n){

                index = i;
                break;
            }
            }
        System.out.println(index);
        }



    }

