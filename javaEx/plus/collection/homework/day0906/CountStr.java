package javaEx.plus.collection.homework.day0906;

import com.sun.jdi.Value;

import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/6 21:53
 * @desciption: ## 统计数量  输入一个字符串，统计字符串中每个字符出现的次数并输出
 */
public class CountStr {
    public static void main(String[] args) {
        String text = """
                wei chun xi da sha gou""";
        List<String>stringList = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            char cha =  text.charAt(i);
            stringList.add(String.valueOf(cha));
        }
        //去重
        Set<String >strings = new TreeSet<>();
        Map<String,Integer> index = new HashMap<>( );


        for (String str:stringList
             ) {
            index.put(str,0);
        }
        for (String str:stringList
             ) {
          index.put(str,index.get(str)+1);
        }
        System.out.println(index);


        //方法二

    }


}
