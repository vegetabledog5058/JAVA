package object.oriented.kfm.Exam;

import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/9 9:02
 * @desciption:
 */
public class Examination2 {
    public static void main(String[] args) {
//        String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        //方法二
        //去重后进行replace替换,计算最后长度
        //优化:通过replacefirst
        //方法三
        //通过排序字符串,一一比较两个字符数组
        //方法四
        //异或运算


        Map<Character,Integer> map = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();
        for (char c:s.toCharArray()
             ) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c:t.toCharArray()
             ) {
            mapT.put(c,mapT.getOrDefault(c,0)+1);
        }
        //equals比较map
        if(s.length()==t.length()){
            if(map.equals(mapT)){
                System.out.println(true);
            }
         /*   Set<Map.Entry<Character,Integer>> tem = map.entrySet();


            Iterator<Map.Entry<Character,Integer>> iterator = tem.iterator();
            boolean flag = true;
            while (iterator.hasNext()){
                Map.Entry<Character,Integer>p = iterator.next();
                if (mapT.get(p.getKey())!= p.getValue()){
                    flag = false;
                }
            }                System.out.println(flag);*/


        }else {
            System.out.println("false");
        }
    }
}
