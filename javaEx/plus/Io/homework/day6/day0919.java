package javaEx.plus.Io.homework.day6;

import javaEx.plus.Io.homework.day3.Ex;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/19 19:04
 * @desciption: 创建两个线程,一个输出奇数一个输出偶数,最后输出结果12345678910
 */
public class day0919 {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,2,0, TimeUnit.NANOSECONDS,new SynchronousQueue<>());


        executor.execute(new Runnable() {
            @Override
            public  void run() {
                for (int i = 0; i < 11; i++) {
                    if(i%2==0){

                        synchronized (lock){

                            System.out.println(i + "\t");
                            try {
                                lock.notify();
                               lock.wait();


                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }

            }
        });


        executor.execute(new Runnable() {
            @Override
            public  void run() {
                for (int i = 0; i < 11; i++) {
                    if(i%2!=0) {
                        synchronized (lock){

                            System.out.println(i + "\t");
                            try {
                                lock.notify();
                                lock.wait();

                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }

            }
        });



    }
}
