package javaEx.plus.Io.homework.day2;

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
        long size = 0 ; // 声明用于统计合并后的文件体积的变量
        File[] files = dir.listFiles();
//        Arrays.sort(files,File::compareTo);
        Arrays.sort(files, (file1, file2) -> {
            String name1 = file1.getName();
            String name2 = file2.getName();

            // 提取最后一级文件名
            String[] parts1 = name1.split("\\\\");
            String[] parts2 = name2.split("\\\\");

            String lastPart1 = parts1[parts1.length - 1];
            String lastPart2 = parts2[parts2.length - 1];

            return lastPart2.compareTo(lastPart1);
        });



        try (FileOutputStream fos = new FileOutputStream(target, true);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            for (File file:files) {
                try(FileInputStream fileInputStream = new FileInputStream(file);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                ) {
                    bufferedInputStream.transferTo(bos);

                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            size=target.length();
        }



        return size ; // 返回合并后的文件体积
    }

    public static void main(String[] args) {
        File file = new File("D:\\Java_Test\\cache_fake");
        File finalTarget = new File("D:\\Java_Test\\final");
//        File[] file1 = file.listFiles();
//        System.out.println(file1[0].getName());
        join(file,finalTarget);
    }
}
