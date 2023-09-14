package javaEx.plus.Io.homework.day4;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/14 20:14
 * @desciption:
 */
public class Array_json {
    public static void main(String[] args) {
        String str ="[\"a\",\"b\",\"c\"]";
       String arr[] = JSON.parseObject(str,String[].class);
        JSONArray JSONArray = JSON.parseArray(str);

        System.out.println(JSONArray);
        System.out.println(Arrays.toString(arr));

        String strs = """
                [{
                  	"name": "大二",
                  	"id": 808,
                     "animal": {
                  		"name": "蠢蠢",
                  		"id": 1
                  	}
                  }, "name": "傻子",
                  	"id": 8,
                     "animal": {
                  		"name": "哈哈",
                  		"id": 12
                  	}
                  }, "name": "魏儿",
                  	"id": 88,
                     "animal": {
                  		"name": "三傻",
                  		"id": 13
                  	}
                  }]""";
        //string --> obj


    }
}
