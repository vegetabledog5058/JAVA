package com.java.homework.day5;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 17:09
 * @desciption: 奇数左偶数右
 */
public class h8 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 7, 8, 6, 2, 5};
        int[] rearr = new int[arr.length];
        int[] doublearr = new int[arr.length];
        int j=0;
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                rearr[j] = arr[i];
                j++;
            }else {
                doublearr[k] = arr[i];
                k++;
            }
        }

        for (int i = 0; i < k; i++) {
           rearr[j] = doublearr[i];
           j++;
        }
        for (int i = 0; i < rearr.length; i++) {
            System.out.println(rearr[i]);
        }





    }
}
