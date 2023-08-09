package com.java.homework.day7;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/9 21:39
 * @desciption: 复制数组
 */
public class copy_arr {
    public static void main(String[] args) {
        int []nums = {2,11,33,44,55,66,277};
        int[] newarr = new int[nums.length-1];
        System.arraycopy( nums,0,newarr,0,2 );
        System.arraycopy( nums,3,newarr,2,nums.length-3 );
        System.out.println(Arrays.toString(newarr));

    }

}
