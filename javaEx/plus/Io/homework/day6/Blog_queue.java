package javaEx.plus.Io.homework.day6;

import java.util.ArrayDeque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/18 22:08
 * @desciption:
 */
public class Blog_queue {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        make m = new make(bq);
        eat e1 = new eat(bq,"e1");
        eat e2 = new eat(bq,"e2");
        m.start();
        e1.start();
        e2.start();
    }
}

class make extends Thread {
    private BlockingQueue<String> bq;

    public make(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
                bq.put("鲲肉");
                System.out.println("做了一盘坤肉");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class eat extends Thread {
    private BlockingQueue<String> bq;

    private eat(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    public eat(BlockingQueue<String> bq, String name) {
        super(name);
        this.bq = bq;
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep(1000);
                String take = bq.take();
                System.out.println(getName() + "吃了" + take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}