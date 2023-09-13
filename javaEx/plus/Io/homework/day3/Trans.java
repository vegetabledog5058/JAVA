package javaEx.plus.Io.homework.day3;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/13 16:01
 * @desciption:
 */
public class Trans {
    public static void main(String[] args) {
        File src = new File("D:\\Java_Test\\day0913_sort.txt");
        File origin = new File("D:\\Java_Test\\day0913_sort_charset.txt");
        transferEncoding(src, "GBk", origin, "utf8");
    }

    /*public static boolean transferEncoding(File src, String srcCharset, File origin, String originCharset) {
        try (FileInputStream fileInputStream = new FileInputStream(src);
             FileOutputStream fileOutputStream = new FileOutputStream(origin);
        ) {
            byte bytes[] = fileInputStream.readAllBytes();
            //方法一:字符串直接写入
            String s = new String(bytes, Charset.forName(srcCharset));
            byte bytess[] = s.getBytes(originCharset);
            fileOutputStream.write(bytess);

//            fileWriter.write(s);
            //方法二:字节写入

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }*/

    public static boolean transferEncoding(File src, String srcCharset, File origin, String originCharset) {
        try (FileInputStream fileInputStream = new FileInputStream(src);
             FileOutputStream fileOutputStream = new FileOutputStream(origin);
        ) {
            byte bytes[] = new byte[1024];
            int size;
            while ((size=fileInputStream.read())!=1){
                String s = new String(bytes,0,size,srcCharset);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}
