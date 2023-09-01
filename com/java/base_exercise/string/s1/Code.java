package com.java.base_exercise.string.s1;

import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 16:57
 * @desciption:
 */
public class Code {
    public static void main(String[] args) {
        Random r = new Random();
        char[] uppercaseArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int num[] = {0,1,2,3,4,5,6,7,8,9};
         String str = "";
        for (int i = 0; i < 4; i++) {
            int  a = r.nextInt(uppercaseArray.length);
            str = str+uppercaseArray[a];
        }
        str = str + num[r.nextInt(num.length)];
        str =randomstr(str);
        System.out.println(str);
    }
    public static String randomstr(String str){
        Random r = new Random(str.length());
        char newstr[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
           int index =  r.nextInt(str.length());
            char tem = newstr[i];
            newstr[i] = newstr[index];
            newstr[index] = tem;
        }


        return new String(newstr);
    }
}
