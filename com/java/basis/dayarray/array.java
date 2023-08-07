package com.java.basis.dayarray;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/6 23:36
 * @desciption: 数组
 */
public class array {
    public static void main(String[] args) {
        int[] arry1 = new int[]{1, 2, 3};
        int[] arry2 = new int[]{4, 3, 2, 1};
        int[] arry3 = new int[4];

        int i;
        for(i = 0; i < 3; ++i) {
            System.out.println(arry1[i]);
        }

        for(i = 0; i < 4; ++i) {
            System.out.print(arry2[i]);
        }

        for(i = 0; i < arry3.length; ++i) {
            System.out.print(arry3[i]);
        }

    }

}
