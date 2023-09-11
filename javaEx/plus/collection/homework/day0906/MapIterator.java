package javaEx.plus.collection.homework.day0906;

import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/6 19:59
 * @desciption: 创建一个Map，完成以下操作：
 * - 将我国省份和其简称存到 Map 集合中
 * - 将省份名称中包含"江"的省份从集合中删除
 * - 遍历输出集合元素
 */
public class MapIterator {
    public static void main(String[] args) {
        Map<Short, String> map = new HashMap<>();
        for (short i = 0; i < 100; i++) {
            map.put(i, String.valueOf(i));
            map.remove(i - 1);
        }
        System.out.println(map.size());

        //entrySet
       /* Set<Map.Entry<Short, String>> entries = map.entrySet();
        Iterator<Map.Entry<Short,String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Short,String> next = iterator.next();
            System.out.println(next);
        }*/

        //keyset
        /*Set<Short>shorts = map.keySet();
        Iterator<Short> iterator = shorts.iterator();
        while (iterator.hasNext()){
            Short next = iterator.next();
            System.out.println(next);
        }*/

        //value
        Collection<String> collection = map.values();
        Iterator<String> iterator = collection.iterator();
        for (String str:collection
             ) {
            System.out.println(str);

        }

    }
}
