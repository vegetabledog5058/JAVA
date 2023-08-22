package LeetCode;

import java.sql.SQLOutput;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/22 8:56
 * @desciption: 位运算
 */
public class test {


    public static void main(String[] args) {
        char A ='A';
        int a = 0;
        int b = 3;
        char B = 'B';
        String  str = "aaccddb";
       // System.out.println(a.equals(b));
        //System.out.println(A^0);
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            a ^= x;
        }
        System.out.println((char)a);
        //System.out.println(A^B);

    }
}
