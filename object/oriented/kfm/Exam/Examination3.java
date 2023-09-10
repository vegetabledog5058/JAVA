package object.oriented.kfm.Exam;

import com.java.homework.day7.Arrays_sum;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/9 9:02
 * @desciption:
 */
public class Examination3 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
//        int[] nums = {1, 0, 1, 1};
//        int[] nums = {1, 2, 3,1,2, 3};
        int k = 1;
        //通过转换为包装类转换集合
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println(list);
        Set<Integer> set = new HashSet<>(list);
        boolean flag = false;
        int tar = 0;
        int first =0;
        List<Integer>tem = list.subList(0, list.size());
        for (int i = 0; i < set.size(); i++) {
            if (list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
                int index = list.get(i);
                while (tem.lastIndexOf(index)!=first) {
                    int last = tem.lastIndexOf(index);
                    tem  =  list.subList(0,tem.lastIndexOf(index));
                    first = tem.lastIndexOf(index);
                    if (last-first<=k) {
                        flag = true;
                    }


                }

            }
        }
        System.out.println(flag);
    }
}

