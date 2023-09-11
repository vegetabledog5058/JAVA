package javaEx.plus.homework.day0904;

import javaEx.plus.collection.Student;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/4 19:55
 * @desciption: 创建一个List集合表示学生列表。添加10个学生并设计方法实现根据学生成绩排序和计算 平均成绩功能。
 */
public class StudentList {
    public static void main(String[] args) {
        Student student1 = new Student(29, "张三", 95);
        Student student2 = new Student(22, "李四", 89);
        Student student3 = new Student(26, "王五", 84);
        Student student4 = new Student(33, "赵六", 91);
        Student student5 = new Student(43, "马七", 84);
        Student student6 = new Student(24, "佚名", 88);
        Student student7 = new Student(21, "马小跳", 99);
        Student student8 = new Student(13, "熊大", 77);
        Student student9 = new Student(23, "光头强", 100);
        Student student10 = new Student(63, "熊二", 74);

        Vector vector = new Vector();

        vector.add(student1);
        vector.add(student2);
        vector.add(student3);
        vector.add(student4);
        vector.add(student5);
        vector.add(student6);
        vector.add(student7);
        vector.add(student8);
        vector.add(student9);
        vector.add(student10);

        vector.sort((o1, o2) -> {
            if(o1 instanceof Student stu1&& o2 instanceof Student stu2)
                return 0-(stu1.getScore()-stu2.getScore());
            else throw new ClassCastException("类型不匹配");
        }
        );
        System.out.println(vector);

        //平均成绩
        double sum = 0;
//        for (Object score:vector
//             ) {
//            Student student = (Student) score;
//            sum+=student.getScore();
//        }


        //迭代器
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()){
            Object tem = iterator.next();
            if(tem instanceof Student stu){
                sum+=stu.getScore();
            }
        }

        System.out.println("平均成绩是"+sum/10);


    }

}
