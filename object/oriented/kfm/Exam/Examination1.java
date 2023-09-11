package object.oriented.kfm.Exam;

import java.sql.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/9 9:01
 * @desciption:给你一个字符串 `s` ，请你反转字符串中 **单词** 的顺序。
 *
 * **单词** 是由非空格字符组成的字符串。`s` 中使用至少一个空格将字符串中的 **单词** 分隔开。
 *
 * 返回 **单词** 顺序颠倒且 **单词** 之间用单个空格连接的结果字符串。
 *
 * **注意：**输入字符串 `s`中可能会存在前导空格、尾随空格或者单词间的多个空格。
 * 返回的结果字符串中，单词间应当仅用单个空格分隔，且不包含任何额外的空格。
 */
public class Examination1 {
    public static void main(String[] args) {
        String str = "  the sky is blue  ";
        String str1 = "a good    example";
        int  length = 0;

        //思路一,通过replace去重
        while(length!=str1.length()){
            length = str1.length();
            str1 = str1.replace("  "," ");
        }
        //思路二不需要进行去除重复空格,只需要颠倒以后,判断字符串数组长度大于1,进行输出
        System.out.println(str1);
        String newstr[] = str1.trim().split(" ");
        for (int i = 0,j= newstr.length-1; i <j ; i++,j--) {
            String tem = newstr[i];
            newstr[i] = newstr[j];
            newstr[j] = tem;
        }
        Arrays.asList(newstr);
        System.out.println(Arrays.toString(newstr));


    }
}
