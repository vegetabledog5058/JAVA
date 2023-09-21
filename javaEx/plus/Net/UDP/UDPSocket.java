package javaEx.plus.Net.UDP;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;


import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/20 15:12
 * @desciption:
 */
public class UDPSocket {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String msg;
//        while (true) {
//            msg = sc.next();
//            if (msg.equals("0")) break;
//
//            DatagramSocket datagramPacket = null;
//            //创建目标主机对象
//            try {
//                //InetAddress address = InetAddress.getLocalHost();
//                InetAddress address = InetAddress.getByName("10.0.4.224");
//                // address  = InetAddress.getByAddress("10.0.4.196".getBytes());
//                int port = 8888;
//                DatagramPacket data = new DatagramPacket(msg.getBytes(), msg.length(), address, port);
//
//                datagramPacket = new DatagramSocket();
//
//                datagramPacket.send(data);
//                System.out.println("发送成功");
//
//
//            } catch (UnknownHostException e) {
//                throw new RuntimeException(e);
//            } catch (SocketException e) {
//                throw new RuntimeException(e);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            } finally {
//                //datagramPacket.close();
//            }
//
//        }
//
//    }



}

class Socket{
    public static void main(String[] args) {
        //  File file = new File("D:\\Java_Test\\ph1.jpg");
        File file = new File("D:\\Java_Test\\ph2.jpg");

        try(FileInputStream fs = new FileInputStream(file);
            DatagramSocket socket = new DatagramSocket();) {
            InetAddress address = InetAddress.getLocalHost();
            byte bytes[] = new byte[1024*30];


            int a;
            while ((a=fs.read(bytes))!=-1){
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("end",false);
                jsonObject.put("data", Base64.getEncoder().encodeToString (Arrays.copyOf(bytes,a)));

                String message = jsonObject.toJSONString();
                DatagramPacket packet = new DatagramPacket(message.getBytes(), message.getBytes().length, address, 8888);
                //DatagramPacket packet1 = new DatagramPacket(bytes,bytes.length, address, 8888);
                socket.send(packet);
                System.out.println("发送成功");
            }


            JSONObject jsonObject = new JSONObject();
            jsonObject.put("end",true);
            jsonObject.put("data","");

            String message = jsonObject.toJSONString();
            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.getBytes().length, address, 8888);
            socket.send(packet);


        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
