package javaEx.plus.Net.MyTCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/21 9:23
 * @desciption:
 */
public class MySocket {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        File file = new File("D:\\Java_Test\\ph1.jpg");
//        InetAddress ip = InetAddress.getLocalHost();
        try(
            FileInputStream ph = new FileInputStream(file);

        ) {
            while (true) {
                Socket client = new Socket(InetAddress.getLocalHost(),8888);

                OutputStream outputStream = client.getOutputStream();
               // outputStream.write(sc.next().getBytes());

                byte byteContent[] = new byte[1024 * 60];
                 outputStream.write(ph.readAllBytes());
              int len;
//            while ((len = ph.read(byteContent))!=-1){
//                OutputStream outputStream = client.getOutputStream();
//            }
                client.shutdownOutput();


                //接收服务端反馈
                InputStream inputStream = client.getInputStream();
                System.out.println("对方:" + new String(inputStream.readAllBytes()));
                client.shutdownInput();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
