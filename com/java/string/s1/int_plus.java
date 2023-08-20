package com.java.string.s1;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 17:26
 * @desciption: 字符整数相乘
 */
public class int_plus {
    public static void main(String[] args) {
         String a = "123";
         String b = "1000";
         char aa[] = a.toCharArray();
         char bb[] = b.toCharArray();
         int sum1 = 0;
         int sum2 = 0;
        for (int i = 0; i < aa.length; i++) {
            int ge = aa[i] - '0';
            sum1 = sum1*10 +ge;
        }
        for (int i = 0; i < bb.length; i++) {
            int ge = bb[i] - '0';
            sum2 = sum2*10 +ge;
        }
        int sum = sum1 *sum2;

        String str = ""+sum;
        System.out.println(str);

    }


}
