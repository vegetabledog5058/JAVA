package javaEx.plus.RequestURL;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;

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
        String SendFile = read("javaEx/plus/RequestURL/server.json");
        byte bytes[] = SendFile.getBytes();

        try {
            //创建ftp客户端
            FTPClient ftpClient = new FTPClient();
            //连接ftp服务器(主机服务器和端口)
            ftpClient.connect("8.130.92.162",21);
            //大于200小于300时成功
            if (FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
                System.out.println("FTP连接成功。");
                //建立连接ftp客户端
                boolean result = ftpClient.login("joker","112233");
                if (result) {
                    System.out.println("FTP认证成功。");
                } else {
                    System.out.println("FTP认证失败，用户名或密码错误。");
                }
            } else {
                System.out.println("未连接到FTP服务器。");
                ftpClient.disconnect();
            }
            ftpClient.enterLocalPassiveMode();
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            FileInputStream fileInputStream = new FileInputStream("javaEx/plus/RequestURL/test.txt");
            boolean uploadResult = ftpClient.storeFile("/test",fileInputStream);
            fileInputStream.close();

            if (uploadResult) {
                System.out.println("文件上传成功");
            } else {
                System.out.println("文件上传失败");
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
