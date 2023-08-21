package LeetCode;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/20 21:48
 * @desciption:给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。
 * 如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
 *
 * 返回 合并后的字符串 。
 *
 *
 *
 * 示例 1：
 *
 * 输入：word1 = "abc", word2 = "pqr"
 * 输出："apbqcr"
 * 解释：字符串合并情况如下所示：
 * word1：  a   b   c
 * word2：    p   q   r
 * 合并后：  a p b q c r
 * 示例 2：
 *
 * 输入：word1 = "ab", word2 = "pqrs"
 * 输出："apbqrs"
 * 解释：注意，word2 比 word1 长，"rs" 需要追加到合并后字符串的末尾。
 * word1：  a   b
 * word2：    p   q   r   s
 * 合并后：  a p b q   r   s
 * 示例 3：
 *
 * 输入：word1 = "abcd", word2 = "pq"
 * 输出："apbqcd"
 * 解释：注意，word1 比 word2 长，"cd" 需要追加到合并后字符串的末尾。
 * word1：  a   b   c   d
 * word2：    p   q
 * 合并后：  a p b q c   d
 */
public class p1 {
    public static void main(String[] args) {
        String a = "abcdef";
        String b = "ppp";
        String str = relete2(a, b);
        System.out.println(str);

    }

    public static String relete2(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int l1 = word1.length(),l2 = word2.length();
        int i = 0, j = 0;
        while(i<l1||j<l2){
            if(i<l1){
                sb.append(word1.charAt(i));
                i++;
            }
            if(j<l2){
                sb.append(word2.charAt(j));
                j++;
            }
        }
        return sb.toString();

    }

    public static String relete1(String word1, String word2) {
        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();
        String str = "";
        char[] bigger = arr1.length > arr2.length ? arr1 : arr2;
        char[] smaller = arr1.length > arr2.length ? arr2 : arr1;
        for (int i = 0; i < bigger.length; i++) {

            if (i < smaller.length) {
                str = str + arr1[i] + arr2[i];
            } else {
                str = str + bigger[i];
            }
        }
        return str;

    }
}
