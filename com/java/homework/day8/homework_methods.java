package com.java.homework.day8;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/11 18:49
 * @desciption: 求整数和
 */
public class homework_methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //输入数字
        //Sum();
        //boolean flag = bool(a);

        //char[] arr = {'i', 'a', 'm', 'u'};
        //reverse(arr);
        //System.out.println(Arrays.toString(arr));
        //boolean shuzi = huiwen(a);
        //System.out.println(shuzi);
        int arr[] = {1,2,3,4,5,6,7};
        //int num1 = sc.nextInt();
       // int num2 = sc.nextInt();
        //swap(arr,num1,num2);
        //System.out.println(Arrays.toString(arr));
        arr = leftMove(arr,a);
        System.out.println(Arrays.toString(arr));

    }

    public static int Sum(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static int factorial(int a) {
        int mul = 1;
        for (int i = 1; i <= a; i++) {
            mul *= i;

        }
        return mul;
    }

    public static boolean bool(int a) {
        if (a == 1) {
            return false;
        }
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void reverse(char arr[]) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            char tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }
    }

    public static boolean huiwen(int a) {
        int tem = a;
        int num = 0;
        while (a != 0) {
            int ge = a % 10;
            a = a / 10;
            num = num * 10 + ge;
        }
        if (tem == num) {
            return true;

        }
        return false;
    }
    public static void swap(int []arr,int num1,int num2){
        int tem = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tem;

    }
    public static int[] leftMove(int arr[],int k){
        int newarr[] = new int[arr.length];
        //左移几位从索引下一位开始复制,索引+1=k也就是k位开始复制
        if(k<= arr.length) {
            System.arraycopy(arr, k, newarr, 0, arr.length - k);
            //带入具体值计算
            System.arraycopy(arr, 0, newarr, arr.length - k, k);

        }else {
            return null;
        }return newarr;
    }

}