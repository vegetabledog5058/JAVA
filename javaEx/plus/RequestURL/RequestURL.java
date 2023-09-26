package javaEx.plus.RequestURL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/26 19:34
 * @desciption:
 */
public class RequestURL {
    public static void main(String[] args) {
        RequestURL re1 = new RequestURL();
        re1.IterArray(re1.read());
    }
        public static List<String> read() {
            try (BufferedReader br = new BufferedReader(new FileReader("./server.txt"))) {
                List<String> list = new ArrayList<>();
                //将ip储存到list列表中
                br.lines().forEach(list::add);
                return list;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        public  static void IterArray(List<String> urls) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(urls.size(), urls.size(), 0,
                    TimeUnit.NANOSECONDS,
                    new SynchronousQueue<>());
            for ( int i = 0; i < urls.size(); i++) {
                int count = i;
                threadPoolExecutor.execute(new Runnable() {
                    @Override
                    public  void run() {
                        try {
                            Check(new URL(urls.get(count)));

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }
                });
            }
            threadPoolExecutor.shutdown();
            try {
                threadPoolExecutor.awaitTermination(5, TimeUnit.SECONDS);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);

            }
        }

        public static void Check(URL url) throws IOException {
            long time = System.currentTimeMillis();
            HttpURLConnection httpURLConnection  = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();
            int result =  httpURLConnection.getResponseCode();
            System.out.println(url + " 响应代码: " + result + " 响应时间: " + (System.currentTimeMillis() - time) + "ms");
            httpURLConnection.disconnect();

        }



}
