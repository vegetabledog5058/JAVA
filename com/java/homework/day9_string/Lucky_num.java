package com.java.homework.day9_string;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/23 20:33
 * @desciption: 随机生成 20 个 1 ~ 40 之间的不重复幸运数字存储到数组中。 要求：  数组中的数字乱序
 */
public class Lucky_num {
    public static void main(String[] args) {
        int tararr[] = new int[20];
        luck(tararr);
        System.out.println(Arrays.toString(tararr));


    }
    public static void luck(int []arr){
        Random r = new Random();
        int map[] = new int[40];
        int i = 0;
        while(i<20){
            int index = r.nextInt(40)+1;
            if(map[index]>1){
                //存在
                continue;
            }else {
                arr[i++] = index;
                        map[index]++;


            }
        }
    }
}
