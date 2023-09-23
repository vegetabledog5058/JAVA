package javaEx.plus.Json_ex;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import javaEx.plus.Io.homework.day4.json;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;

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
        JSONObject jsonObject = JSON.parseObject(data);
        JSONArray array = jsonObject.getJSONArray("websites");
        Website[] websites = new Website[array.size()];
        for (int i = 0; i < array.size(); i++) {
            JSONObject obj = array.getJSONObject(i);
            String name = obj.getString("name");
            String url = obj.getString("url");
            websites[i] = new Website(name, url);
        }

//        System.out.println(Arrays.toString(websites));


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