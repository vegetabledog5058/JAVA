package javaEx.plus.collection.homework.Day0907;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/7 19:00
 * @desciption: 给定一个字符串数组,使用 Stream 把所有字符串拼接成一个字符串。
 * String[] arr = {"a", "b", "c"};
 * 输出: abc
 */
public class Ex1 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        if(arr==null){
            throw new NullPointerException();
        }
        List<String> list1 = Arrays.asList(arr);

       String str = list1.stream().reduce("",(e1,e2)->e1+e2);
      String str2 = list1.stream().collect(Collectors.joining());
        System.out.println(str2);
        //
    }
}
