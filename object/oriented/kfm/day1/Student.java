package object.oriented.kfm.day1;

import java.util.IdentityHashMap;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/15 18:40
 * @desciption: day1
 */
public class Student {
   /* 编写一个Student类，包含name、gender、age、id、score属性，分别为String、String、int、int、double类型。
     类中声明一个say方法，返回String类型，方法返回信息中包含所有属性值。
     在另一个StudentTest类中的main方法中，创建Student对象，并访问say方法和所有属性，并将调用结果打印输出*/

    String name;
    String gender;
    int age;
    int id;
    double score;

    public String say() {
        return "姓名"+name+"\t" + "性别"+gender+"\t"+"年龄"+gender+"\t"+"学号"+id+"\t"+"分数"+score+"\t";
    }
}
