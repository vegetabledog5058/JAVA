package javaEx.plus.collection.homework.Day0907;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/7 20:15
 * @desciption: ## 平均值  有一个整数集合，求每个元素平方的平均值。
 */
public class Ex4 {
    public static void main(String[] args) {
        List<Integer>list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            list.add(r.nextInt(100)+1);
        }
        System.out.println(list);
        //list.stream().mapMultiToInt()
        Double avg = list.stream().mapToInt(num->num*num).average().getAsDouble();
        System.out.println(avg);
       // list.stream().flatMapToInt()

    }
}
