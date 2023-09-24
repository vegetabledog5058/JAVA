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

        AtomicIntegerArray results =  IterArray(urls);
        System.out.println((results));

    }


    public static AtomicIntegerArray IterArray(String[] urls) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(urls.length, urls.length, 0, TimeUnit.NANOSECONDS,
                new SynchronousQueue<>());
        AtomicIntegerArray results = new AtomicIntegerArray(urls.length);
        for ( int i = 0; i < urls.length; i++) {
             int count = i;
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public  void run() {
                    try {
                       int result =  Check(new URL(urls[count]))? 1:0;
                       results.set(count,result);

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
        return results;
    }

    public static boolean Check(URL url) throws IOException {
        HttpURLConnection httpURLConnection  = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("HEAD");
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.connect();
        boolean result =  httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK;
        return result;
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