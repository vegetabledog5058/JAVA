package com.java.methods;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/6 23:37
 * @desciption: 复制数组
 */
public class copy_array {
    public static void main(String[] args) {
        int[] arry = new int[]{1, 2, 3, 4, 6};
        copy(arry, 2, 4);
    }

    public static void copy(int[] arry, int a, int b) {
        int[] newarry = new int[b - a];
        int j = 0;

        for(int i = a - 1; i < b; ++i) {
            newarry[j] = arry[i];
            System.out.println(newarry[j]);
        }

    }
}
