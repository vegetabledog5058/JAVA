package com.java.string.s1;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/19 20:16
 * @desciption: 金额转换
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<=0||a>=9999999){
            System.out.println("非法的数字");
        }else {
            int count = 0;
            String re = "";
            while (a!=0){
                int firstnum = a%10;
                char zi = tran(firstnum);
                a = a/10;
                count++;
                re = zi +re;
            }

            for (int i = 0; i < 7-count; i++) {
                String lin = "零";
                re = lin+re;
            }
            char[] dw = {'佰', '拾', '万', '千', '百', '十', '元'};
            String finalstr = "";
            for (int i = 0; i < re.length(); i++) {
                char n = re.charAt(i);
                finalstr = finalstr +n +dw[i];
            }

            System.out.println(finalstr);
        }

    }
    public static char tran(int a){
        char[] arr = {'零','壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        return arr[a];
    }
}
