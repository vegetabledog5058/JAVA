package com.java.methods;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/10 22:46
 * @desciption: 测试
 */
public class test {
    public static void main(String[] args) {
        int []a ={10};
        System.out.println(a[0]);
        int b =10;
        int []arr = new int[]{b};
        test(a);
        System.out.println(a[0]);
    }
    public static void test(int a[]){
        a= new int[]{4};
        a[0] = 6;


    }

}
