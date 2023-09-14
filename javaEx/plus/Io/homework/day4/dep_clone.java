package javaEx.plus.Io.homework.day4;

import com.alibaba.fastjson.JSON;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/14 19:47
 * @desciption:
 */
public class dep_clone {
    public static void main(String[] args) {
        Animal animal1 = new Animal("好大儿",1);
        animal1.setAnimal(new Animal("拷贝1",111));

        Animal animal2 = new Animal("魏大儿",2);
        animal2.setAnimal(new Animal("拷贝2",222));

        Animal animal3 = new Animal("test",3);
        animal3.setAnimal(new Animal("拷贝3",333));

        String s1 = JSON.toJSONString(animal1);
        String s2 = JSON.toJSONString(animal2);
        String s3 = JSON.toJSONString(animal3);

        System.out.println(s1);
        System.out.println(s2);

        Animal a1 = JSON.parseObject(s1,Animal.class);
        Animal a2 = JSON.parseObject(s2,Animal.class);
        Animal a3 = JSON.parseObject(s3,Animal.class);


        System.out.println(a1==a2);

        System.out.println(a1.getAnimal()==a2.getAnimal());
        System.out.println(a3.getAnimal()==a2.getAnimal());
//        System.out.println(a1.getAnimal()==animal1.getAnimal());

        System.out.println(a1.getAnimal()==animal1.getAnimal());
    }
}
