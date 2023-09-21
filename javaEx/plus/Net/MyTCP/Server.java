package javaEx.plus.Net.MyTCP;

import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/21 9:23
 * @desciption:
 */
public class Server {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 50, 0L, TimeUnit.NANOSECONDS, new SynchronousQueue<>(), new ThreadPoolExecutor.AbortPolicy());
        try (ServerSocket socket = new ServerSocket(8888);
        ){


            while (true){
                Socket ss = socket.accept();
                pool.execute(() -> {
                    System.out.println("接收到来自 " + ss.getInetAddress() + "的请求");
                    InputStream inputStream = null;
                    try {
                        inputStream = ss.getInputStream();
                        byte bytes[] = inputStream.readAllBytes();

                       // System.out.println(new String(bytes));

                        FileOutputStream fileOutputStream =
                                new FileOutputStream( "D:\\Java_Test\\Net\\"+ System.currentTimeMillis() +
                                ".jpg");



                        fileOutputStream.write(bytes);
                        fileOutputStream.close();
                        System.out.println("接收到" + ss.getInetAddress() + " 文件：" + bytes.length + " byte");

                        //返回请求
                        OutputStream outputStream = ss.getOutputStream();
                      //  outputStream.write(sc.next().getBytes());
                        outputStream.write("收到".getBytes());
                        ss.shutdownOutput();

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                });

            }










        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
