package javaEx.plus.Io.homework.day5;

import javax.lang.model.util.TypeKindVisitor14;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/15 19:42
 * @desciption:创建一个线程循环对一个数做加一操作，5秒后在主线程中中断线程并在主线程（main）输出结果。
 */
public class Ex2 {
    public static void main(String[] args) {
        Callable<Long> callable = () -> {
            long num = 5;
            while (!Thread.interrupted()) {
                num++;
            }
            return num;
        };

        FutureTask<Integer> futureTask = new FutureTask(callable);
        Thread t = new Thread(futureTask);

        try {
            t.start();
            Thread.sleep(5000);
            t.interrupt();
            System.out.println(futureTask.get());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


    }
}
