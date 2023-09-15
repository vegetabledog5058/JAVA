package javaEx.plus.Io.homework.day5;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/15 19:36
 * @desciption:创建两个线程，一个打印偶数，另一个打印奇数（范围从1到10）
 */
public class Ex1 {
    public static void main(String[] args) {
        Runnable single = () -> {
            for (int i = 0; i <= 10; i++) {
                if(i%2==0)
                    System.out.println(i);
            }
        };
        Runnable doubleNum = () -> {
            for (int i = 0; i < 10; i++) {
                if(i%2!=0)
                    System.out.println(i);
            }
        };
       Thread t1 =  new Thread(single);
       Thread t2 =  new Thread(doubleNum);
       t1.start();
       t2.start();
    }
}
