package LeetCode;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/22 23:48
 * @desciption:给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 */
public class p4 {
    public static void main(String[] args) {
       String s = "anagram", t = "nagaram";

        System.out.println(bool(s,t));

    }
    public static boolean bool(String s ,String t){
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            sum += a;
        }
        for (int i = 0; i < t.length(); i++) {
            char a = t.charAt(i);
            sum -= a;
        }
        return (sum==0);
    }
}
