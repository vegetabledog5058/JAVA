package javaEx.plus.homework.Day0907;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/7 19:23
 * @desciption: 有一个整数集合，分别完成以下操作：  - 所有元素之和 - 最大值 - 最小值
 */
public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(645);
        list.add(345);
        list.add(235);
        list.add(222);

        Integer max = list.stream().mapMultiToInt((num,intConsumer)->intConsumer.accept(num)).max().getAsInt();
        Integer min = list.stream().mapMultiToInt((num, IntConsumer)->IntConsumer.accept(num)).min().getAsInt();
        Integer sum = list.stream().mapMultiToInt((num, IntConsumer)->IntConsumer.accept(num)).sum();
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}
