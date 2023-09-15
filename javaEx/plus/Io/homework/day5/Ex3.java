package javaEx.plus.Io.homework.day5;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/15 20:23
 * @desciption:编写一个多线程排序程序， 将一个大型数组（或者集合）分成若干部分，每个线程对其中一部分进行排序，然后主线程(main)等待所有线程完成，
 * 最后将这些有序部分合并成一个有序数组(或者集合)。
 */
public class Ex3 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 27;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int a = r.nextInt(10) + 1;
            arr[i] = a;
        }
        List list = Arrays.stream(arr).boxed().toList();
        List<List> newList = sqt(list, 5);
        try {

            sort(newList);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(newList);

    }

    public static List<List> sqt(List list, int n) {
        if (n <= 0 || n > list.size()) {
            throw new RuntimeException("数据不合法");
        }
        List<List> newList = new ArrayList<>();
        int len = (int) Math.ceil(list.size() / n);
        for (int i = 0; i < n; i++) {
            List tem = null;
            if (i == n - 1) {
               List list1 = list.subList(i * len, list.size());
                 tem =  new ArrayList<>(list1);
            } else {
               List list1 = list.subList(i * len, i * len + len);
              tem =  new ArrayList<>(list1);
            }
            newList.add(tem);
        }
        return newList;
    }

    public static void sort(List<List> list) throws InterruptedException {
        Thread[] threads = new Thread[list.size()];
        int i;
        for (i = 0; i < list.size(); i++) {
            int finalI = i;
            Runnable r = () -> {
                list.get(finalI).sort(Comparator.comparingInt(e -> Integer.parseInt(e.toString())));
            };
            threads[i] = new Thread(r);
        }
        for (int j = 0; j < list.size(); j++) {
            threads[j].start();
            threads[j].join();
        }


    }

}
