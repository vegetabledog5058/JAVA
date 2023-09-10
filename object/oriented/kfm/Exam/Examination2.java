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
        if(s.length()==t.length()){
            Set<Map.Entry<Character,Integer>> tem = map.entrySet();


            Iterator<Map.Entry<Character,Integer>> iterator = tem.iterator();
            boolean flag = true;
            while (iterator.hasNext()){
                Map.Entry<Character,Integer>p = iterator.next();
                if (mapT.get(p.getKey())!= p.getValue()){
                    flag = false;
                }
            }                System.out.println(flag);


        }else {
            System.out.println("false");
        }
    }
}
