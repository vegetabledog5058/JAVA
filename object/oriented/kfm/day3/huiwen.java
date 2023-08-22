package object.oriented.kfm.day3;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/22 21:19
 * @desciption:请定义一个方法用于判断一个字符串是否是对称的字符串，并在主方法中测试方法。 例如："abcba"、"上海自来水来自海上"均为对称字符串
 */
public class huiwen {
    public static void main(String[] args) {
        String str = "cdfffgdc";
        String xxx = flag(str) ? "是回文" : "不是回文";
        System.out.println(xxx);


    }

    public static boolean flag(String str) {
        str.toCharArray();
        int n = 0;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char q = str.charAt(i);
            char h = str.charAt(j);
            if (q != h && i <= str.length() / 2) {
                return false;
            }

        }
        return true;
    }
}
