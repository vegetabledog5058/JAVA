package com.java.homework.day6_rank;

import com.sun.source.tree.Scope;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 15:01
 * @desciption: 选择排序
 */
public class select {
    public static void main(String[] args) {
        int array[]={3,5,2,8,9,6};
        for (int i = 0; i < array.length-1; i++) {
            // 记录最小值下标
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[min]){
                    min = j;
                }
            }
            int tem = array[i];
            array[i] = array[min];
            array[min] = tem;
        }

        System.out.println(Arrays.toString(array));
    }
}
