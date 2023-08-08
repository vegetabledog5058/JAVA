package com.java.basis.comprehensive;

import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 23:07
 * @desciption: 模拟随机抽奖
 */
public class lotter_draw {
    public static void main(String[] args) {
        int[] arr = {588, 888, 10000, 1000, 2};
        int[] newarr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            //获得随机索引
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];
            //判断是否重复,存在重复时候为true
            boolean flag = repeat(newarr, prize);
            if (!flag) {
                newarr[i] = prize;
                i++;//只有不存在重复数组时候才进行数组遍历
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }

    //判断数字在数组中是否存在
    //方法值定义的数组名为rtarr[]
    public static boolean repeat(int rtarr[], int prize) {
        //prize值为arr[i]
        for (int i = 0; i < rtarr.length; i++) {
            if (prize == rtarr[i]) {
                return true;

            }
        }
        return false;

    }

}
