package javaEx.plus.Io.homework.day4;

import com.alibaba.fastjson.JSON;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/14 19:10
 * @desciption:
 */
public class json {
    public static void main(String[] args) {
        // obj --> str
        String s = JSON.toJSONString(new Animal("魏大儿",0));
        System.out.println(s);
        String jsonStr = """
                    {
                        "name": "秦爽",
                        "score": 60,
                        "gender": "男"
                    }""";
        Animal animal = JSON.parseObject(jsonStr,Animal.class);
        System.out.println(animal);

    }
}
