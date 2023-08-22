package LeetCode;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 22:31
 * @desciption: 给定两个字符串 s 和 t ，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 * 示例 1：  输入：s = "abcd", t = "abcde"
 * 输出："e" 解释：'e' 是那个被添加的字母。
 * 示例 2：  输入：s = "", t = "y" 输出："y"
 * 提示：  0 <= s.length <= 1000 t.length == s.length + 1 s 和 t 只包含小写字母
 */
public class p2 {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        char target = findDiffenence3(s, t);
        System.out.println(target);

    }


    public static char findTheDifference(String s, String t) {

        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char as = s.charAt(i);
            arr[as - 'a']++;

        }
        for (int i = 0; i < t.length(); i++) {
            char at = t.charAt(i);
            arr[at - 'a']--;
            if (arr[at - 'a'] < 0) {
                return at;
            }

        }
        return ' ';
    }

    //通过ASCII码差值寻找
    public static char findDiffenence2(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < s.length(); i++) {
            char tem = s.charAt(i);
            sum1 += tem;
        }
        for (int i = 0; i < t.length(); i++) {
            char tem = t.charAt(i);
            sum2 += tem;
        }
        return (char) (sum2 - sum1);
    }

    public static char findDiffenence3(String s, String t) {
        int a = 0;
        String str = s+t;
        for (int i = 0; i < str.length(); i++) {
            char tem = str.charAt(i);
            a = a ^ tem;
        }
        return (char) a;
    }
}
