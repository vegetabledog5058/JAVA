package javaEx.plus.Io.homework.day6;

import java.util.concurrent.CountDownLatch;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/18 15:18
 * @desciption: 写5个线程对 i 进行 100次 加一操作，再写 5 个线程对 i 进行100次 减一操作，输出结
 */
public class Ex1 {
    static CountDownLatch count = new CountDownLatch(10);
    static int num;
   static Object o = new Object();

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            new Pass("P").start();

        }

        for (int i = 0; i < 5; i++) {
          new And("A").start();

        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        try {
//            count.await();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(num);
    }

}

class And extends Thread {

    private String name;


    public And(String name) {
        this.name = name;
    }

    @Override
    public  void run() {

        for (int i = 0; i < 10000; i++) {
          synchronized (Ex1.o){

            Ex1.num++;
            System.out.println("加---第" + i + "个" + name);}

      // }
        Ex1.count.countDown();

    }
}}

class Pass extends Thread {
    private String name;


    public Pass(String name) {
        this.name = name;
    }

    @Override
    public  void run() {

        for (int i = 0; i < 10000; i++) {
          synchronized (Ex1.o) {
                Ex1.num--;
             //  System.out.println("减---第" + i + "个" + name);
            }
      }
        Ex1.count.countDown();

    }
}
