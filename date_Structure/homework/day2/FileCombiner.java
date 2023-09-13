package date_Structure.homework.day2;

import java.io.*;
import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/13 7:31
 * @desciption:
 */
public class FileCombiner {
    public static long join(final File dir, final File target) {
        //参数校验
        if (dir == null || !dir.isDirectory()) {
            return 0;
        }
        if (target == null) {
            return 0;
        }
        if (!target.getParentFile().exists()) {
            target.getParentFile().mkdirs();
        }
        long size = 0; // 声明用于统计合并后的文件体积的变量
        File[] files = dir.listFiles((file, name) -> name.endsWith(".temp"));
        if (files == null || files.length <= 0) {
            return 0;
        }
//        Arrays.sort(files,File::compareTo);
        Arrays.sort(files, (file1, file2) -> {
            String name1 = file1.getName().split("\\.")[0];
            String name2 = file2.getName().split("\\.")[0];
            return Integer.parseInt(name1) - Integer.parseInt(name2);
        });
        System.out.println(Arrays.toString(files));

        try (FileOutputStream fos = new FileOutputStream(target, true);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            for (File file : files) {
                if (file.length() > Integer.MAX_VALUE - 8) {
                    //不能一次读取
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte bytes[] = new byte[Integer.MAX_VALUE - 8];
                    while (fileInputStream.available() != 0) {
                        int readBytes = fileInputStream.read(bytes);
                        bos.write(bytes, 0, readBytes);
                    }
                    fileInputStream.close();

                } else {
                    try (FileInputStream fileInputStream = new FileInputStream(file);
                         FileOutputStream fileOutputStream = new FileOutputStream(target,true);
                    ) {
                        byte bytes[] = new byte[Integer.MAX_VALUE - 8];
                        int byteRead = fileInputStream.read(bytes);
                        fileOutputStream.write(bytes,0,byteRead);
                    }
                }
                System.out.println("合并一个文件");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            size = target.length();
        }


        return size; // 返回合并后的文件体积
    }

    public static void main(String[] args) {
        File file = new File("D:\\Java_Test\\cache_fake");
        File finalTarget = new File("D:\\Java_Test\\final1");
//        File[] file1 = file.listFiles();
//        System.out.println(file1[0].getName());
        join(file, finalTarget);
    }
}
