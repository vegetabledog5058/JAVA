package com.java.homework.day6_rank;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/14 18:50
 * @desciption: 快排
 */
public class quickSort {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 11, 4, 5, 10, 8};
        //调用方法排序,传递需要排序的范围,这里先从数组第一个到最后一个
        quickSort(arr, 0, arr.length - 1);
        //检查排序
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }

        //将定义两个指针为left和right分别在数组索引的0和length-1位置
        int left = start;
        int right = end;
        //随意选取一个基准值,这里选取第一个数,也就是索引为0;
        int base = arr[start];
        //先从右指针开始寻找比基准值小的数,如果比基准值大则继续向左移动右指针,如果找到比基准值小的数停止
        while (left < right) {
            while (left < right && arr[right] >= base) {
                right--;
            }
            //右指针停止后左指针开始向右移动,同理,找到比基准值大的数停止,否则一直右移
            while (left < right && arr[left] <= base) {
                left++;
            }
            //现在已经找到左右两边开始数,分别第一个出现的符合条件的数,也就是7和5
            //将两个数交换位置
            int tem = arr[right];
            arr[right] = arr[left];
            arr[left] = tem;
        }

        arr[start] = arr[left];
        arr[left] = base;

        //对左边数进行快排
        quickSort(arr,start,left-1);
        //对6右边进行快排
        quickSort(arr,left+1,end);
    }
}
