package javaEx.plus.collection.homework.Day0907;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/7 13:49
 * @desciption:
 */
public class Compute {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c",null);
        map.put(null,"4");
//        map.compute(null,(k,v)-> {
//            return v = "5";
//        });

        //简写
       // map.compute("d",(k,v)->"6");

        map.computeIfAbsent("c",(k)->"5");
        //map.computeIfPresent("a",(k,v)->null);
         map.compute("c",(k,v)->"6");

        System.out.println(map);


    }
}
