package com.java;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 11:09
 * @desciption:
 */
public class Test_Date {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        int a = ldt.getYear();
        System.out.println(a);
        String s = "af";
        boolean flag = 0==s.indexOf('a');
        System.out.println(flag);
        int b = (2<<30)-1;
        int c = 2<<1;
        int d = 2<<2;
        //System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(5>>1);
    }

}
