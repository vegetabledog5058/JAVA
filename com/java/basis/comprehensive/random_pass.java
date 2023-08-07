package com.java.basis.comprehensive;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/7 8:19
 * @desciption: 随机验证码
 */
public class random_pass {
    public static void main(String[] args) {
        char arr[] = new char[52];
        for (int i = 0; i < arr.length; i++) {
            if (i <= 25) {
                arr[i] = (char) (97 + i);
            } else {
                arr[i] = (char) (65 + i - 26);
            }
        }
        Random r = new Random();
        String b = "";
        for (int i = 0; i < 4; i++) {
          int a = r.nextInt(arr.length);
            b = b + arr[a];
        }
        int x = r.nextInt(9);
         b += x;
        System.out.println(b);
        //该方法可以输出数组

        //System.out.println(Arrays.toString(narry));
        // 本题使用字符串的拼接

    }









        }
