package javaEx.plus.collection.homework.day0905;

import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/5 21:27
 * @desciption: ## 统计字符出现的次数  使用集合统计一段文本中各个字符出现的次数。
 */
public class Exercise7 {
    public static void main(String[] args) {
        String text = """
                wei chun xi da sha gou""";
        System.out.println(text.length());
        List<String> list = new ArrayList<>();
        TreeSet<String> treeSet = new TreeSet<>();
        //将字符串分为单一字符串
        for (int i = 0; i < text.length(); i++) {
            char cha =  text.charAt(i);
            list.add(String.valueOf(cha));
        }
        System.out.println(list);
        treeSet.addAll(list);
        List newlist = new ArrayList(treeSet);
        System.out.println(newlist);
        int[] index = new int[treeSet.size()];


        //迭代计数
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            index[newlist.indexOf(str)]++;
        }
        System.out.println(Arrays.toString(index));

        for (int i = 0; i < treeSet.size(); i++) {
            System.out.println(newlist.get(i)+"数量为:"+index[i]);
        }

    }

}
