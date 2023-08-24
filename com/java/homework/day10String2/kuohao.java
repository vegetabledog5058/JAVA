package com.java.homework.day10String2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/24 19:35
 * @desciption: 有效括号 有效字符串需满足： 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class kuohao {

    public static void main(String[] args) {
        System.out.println('(' + 0);
        System.out.println(')'-'(');
        String x = "())(()";
        System.out.println(kkk(x));
    }

    public static boolean kkk(String str) {
        if(str.indexOf(')')==0||str.lastIndexOf('(')==str.length()-1||str.length()%2!=0){
            return false;
        }
        int numleft = '(';
        int numright = ')';
        int countleft =0;
        int countright =0;
        for (int i = 1, j = str.length() - 1-1; i < j; i++, j--) {
            //左
            if (str.charAt(i) == '(') {
                //相加
                numleft += +str.charAt(i);
            } else {
                //减
                if(numleft-str.charAt(i)<0){

                    return false;
                }else {
                    numleft -= str.charAt(i);
                    countleft++;

                }
            }
            //右
            if (str.charAt(j) == ')') {
                numright+=str.charAt(j);
            } else {
                //减
                if(numright-str.charAt(j)<0){
                    return false;
                }else {
                    numright -= str.charAt(j);
                    countright++;
                }

            }
        }
        if(((numleft+countleft)/'(')==((numright+countright)/')')){
            return true;
        }else {
            return false;
        }


    }
}
