package javaEx.plus.Io.homework.day7;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/19 16:19
 * @desciption:
 */
public class Violet {
     static int egg =250;
    public static void main(String[] args) {
        //AtomicInteger egg = new AtomicInteger(250);

        Runnable r = () -> {
            while (egg==250){
                //输出的阻塞
                //System.out.println("下蛋");
            }
            System.out.println("蛋被偷了,哥哥生气了");
        };
        Runnable x = () -> {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            egg = 1;
            System.out.println("偷鸡蛋");
        };

        new Thread(r).start();
        new Thread(x).start();
    }
}
