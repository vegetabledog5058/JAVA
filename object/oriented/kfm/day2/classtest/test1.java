package object.oriented.kfm.day2.classtest;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/17 0:05
 * @desciption:
 */
public class test1 {
    public static void main(String[] args) {
        final int n = 1;
        change(n);
        System.out.println(n);
    }

    public static void change(int num) {
        num++;
    }
}