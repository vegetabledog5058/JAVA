package com.java.string.s1;

import java.sql.SQLOutput;
import java.util.StringJoiner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 10:57
 * @desciption:
 */
public class SB$SJ {
    public static void main(String[] args) {
        String str = "abcd";
        StringBuilder sb = new StringBuilder(str);
        sb.append("siyi");
        sb.append("reverse").reverse().replace(0,1,"**");
        //System.out.println(sb);
        //SJ
        StringJoiner sj  = new StringJoiner("-----","{","}");
        //每次添加自动增加分隔符
        sj.add(sb);
        sj.add(str);
        int a  = sj.add("iajci").add("aono").toString().length();
        System.out.println(sj);
        System.out.println(a);


    }


}
