package object.oriented.kfm.day3;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/22 21:15
 * @desciption: 请编写程序，由键盘录入一个字符串，统计字符串中英文字母和数字分别有多少个。
 * 比如：Hello12345World中字母：10个，数字：5个。
 */
public class count_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = boolcount(str);
        System.out.println(result.substring(2));
        System.out.println(result.substring(0,1));


    }
    public static String boolcount(String str){
        String newstr = str.toUpperCase();
        String tem =" ";
        int countnum =0;
        int countstr =0;
        for (int i = 0; i < newstr.length(); i++) {
            char fir = newstr.charAt(i);
            if(fir-'A'<26&&fir-'A'>=0){
                countstr++;
            }
            if (fir-'0'<=9&&fir-'0'>=0){
                countnum++;
            }

        }
        return countnum +tem+countstr;

    }
}
