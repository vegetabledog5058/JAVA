package javaEx.plus.homework.day0904;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/4 19:24
 * @desciption: 创建一个List集合, 添加多个商品名称。实现根据输入查询某个商品是否存在,如果存在则输 出信息。
 */
public class Listgoods {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.add(new Goods("蜜雪冰城",1001));
        stack.add(new Goods("火腿肠",1002));
        stack.add(new Goods("茉莉蜜茶",1003));
        stack.add(new Goods("瑞幸",1004));
        stack.add(new Goods("可乐",1005));
        Scanner sc = new Scanner(System.in);
        String good = sc.next();
        search(stack,good);

    }
    public static void search(Stack stack,String good){
        for (int i = 0; i <stack.size() ; i++) {
            Goods tem = (Goods) stack.get(i);
            if(tem.getName().equals(good)){
                System.out.println(tem.toString());
            }
        }
    }

    
    


}
