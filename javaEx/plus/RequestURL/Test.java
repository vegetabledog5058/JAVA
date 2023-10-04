package javaEx.plus.RequestURL;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/10/4 13:52
 * @desciption:
 */
public class Test {
    public static void main(String[] args) {
//        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 30, 30,
//                TimeUnit.SECONDS,
//                new LinkedBlockingQueue<>(3));
        //得到要发送的文件--string格式
//        String SendFile = read("javaEx/plus/RequestURL/server.json");
        String SendFile = read("javaEx/plus/RequestURL/test.json");
        byte bytes[] = SendFile.getBytes();




                    try {
                        Socket client = new Socket("8.130.92.162", 80);

                        OutputStream outputStream = client.getOutputStream();
                        outputStream.write(bytes);
                        client.shutdownOutput();


                        // 7.使用网络字节输入流对象的方法 read 读取服务端回写的数据到指定的字节数组中

                        // 将字节数组中的数据转换成字符串，并打印到控制台
                        while (true){
                            InputStream is = client.getInputStream();
                            int i = is.read(bytes);// 读取几个字节，就返回几
                            System.out.println(new String(bytes, 0, i));
                        }





                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }



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
