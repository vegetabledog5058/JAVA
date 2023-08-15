package object.oriented.kfm.day1;

import object.oriented.kfm.day1.Student;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/15 18:44
 * @desciption: 测试类
 */
public class studentTest {
    public static void main(String[] args) {
        Student s = new Student();
        String info = s.say();
        System.out.println(info);
    }
}
