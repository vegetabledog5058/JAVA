package javaEx.plus.Io.homework.day2;

import java.io.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/12 19:36
 * @desciption:
 */
public class FileCutter {
    /**
     * 将指定文件切割为不超过 size 大小的 N 份后，依次序放入到 directory 目录中
     *
     * @param original  被拆分的原始文件
     * @param size      表示被拆分后的单个文件的最大体积
     * @param directory 表示将拆分后的多个文件放入到哪个目录中
     * @return 返回切割后的文件数目
     */

    //计算数量
   /* public static int split(final File original, final long size, final File directory) {
        long fileSize = original.length(); // 原始文件的大小
        long maxSize = size ; // 指定的文件大小上限
        int n = (int) Math.ceil((double) fileSize / maxSize);
        try (FileInputStream fileInputStream = new FileInputStream(original)) {
            byte[] buffer = new byte[(int) (maxSize)]; // 缓冲区大小设置为 size MB
            for (int i = 1; i <= n; i++) {
                String fileName = "file" + (i) + ".temp";
                File file = new File(directory, fileName);

                try (FileOutputStream fileOutputStream = new FileOutputStream(file);
                     BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
                    int bytesRead;

                    // 读取文件内容到缓冲区
                    bytesRead = fileInputStream.read(buffer);

                    if (bytesRead != -1) {
                        // 写入缓冲区内容到文件
                        bufferedOutputStream.write(buffer, 0, bytesRead);
                        bufferedOutputStream.flush();
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return n;
    }*/
//直接分割
    public static int split(final File original, final long size, final File directory) {
        if(!original.isFile()||original==null){
            return 0;
        }
        if(directory.isDirectory()&&directory.exists()){
            directory.mkdirs();
        }

        //拆分文件数量
        int count = 0;


        try (FileInputStream fileInputStream = new FileInputStream(original)){
           if(size>Integer.MAX_VALUE){
               while (fileInputStream.available()!=0){
                   File file = new File(directory,count++ +".temp");
                   FileOutputStream fileOutputStream = new FileOutputStream(file);

                   long sum = size;
                   while (sum>=Integer.MAX_VALUE-8&&fileInputStream.available()!=0){
                       byte bytes[] = new byte[Integer.MAX_VALUE-8];
                       int readBytes  = fileInputStream.read(bytes);
                       fileOutputStream.write(bytes,0,readBytes);
                       sum-=readBytes;


                   }


               }
           }else {
               //size小于int最大值
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }




    public static void main(String[] args) {
        File file = new File("D:\\Java_Test\\mv.m4s");
        File directory = new File("D:\\Java_Test\\cache_fake");

        split(file, 10<<20, directory);
    }
}
