package com.java.homework.day9;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/14 14:41
 * @desciption: 递归
 */
public class digui {
    public static void main(String[] args) {
        int n =100;
        int sum = sum(n);
        System.out.println(sum);
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum =n;
        return sum+sum(n-1);

    }
}
