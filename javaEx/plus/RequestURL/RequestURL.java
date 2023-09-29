package javaEx.plus.RequestURL;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/26 19:34
 * @desciption: 
 */
public class RequestURL {
    //存放输入的url
    private static LinkedBlockingQueue<String> list = new LinkedBlockingQueue<>();
    //每行的url
    private static String line;

    public static void main(String[] args) {
        start();
    }

    /**
     * 方法用于启动
     */
    public static void start() {
        //创建两个线程
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(2, 2, 30,
                TimeUnit.SECONDS,
                new SynchronousQueue<>());
        //进行读取文件流
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                read();
            }
        });
        //检查网址有效
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    IterArray();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

    }


    /**
     * 用于读取文件中的每一行URL网址
     *
     * @return
     */
    private static void read() {
        //javaEx/plus/RequestURL/server.txt本地测试脚本
        try (BufferedReader br = new BufferedReader(new FileReader("javaEx/plus/RequestURL/server.txt"))) {
            while (true) {
                if ((line = br.readLine()) != null) {
                    list.offer(line);
                }
            }
            //将ip储存到list列表中


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 线程方法用于检查网址是否有效
     *
     * @throws IOException
     */
    private static void IterArray() throws IOException {
        while (true) {
            if (list.peek() != null) {
                Check(new URL(list.poll()));
            }
        }

    }

    /**
     * 检查url有效的方法
     *
     * @param url
     * @throws IOException
     */

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
