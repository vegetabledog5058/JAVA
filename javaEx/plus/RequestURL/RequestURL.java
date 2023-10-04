package javaEx.plus.RequestURL;

import com.alibaba.fastjson.JSON;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/26 19:34
 * @desciption: 需要fastjson和org.apache.commons.net包
 */
public class RequestURL {
    //阻塞队列存放输入的url,实现访问与检查url同步
    private static LinkedBlockingQueue<String> list = new LinkedBlockingQueue<>();
    //用于储存发送请求时的url列表
    private static CopyOnWriteArrayList<String> LinkedList = new CopyOnWriteArrayList<>();

    //每行的url
    private static int line;
    //需要上传的文件本地测试路径
    private static String localPath ="javaEx/plus/RequestURL/test.txt";
    //用于本地测试时的本地url路径
    private static String URLPath ="javaEx/plus/RequestURL/test.json";

    public static void main(String[] args) {
        start();
    }

    /**
     * 方法用于启动
     */
    public static void start() {
        //对文件先进行读取
        try {
            transToJson();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //创建两个线程
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(3, 3, 30,
                TimeUnit.SECONDS,
                new SynchronousQueue<>());
        //进行持续读取文件流,如果不需要持续读取可以舍弃
//        poolExecutor.execute(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    readWhile();
//                } catch (FileNotFoundException e) {
//                    throw new RuntimeException(e);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
      //  检查网址有效
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
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                sendFile();
            }
        });

    }


    /**
     * 用于读取文件中的每一行URL网址,已经废弃,按需使用
     * version 1.0
     *
     */
//    private static void read() {
//        //javaEx/plus/RequestURL/server.txt本地测试脚本
//        try (BufferedReader br = new BufferedReader(new FileReader("javaEx/plus/RequestURL/server.json"))) {
//            while (true) {
//                if ((line = br.readLine()) != null) {
//                    list.offer(line);
//                }
//            }
//            //将ip储存到list列表中
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    /**
     * 用于初始读取文件中的每一行URL网址,json格式
     * version 2.0
     *
     * @return
     */
    private static void transToJson() throws FileNotFoundException {
        List<String> URLList = readList();
        //添加到阻塞队列
        list.addAll(URLList);
        LinkedList.addAll(URLList);
    }

    /**
     * 用于持续读取文件检查新添加的url,如果不需要一边读取一边输入可舍弃
     * version 2
     */
    private static void readWhile() throws FileNotFoundException, InterruptedException {
        List<String> URLList = readList();
        //获取新加的元素
        String url = URLList.get(URLList.size() - 1);
        list.put(url);
        LinkedList.add(url);
    }

    /**
     * 复用方法:方法用于返回url数组
     */
    private static List<String> readList() {
        //填写网址url文件的位置
//        String path = "javaEx/plus/RequestURL/server.json";
        String path =URLPath;
        //调用read方法读取文件,返回js文件,传入地址
        String fileContent = read(path);
        return JSON.parseArray(fileContent, String.class);

    }

    /**
     * 线程方法用于检查网址是否有效,为空时等待
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

    /**
     * 创建线程发送同步文件
     */
    private static void sendFile() {
        //创建线程池
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 30, 30,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3));
        //要发送的文件--string格式
        String SendFile = read(localPath);
        byte bytes[] = SendFile.getBytes();
        for (int i = 0; i < LinkedList.size(); i++) {
            int finalI = i;

            poolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    //这里设置参数,默认用户名和密码是 joker 和 112233,端口默认21,路径默认是/test下
                    try {
                        FTPUpload(LinkedList.get(finalI).split("//")[1],21,"joker","112233","/test");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }


    }
/**
 *方法用于建立ftp请求,上传文件
 * @param remotePath 远程服务器的相对路径
 */
 private static void FTPUpload(String url,int port,String username,String password,
                               String remotePath) throws IOException {
     //创建ftp客户端
     FTPClient ftpClient = new FTPClient();
     //连接ftp服务器(主机服务器和端口)
     ftpClient.connect(url,port);
     //大于200小于300时成功
     if (FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
         System.out.println(url+"FTP连接成功。");
         //建立连接ftp客户端
         boolean result = ftpClient.login(username,password);
         if (result) {
             System.out.println(url+"FTP认证成功。");
         } else {
             System.out.println(url+"FTP认证失败，用户名或密码错误。");
         }
     } else {
         System.out.println("未连接到 "+url+"FTP服务器。");
         ftpClient.disconnect();
     }
     //被动模式（Passive Mode）下进行数据传输。
     ftpClient.enterLocalPassiveMode();
     //文件传输类型设置为二进制文件类型（FTP.BINARY_FILE_TYPE）
     ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
     //文件上传
     FileInputStream fileInputStream = new FileInputStream(localPath);//这里是上传的文件的地址
     boolean uploadResult = ftpClient.storeFile(remotePath,fileInputStream);
     fileInputStream.close();
     if (uploadResult) {
         System.out.println(url+"文件上传成功");
     } else {
         System.out.println(url+"文件上传失败");
     }
 }

    /**
     * 方法用于读取文件
     *
     * @return string
     */
    private static String read(String path) {
        //javaEx/plus/RequestURL/server.txt本地测试脚本
        StringBuilder stringBuilder = new StringBuilder(); //节约资源损耗
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            byte[] bytes = new byte[1024]; // 创建一个需求大小的字节数组
            //fis读取文件
            int bytesRead;
            while ((bytesRead = fileInputStream.read(bytes)) != -1) {
                stringBuilder.append(new String(bytes, 0, bytesRead));
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringBuilder.toString();
    }
}