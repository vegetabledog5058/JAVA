package javaEx.plus.RequestURL;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/27 21:18
 * @desciption:
 */
public class MulThreading {
    public static void main(String[] args) {
        List<String> list = read();
        System.out.println(list);

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 100, 0, TimeUnit.NANOSECONDS,
                new LinkedBlockingQueue<>(100), new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 22215; i++) {
            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+ "运行");
                }
            });
        }
        poolExecutor.shutdown();

    }
    private static List<String> read() {
        List<String> list = new LinkedList();
        String line;
        //javaEx/plus/RequestURL/server.txt本地测试脚本
        try (BufferedReader br = new BufferedReader(new FileReader("javaEx/plus/RequestURL/server.json"))) {
            while ((line = br.readLine()) != null) {
                    list.add(line);
            }
            //将ip储存到list列表中


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private static void Check(URL url) throws IOException {
        //记录当前时间
        long time = System.currentTimeMillis();
        // 创建一个HttpURLConnection对象，打开与URL的连接
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
// 设置HTTP请求方法为HEAD，用于获取资源的元数据
        httpURLConnection.setRequestMethod("HEAD");
// 设置连接超时时间为5秒（5000毫秒）
        httpURLConnection.setConnectTimeout(5000);
// 连接到URL
        httpURLConnection.connect();
// 获取HTTP响应代码
        int result = httpURLConnection.getResponseCode();
// 计算响应时间（与开始时间的差值）
        System.out.println(url + " 响应代码: " + result + " 响应时间: " + (System.currentTimeMillis() - time) + "ms");
// 断开连接，释放资源
        httpURLConnection.disconnect();


    }

}


