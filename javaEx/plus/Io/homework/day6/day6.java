package javaEx.plus.Io.homework.day6;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/18 11:26
 * @desciption:   多线程模拟电影票的售出
 */
public class day6 {
    public static void main(String[] args) {
        Object o = new Object();
        Mythread2 m = new Mythread2();

        Thread t1 = new Thread(m, "一号窗口");
        Thread t2 = new Thread(m, "二号窗口");
        Thread t3 = new Thread(m, "三号窗口");
        Thread t4 = new Thread(m, "四号窗口");
        Thread t5 = new Thread(m, "五号窗口");


    }

}

class Mythread2 extends Thread {
    private int tickets = 100;


    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    String name = Thread.currentThread().getName();
                    System.out.println(name + "第[" + tickets-- + "]张票售出");
                }
            }
        }
    }
}
