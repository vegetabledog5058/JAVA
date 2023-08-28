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

    }

}
