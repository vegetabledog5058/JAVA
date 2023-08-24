package com.java.string.day1;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/23 14:07
 * @desciption:
 */
public class intern {
    public static void main(String[] args) {
        /*
         intern 如果字符串在常量池中有就返回常量池中的对象，
                如果没有就将对象放入常量池中,并将这个对象返回
         */

//        String str = "你好啊";
//
//
//        System.out.println(str);
//        System.out.println(System.identityHashCode(str));
//
//        String s = new String("你好啊").intern();
//
//        System.out.println(System.identityHashCode(s));

//        // 1.
//        String str = "abc";
//
//        String s = new String("abc");
//
//        String s1 = s.intern();
//
//        System.out.println(str == s); // false
//        System.out.println(str == s1); // true
//        System.out.println(s == s1); // false
//
//         2.
//        String s = new String("abc");
//
//        String s1 = s.intern();
//
//        String str = "abc";
//
//        System.out.println(str == s); // false
//        System.out.println(str == s1); // true
//        System.out.println(s == s1); // false
//
//         3.
//        String  a = "a";
//        String s = new String(a + "bc");
//
//        String s1 = s.intern();
//
//        String str = "abc";
//
//        System.out.println(str == s); //  true
//        System.out.println(str == s1); // true
//        System.out.println(s == s1); //   true
//
//
//         4.
//        String a = "a";
//        String s = new String(a + "bc");
//
//        String str = "abc";
//
//        String s1 = s.intern();
//
//
//        System.out.println(str == s); //  false
//        System.out.println(str == s1); // true
//        System.out.println(s == s1); //   false

    }

}

