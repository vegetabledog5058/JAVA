package com.java.string.s1;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 11:28
 * @desciption:字符串中数字转换为数字的方法
 */
public class roma_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        StringJoiner sj = new StringJoiner(" ","]","[");
        while (true) {
            System.out.println("输入数字");

            a = sc.next();
            if (boollength(a)) {
                break;
            } else {
                System.out.println("错误输入");
                continue;
            }
        }
        //通过ASCII码表以及char运算自动转换int转换为数字
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            // 0是48 比0大几就是几
            int c = b - '0';
            String d = me(c);
            sj.add(d);
        }
        StringBuilder sb = new StringBuilder(sj.toString());
        System.out.println(sb);
    }

    public static String me(int fir) {
        String[] romanNumerals = {
                "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
        };
        return romanNumerals[fir];
    }

    public static boolean boollength(String a) {
        if (a.length() <= 9 && a.length() > 0) {
            if (boolnum(a)) {
                return true;
            }

        }
        return false;
    }

    public static boolean boolnum(String a) {
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            if (b <= '0' || b >= '9') {
                return false;
            }

        }
        return true;

    }

}
