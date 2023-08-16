package com.java.base_exercise;

import java.sql.SQLOutput;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/15 21:33
 * @desciption:
 */
public class shuixian {
    public static void main(String[] args) {
       /* 打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
        其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，
        因为153=1的三次方＋5的三次方＋3的三次方。*/

        bool();

    }
    public static void bool(){
        int num=0;
        for (int i = 100; i <=999; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100;
         boolean flag =  boolshu(ge,shi,bai,i);
         if(flag){
           num = i;
            print(num);
         }else {
             continue;
         }
        }
        return;
    }
    public static void print(int a){
        System.out.println(a);
    }
    public static boolean boolshu(int ge,int shi,int bai,int num){
        if(Math.pow(ge,3)+Math.pow(shi,3)+ Math.pow(bai,3)==num){
            return true;
        }
        return false;
    }
}
