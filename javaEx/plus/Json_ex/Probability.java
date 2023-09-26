package javaEx.plus.Json_ex;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import javaEx.plus.Io.homework.day4.json;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/22 11:49
 * @desciption:
 */
public class Probability {
    public static void main(String[] args) {

        String data = """
                                {
                                "websites":[
                        {
                        "name": "云创动力", 
                        "url": "https://www.ycdledu.com"
                        },
                        {
                        "name": "开发喵", 
                        "url": "https://www.kaifamiao.com"
                        },
                        {
                        "name": "开发喵星球", 
                        "url": "https://kaifamiao.dev"
                        },
                        {"name": "kaifamiao", 
                        "url": "https://www.ycdledu.com"
                        }
                        ]
                }
                """;
        //两种方法:
        //1.通过解析数组中的字段进行新建对象
        //2.通过自定义反序列化
        //解析json
        JSONObject jsonObject = JSON.parseObject(data);
        JSONArray array = jsonObject.getJSONArray("websites");
        Website[] websites = new Website[array.size()];
        //得到website数组
        for (int i = 0; i < array.size(); i++) {
            JSONObject obj = array.getJSONObject(i);
            String name = obj.getString("name");
            String url = obj.getString("url");
            websites[i] = new Website(name, url);
        }
        //给定url数组
        String []urls = new String[websites.length];

        for (int i = 0; i < websites.length; i++) {
            urls[i] = websites[i].getUrl();
        }

      IterArray(urls);

    }


    public static void IterArray(String[] urls) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(urls.length, urls.length, 0, TimeUnit.NANOSECONDS,
                new SynchronousQueue<>());
        for ( int i = 0; i < urls.length; i++) {
             int count = i;
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public  void run() {
                    try {
                        Check(new URL(urls[count]));

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
            });
        }
        threadPoolExecutor.shutdown();
        try {
            threadPoolExecutor.awaitTermination(5, TimeUnit.SECONDS);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }

    public static void Check(URL url) throws IOException {
        long time = System.currentTimeMillis();
        HttpURLConnection httpURLConnection  = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("HEAD");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.connect();
        int result =  httpURLConnection.getResponseCode();
        System.out.println(url + " 响应代码: " + result + " 响应时间: " + (System.currentTimeMillis() - time) + "ms");
        httpURLConnection.disconnect();

    }


}

class Website implements Serializable {
    private String name;
    private String url;

    public Website() {
    }

    public Website(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return name + url;
    }
}