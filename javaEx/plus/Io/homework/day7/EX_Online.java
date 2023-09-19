package javaEx.plus.Io.homework.day7;
import java.time.LocalDate;
import java.util.concurrent.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/19 10:15
 * @desciption:
 */
public class EX_Online {
    public static void main(String[] args) {
      //  catches();
      // Fixes();
       // single();
      //  schedule();

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,3,5,TimeUnit.SECONDS,
                new ArrayBlockingQueue(3));
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i+Thread.currentThread().getName());
                }
            }
        });
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(i+Thread.currentThread().getName());
                }
            }
        });
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("第"+i+"个傻狗为春熙"+Thread.currentThread().getName());
                    System.out.println(threadPoolExecutor.getKeepAliveTime(TimeUnit.MILLISECONDS));
                }
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
      threadPoolExecutor.setKeepAliveTime(10,TimeUnit.SECONDS);

        System.out.println(threadPoolExecutor.toString());
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                while (!threadPoolExecutor.isTerminated()){
                    System.out.println(threadPoolExecutor.getKeepAliveTime(TimeUnit.MILLISECONDS));
                }
            }
        });


    }
    public static void catches(){
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newCachedThreadPool();
//自定义创建,工厂方法
        System.out.println(LocalDate.now());
        for (int i = 0; i < 10; i++) {
            int num = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("当前鲲日为:" + LocalDate.now() + "线程是" + Thread.currentThread().getName());
                    try {
                        //让每一个线程忙碌
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });



        }
    }
    public static void Fixes(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        System.out.println(LocalDate.now());
        for (int i = 0; i < 10; i++) {
            int num = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("当前鲲日为:" + LocalDate.now() + "线程是" + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
    }
    }
    public static void single(){}
    public static void schedule(){}

}


