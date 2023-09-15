package javaEx.plus.Io.homework.day4;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/14 21:30
 * @desciption:  xml  dom4J
 */
public class ex_xml {
    public static void main(String[] args) {
        File file = new File("file\\test.xml");
        //创建解析器
        SAXReader saxReader = new SAXReader();
        try {
            Document document = saxReader.read(file);





        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }
}
