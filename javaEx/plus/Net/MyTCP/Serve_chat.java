package javaEx.plus.Net.MyTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/21 11:52
 * @desciption:
 */
public class Serve_chat {
    public static void main(String[] args) {

//        ConcurrentHashMap<String, Socket> users = new ConcurrentHashMap<>();
//        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 50, 0L, TimeUnit.NANOSECONDS, new SynchronousQueue<>(), new ThreadPoolExecutor.AbortPolicy());
//        try (ServerSocket socket = new ServerSocket(8888);
//        ){
//            while (true){
//                Socket ss = socket.accept();
//                pool.execute(() -> {
//                    System.out.println("接收到来自 " + ss.getInetAddress() + "的请求");
//                    InputStream inputStream = null;
//                    try {
//                        inputStream = ss.getInputStream();
//                        byte bytes[] = inputStream.readAllBytes();
//
//
////                        OutputStream content = new OutputStreamWriter();
//                        System.out.println("接收到" + ss.getInetAddress() + " 文件：" + bytes.length + " byte");
//
//                        //返回请求
//                        OutputStream outputStream = ss.getOutputStream();
//                        outputStream.write("收到".getBytes());
//                        ss.shutdownOutput();
//
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//
//                });
//
//            }
//
//
//
//
//
//
//
//
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }





                ConcurrentHashMap<String, Socket> users = new ConcurrentHashMap<>();
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


//                        OutputStream content = new OutputStreamWriter();
                        System.out.println("接收到" + ss.getInetAddress() + " 文件：" + bytes.length + " byte");

                        //返回请求
                        OutputStream outputStream = ss.getOutputStream();
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
