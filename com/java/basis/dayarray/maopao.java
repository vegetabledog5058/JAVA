package com.java.basis.dayarray;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/6 23:32
 * @desciption: mppx
 */
public class maopao {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 50, 90, 60, 80, 70};


        int max;
        int j;
        for(max = 0; max < arr.length - 1; ++max) {
            for(j = 0; j < arr.length - max - 1; ++j) {
                if (arr[j] < arr[j + 1]) {
                    int tem = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tem;
                }
            }
        }

        System.out.println("排序后:");
        int sum = 0;
      ;

        for(int k = 0; k < arr.length; ++k) {
            System.out.print(" " + arr[k]);
            sum += arr[k];
        }

        max = arr[0];
        j = arr[arr.length - 1];
        sum = sum - max - j;
        int avg = sum / (arr.length - 2);
        System.out.println();
        System.out.println(sum);
        System.out.println(avg);
    }

}
