package com.java.base_exercise;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/13 23:05
 * @desciption: 兔子问题
 */
public class rabbit {
    public static void main(String[] args) {
       /* 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
        小兔子长到第三个月后每个月又生一对兔子，
        假如兔子都不死，问每个月的兔子总数为多少？
        这是一个菲波拉契数列问题*/
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int qian = 1;
        int hou = 1;
        for (int i = 1; i <= m; i++) {
            if(i<=2){
                System.out.println(hou);
            }else {
                System.out.println((qian+hou));
                int tem = qian;
                qian = hou;
                hou = (tem + qian);
            }
        }


    }
}
