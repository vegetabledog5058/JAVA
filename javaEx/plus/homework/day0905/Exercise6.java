package javaEx.plus.homework.day0905;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/5 21:09
 * @desciption: ## 移除集合元素  使用Set集合存储多个字符串,移除其中长度为奇数的字符串
 */
public class Exercise6 {
    public static void main(String[] args) {
        Set<String> treeSet= new HashSet<>();
        treeSet.add("dda");
        treeSet.add("essss");
        treeSet.add("zsaf");
        treeSet.add("hs");
        treeSet.add("aafaw");
        treeSet.add("baa");
        Iterator<String> iterator = treeSet.iterator();
//        for (String str:treeSet
//             ) {
//            if(str.length()%2!=0){
//                iterator.remove();
//            }
//        }
        while (iterator.hasNext()){
            String str = iterator.next();
            if(str.length()%2!=0){
                iterator.remove();
            }
        }
        System.out.println(treeSet);
        }
    }

