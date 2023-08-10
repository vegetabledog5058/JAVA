package com.java.homework.day7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 15:51
 * @desciption: 复制数组
 */
public class sys_copy {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,};
        int newarr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        int one[] ={num};
        int index = Arrays.binarySearch(arr, n);

        System.arraycopy(arr,0,newarr,0,index);
        System.arraycopy(one,0,newarr,index,1);

        System.arraycopy(arr,index,newarr,index+1,newarr.length-index-1);



       /* System.arraycopy(arr,0,newarr,0,index+1 );
        System.arraycopy(arr,index+1,newarr,index,arr.length-index-1);
       */
        System.out.println(Arrays.toString(newarr));
    }
}
