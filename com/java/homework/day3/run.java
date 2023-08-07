package com.java.homework.day3;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/4 20:34
 * @desciption: 李四跑步
 */
//李四每天跑步
//        第一周周一跑 100 米，周二到周天每天比前一天多 100 米。
//        往后每周以比前一周周一多 100 米。
//        请问 李四 n（控制台输入） 天后跑了多少米

public class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        M1(day);
        M2(day);

    }
    public static void M2(int day){
        //
        int sum =0;
        int base = 100;
        //计算第二天天跑多少(先加)
        for (int i = 1; i <=day; i++) {
            sum+=base;
            if(i%7==0){
                base = 100+ (i/7)*100;
            }else {
                base += 100;

            }


        }
        System.out.println(sum);
    }



    public static int M1(int day) {
        int week = day / 7;
        int extraday = day % 7;
        int running = 0;
        int run = 0;
        int extrarun = 0;
        extrarun = (week + 1) * 100;
        for (int i = 1; i <= week; i++) {
            run = 100 * i;

            for (int j = 7; j > 0; j--) {
                running += run;
                run += 100;
            }


        }
        for (int k = 1; k <= extraday; k++) {

            running += extrarun;
            extrarun += 100;

        }

        System.out.println(running);
        return running;
    }
}


