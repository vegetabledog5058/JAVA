package com.java.homework.day4;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/6 23:26
 * @desciption: 1-100质数和
 */
public class sum_zhishu {
    public sum_zhishu() {
    }

    public static void main(String[] args) {
      //M1();
        M2();

    }
    public static void M1(){
        int sum=0;
        for(int i = 2; i <= 100; ++i) {
            for(int j = 2; j <= i && (i % j != 0 || i == j); ++j) {
                if (i % j == 0) {
                    sum +=i;
                }
            }
        }
        System.out.println(sum);
    }
    public static void M2(){
        int sum =0;
       outer: for(int i = 2; i <= 100; ++i) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    continue outer; // 直接i+1
                }
            }
            sum +=i;
        }
        System.out.println(sum);
    }
}
