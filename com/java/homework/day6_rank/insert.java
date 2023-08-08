package com.java.homework.day6_rank;

import com.java.basis.dayarray.array;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/8 16:39
 * @desciption: 插入排序
 */
public class insert {
    public static void main(String[] args) {
        int []array={3,5,2,8,9,6};

        for (int i = 1; i < array.length; i++) {
            int preindex = i-1;
            int current = array[i];
            //当当前值小于索引值执行循环
            while (preindex>=0&&current<array[preindex]){
               //将preIndex值后移
                array[preindex+1] = array[preindex];
               //将preIndex前移
                preindex--;
            }
            //当前值的位置
            array[preindex+1] = current;
        }
        System.out.println(Arrays.toString(array));


    }
}
