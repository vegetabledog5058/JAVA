package com.java.homework.day9_string;

import javax.xml.transform.Result;
import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/23 19:45
 * @desciption:随机生成一个 6 位的密码，要求：
 * <p>
 * 不包含重复字符
 * 要有字母和数组
 * 不能以数字开头
 */
public class password {
    public static void main(String[] args) {
        String password ="";
       outer: while(true){
            password = getpassword();
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if(x>='0'&&x<='9'){
                    //满足条件
                    break outer;
                }else {
                    continue ;
                }
            }

        }
        System.out.println(password);
    }

    public static String getpassword() {
        Random r = new Random();

        int num[] = {};
        char[] uppercaseArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q',
                'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String result = "";
        int a = r.nextInt(52) + 10;
        int[] arrb = new int[26];
        int[] arrs = new int[26];
        int[] arrnum = new int[10];
        if (uppercaseArray[a] < 'a') {
            //大写
            result += uppercaseArray[a];
            arrs[uppercaseArray[a]-'A']++;
        } else {
            result += uppercaseArray[a];
            arrb[uppercaseArray[a]-'a']++;
        }


        while (result.length() < 6) {
            char x = uppercaseArray[r.nextInt(52)];
            if (x >= 'a') {
                //小写
                if ((arrb[x - 'a']++) > 1) {
                    continue;
                } else {
                    arrb[x - 'a']++;
                    result += x;
                }
            } else if (x > 'A') {
                //大写
                if ((arrs[x - 'A']++) > 1) {
                    continue;
                } else {
                    arrs[x - 'A']++;
                    result += x;
                }
            } else {
                if ((arrnum[x - '0']++) > 1) {
                    continue;
                } else {
                    arrnum[x - '0']++;
                    result += x;
                }

            }

        }
        return result;
    }
}
