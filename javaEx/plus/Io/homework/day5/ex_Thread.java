package javaEx.plus.Io.homework.day5;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/15 13:56
 * @desciption:
 */
public class ex_Thread {
    public static void main(String[] args) {
//thread 方式一:

        MyThread MyThread = new MyThread();
//        MyThread.start();

//runnable 方式二:
        //创建实现类的对象
        RunAble runAble = new RunAble();
        Runnable runAble1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }

        };

        //lambda表达式
        Runnable r1 = () -> {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 10; i++) {
                System.out.println(name + " : " + i);
            }
        };
        //将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(runAble);
        Thread t2 = new Thread(runAble1, "r1");

//        t1.setName("t1");
//        t1.start();

/**
 * 方式一和方式二的比较：
 *
 * 开发中优先选择实现Runnable接口的方式
 * 原因：
 * （1）实现的方式没有类的单继承性的局限性
 * （2）实现的方式更适合来处理多个线程有共享数据的情况
 * 相同点：两种方式都需要重写run(),将线程要执行的逻辑声明在run()中
 */

//Callable接口 方法三
        MyCallable myCallable = new MyCallable();
        FutureTask futureTask = new FutureTask<>(myCallable);
        Thread ft = new Thread(futureTask);
        //lambda
        Callable<Integer> callable= ()->{
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                if (i % 2 == 0) {
                    sum += i;
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
            return sum;
        };
        //futureTask
        new FutureTask<>(new Runnable(){
            @Override
            public void run() {
                int sum = 0;
                for (int i = 0; i < 10; i++) {
                    sum += i;
                }
            }
        },10);



        ft.setName("ft");
        ft.start();


        try {
            Object sum = futureTask.get();
            System.out.println((int) sum);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
//Callable接口

/**
 * 步骤：
 * 1.创建一个实现Callable的实现类
 * 2.实现call方法，将此线程需要执行的操作声明在call()中
 * 3.创建Callable接口实现类的对象
 * 4.将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
 * 5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
 * 6.获取Callable中call方法的返回值
 */
class MyCallable implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
        return sum;
    }
}


//RunAble接口创建

/**
 * 步骤：
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法：run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 * ① 启动线程
 * ②调用当前线程的run()–>调用了Runnable类型的target的run()
 */
class RunAble implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}


//Thread 创建

/**
 * 步骤：
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3.创建Thread类的子类的对象
 * 4.通过此对象调用start()执行线程
 */
class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}