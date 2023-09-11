package javaEx.plus.homework.day0906;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/6 21:25
 * @desciption: ## 摩尔斯密码  国际摩尔斯密码定义一种标准编码方式，
 * 将每个字母对应于一个由一系列点和短线组成的字符串，
 * 比如:  'a' 对应 ".-" ， 'b' 对应 "-..." ， 'c' 对应 "-.-." ，以此类推。 为了方便，所有 26 个英文字母的摩尔斯密码表如下
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 */
public class MosiPassword {
    public static void main(String[] args) {
        Map<Character,String>morseCodeMap = new HashMap<>();
        String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int count =0;
        for (String str:arr) {
            morseCodeMap.put((char)('a'+count),str);
            count++;
        }
        String []words = {"gin", "zen", "gig", "msg"};
        //String []words = {"a"};
        Set<String>result = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String str ="";
            for (char c:words[i].toCharArray()) {
                str += morseCodeMap.get(c);
            }
//            for (int j = 0; j < words[i].length(); j++) {
//                char word = words[i].charAt(j);
//                str+=morseCodeMap.get(word);
//            }
            result.add(str);
        }
        System.out.println(result.size());
    }
}
