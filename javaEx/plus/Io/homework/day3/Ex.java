package javaEx.plus.Io.homework.day3;

import java.io.*;
import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/13 20:16
 * @desciption:
 */
public class Ex {
    public static void main(String[] args) {
        File file = new File("D:\\Java_Test\\homework\\day0913.txt");
        if(!file.getParentFile().exists()){
          file.getParentFile().mkdirs();
            if(!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            FileWriter fileWriter = new FileWriter("D:\\Java_Test\\homework\\day0913_sort.txt");
        ){
            String line;
            List<String>list = new ArrayList<>();
            while ((line = bufferedReader.readLine())!=null){
                list.add(line);
            }
            Collections.sort(list,
                    Comparator.comparingInt(e -> Integer.parseInt(e.toString().substring(0, 1))));
            for (int i = 0; i < list.size(); i++) {
                fileWriter.write(list.get(i));
                fileWriter.write("\n");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
