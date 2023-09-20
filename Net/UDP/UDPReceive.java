package Net.UDP;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Base64;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/20 15:26
 * @desciption:
 */
public class UDPReceive {

    public static void main(String[] args) {



        try (FileOutputStream os = new FileOutputStream("D:\\Java_Test\\ph222.jpg",true);
             DatagramSocket socket = new DatagramSocket(8888);){
//2.创建socket对象

//3.接收信息
            byte[] bytes = new byte[1024 * 1024 * 100];
            DatagramPacket packet = new DatagramPacket(bytes,bytes.length);

            while (true){

                socket.receive(packet);
                String data = new String(packet.getData(),0, packet.getLength());
                JSONObject jsonObject = JSONObject.parseObject(data);
                if(jsonObject.getBoolean("end")){
                    break;
                }
                String msg = jsonObject.getString("data");
                byte[] bytes1 = Base64.getDecoder().decode(msg);
                os.write(bytes1);
            }

           // String str = new String(packet.getData(), 0, packet.getLength());
           // System.out.println(packet.getAddress().getHostAddress() + "发送了: " +str);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
