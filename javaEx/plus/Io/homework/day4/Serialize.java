package javaEx.plus.Io.homework.day4;

import java.io.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/14 17:26
 * @desciption:
 */
public class Serialize {
    public Serialize() {
    }

    public static void main(String[] args) {
        File file = new File("file\\test.xml");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Animal animal1 = new Animal("好大儿",322);
        Animal animal2 = new Animal("魏老狗",111);



////序列化写入
//        try (FileOutputStream fileOutputStream = new FileOutputStream("file\\test.txt");
//             //ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
//        ){
//
//            //outputStream.writeInt(1);
//
//            outputStream.writeObject(animal1);
//            outputStream.writeObject(animal2);
//
//
//
////            byte bytes[] = byteArrayOutputStream.toByteArray();
////            fileOutputStream.write(bytes);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//animal1.setName("儿子");

        //序列化读取(反序列化)
        try (FileInputStream fileInputStream = new FileInputStream("file\\test.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ){
            // int a = objectInputStream.readInt();
//            System.out.println(a);
            Object o1 = objectInputStream.readObject();
            Object o2 = objectInputStream.readObject();
           System.out.println(o1);
            System.out.println(o2);

//            byte bytes [] =fileInputStream.readAllBytes();
//            String s = new String(bytes);
//            System.out.println(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}
