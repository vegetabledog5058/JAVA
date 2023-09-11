package javaEx.plus.homework.day0906;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/6 10:36
 * @desciption:
 */
public class Online {
    public static void main(String[] args) {
        Set<String> treeSet= new HashSet<>();
        treeSet.add("dda");
        treeSet.add("essss");
        treeSet.add("zsaf");
        treeSet.add("hs");
        treeSet.add("aafaw");
        treeSet.add("baa");
        String str = "sa0";

        //新建类
        treeSet.forEach(new myConsumer());

        //匿名类
//        treeSet.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //lambda表达式
//        treeSet.forEach(s-> System.out.println(s));


    }
    public static class myConsumer implements Consumer<String>{

        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    }
}
