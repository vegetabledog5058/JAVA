package javaEx.plus.Io.homework.day2;

import java.io.File;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/13 10:58
 * @desciption:
 */
public class test {
    public static void main(String[] args) {
        byte aByte[] = new byte[Integer.MAX_VALUE-2];
        System.out.println(aByte);
        System.out.println(Integer.MAX_VALUE);
        File file = new File("D:\\Java_Test\\Cache_fake\\file1/temp");
        String s = file.getName();
        System.out.println(s);
    }


}
