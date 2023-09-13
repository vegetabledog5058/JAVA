package date_Structure.homework.day1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/11 17:07
 * @desciption:在当前模块下的 text 文件夹中创建一个 io.txt 文件
 */
public class day1 {
    static File file3 = new File("D:\\Java_Test");
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\Java_Test\\test");
        File file2 = new File("D:\\Java_Test\\test//io.text");

        System.out.println(file1.exists());
        if (!file1.getParentFile().exists()) {
            file1.getParentFile().mkdir();
        }
        file1.mkdir();
        file2.createNewFile();


//搜索文件夹名字数量
        countFile(file1);
        System.out.println(map);
        System.out.println(file1.length());

        //计算指定磁盘大小
        long length = countLength(file1);
        System.out.println(length);


        //过滤器
//        FileFilter fileFilter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isFile();
//            }
//        };

        //lambda表达式
        FileFilter FileFilter = (File pa) -> pa.isFile();
        //      File file33[] = file1.listFiles();
//        System.out.println(Arrays.toString(file33));
//        File file[] = file1.listFiles(FileFilter);
//        System.out.println(Arrays.toString(file));
//实验
//        System.out.println(file3.isDirectory());
//        System.out.println(file2.isDirectory());
//        System.out.println(file1.isDirectory());

//        if (delete(file1)) {
//            System.out.println("文件夹删除成功");
//        } else {
//            System.out.println("文件夹删除失败");
//        }
    }


    private static boolean delete(File dictionary) {
        if (dictionary == null || !dictionary.exists()) {
            return false;
        }

        if (file3.isDirectory()) {
            File file[] = dictionary.listFiles();
            if (file != null) {
                for (File files : file
                ) {
                    delete(files);
                }
            }

        }
        return dictionary.delete();

//         File files[] =  dictionary.listFiles();
//        System.out.println(Arrays.toString(files));


    }

    public static void countFile(File file) {
        FileFilter FileFilter = (File pa) -> pa.isFile();
        File files[] = file.listFiles(FileFilter);

        for (File file1 : files) {
            String last = file1.toString().substring(file1.toString().lastIndexOf("."));
            map.put(last, map.getOrDefault(last, 0) + 1);


        }
    }

    public static long countLengthNodir(File file) {
        long sum = 0;
        File files[] = file.listFiles();
        for (File file2 : files
        ) {
            sum += file2.length();
        }

        return sum >> 20;
    }

    public static long countLength(File file) {
        long sum = 0;

        if (file.isDirectory()) {
            File files[] = file.listFiles();
            for (File file2 : files) {
                sum += countLength(file2);
            }

        }else {
            sum+=file.length();
        }

        return sum ;
    }


}

