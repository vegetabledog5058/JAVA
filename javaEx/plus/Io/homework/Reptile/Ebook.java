package javaEx.plus.Io.homework.Reptile;


import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/14 21:45
 * @desciption:
 */
public class Ebook {
    public static void main(String[] args)  {

       // String request = HttpUtil.get("https://www.bige3.cc/book/136277/1.html");

        String url ="https://www.bige3.cc/book/136277/1.html";

        outPutEbook(url,"凡人修仙传");



    }
    public  static void outPutEbook(String URL,String name){
        HttpResponse response = HttpRequest.get(URL).execute();
        //网页响应结果
        String result = response.toString();

        //Jsoup解析html
        Document parse = Jsoup.parse(result);

        //根据id查找,获取id标签
        Element chapeterContent = parse.getElementById("chaptercontent");
        //标题
        Elements e1 = parse.getElementsByClass("title");
        String topic = e1.text();
        //取得文本节点node
        List<TextNode> textNodes = chapeterContent.textNodes();
        //保存到文件
        try(FileOutputStream fileOutputStream = new FileOutputStream("D:\\Java_Test\\novies\\"+name+".txt",true)){
            fileOutputStream.write(topic.getBytes());
            for (TextNode node:textNodes) {
                if(!node.toString().contains("笔趣阁手机版")&&!node.toString().contains("请收藏")){
                    fileOutputStream.write(node.toString().getBytes());
                }
                fileOutputStream.write("\n".getBytes());
            }
            fileOutputStream.write("本章结束\n".getBytes());
            System.out.println("写入一章");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 找到下一章的链接
        String attr = parse.getElementById("pb_next").attr("href");



        if (attr.contains("22")){ // 11 是最后一章
            return;
        }
        final String pre_path = "https://m.bqgbi.com";
        //下一章url
        String nextUrl = pre_path + attr;
        System.out.println(nextUrl);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       outPutEbook(nextUrl,name);

    }


}
