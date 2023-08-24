package LeetCode;

import javax.swing.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/22 22:49
 * @desciption: 给你两个字符串 haystack 和 needle ，
 * 请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
 * 如果 needle 不是 haystack 的一部分，则返回  -1 。
 * haystack 和 needle 仅由小写英文字符组成
 * 输入:haystack = "sadbutsad", needle = "sad"
 * 输出:0
 *
 * 输入：haystack = "leetcode", needle = "leeto"
 * 输出：-1
 * 解释："leeto" 没有在 "leetcode" 中出现，所以返回 -1 。
 */
public class p3 {
    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(searchIndex(haystack,needle));
    }
    //记录值
    public static int searchIndex (String haystack,String needle){
      char arrh[] = haystack.toCharArray();
       char arrn[] =  needle.toCharArray();
        for (int i = 0; i < arrh.length; i++) {
            
        }
        return 0;
    }
}
