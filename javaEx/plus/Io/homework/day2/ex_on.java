package javaEx.plus.Io.homework.day2;

import java.io.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/12 16:14
 * @desciption:In the moonlight by the window,
 * Can it be hoarfrost on the ground
 * Looking up, I find the moon bright
 * Bowing, In homesickness I'm drowned
 */
public class ex_on {
    public static void main(String[] args) {
//        File file = new File("D:\\Java_Test");
        //添加
        String s1 = "the moonlight by the window,";
        String s2 = "Can it be hoarfrost on the ground";
        String s3 = "Looking up, I find the moon bright";
        String s4 = "Bowing, In homesickness I'm drowned";
        try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\Java_Test\\test.txt");) {
            byte bytes1[] = s1.getBytes();
            byte bytes2[] = s2.getBytes();
            byte bytes3[] = s3.getBytes();
//            byte bytes4[] = s4.getBytes();

            fileOutputStream.write(bytes1);
            fileOutputStream.write('\r');
            fileOutputStream.write(bytes2);
            fileOutputStream.write('\r');
            fileOutputStream.write(bytes3);
            fileOutputStream.write('\r');
            fileOutputStream.write("Bowing, In homesickness I'm drowned".getBytes());
            fileOutputStream.write('\r');
            fileOutputStream.write("这是追加".getBytes());
            fileOutputStream.write("这是追加".getBytes());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //复制
        try (
                FileInputStream file = new FileInputStream("D:\\Java_Test\\test.txt");
                FileOutputStream fileOutputStream = new FileOutputStream("D:\\Java_Test\\test1.txt");

        ) {
    //方法一


  //方法二
          /*  //解码
           byte byteTxt[] =  file.readAllBytes();
           //编码
            fileOutputStream.write(byteTxt);*/
//方法三
            file.transferTo(fileOutputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
