package javaEx.plus.collection;

import java.util.Comparator;
import java.util.Vector;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/4 15:47
 * @desciption: 测试
 */
public class Mylist {
    public static void main(String[] args) {

        Student student1 = new Student(24, "佚名", 88);
        Student student2 = new Student(21, "马小跳", 99);
        Student student3 = new Student(13, "熊大", 77);
        Student student4 = new Student(23, "光头强", 100);
        Student student5 = new Student(63, "熊二", 73);


        Vector<Student> vector = new Vector();
        vector.add(student1);
        vector.add(student2);
        vector.add(student3);
        vector.add(student4);
        vector.add(student5);
//        sort(vector,new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                if (o1 instanceof Student stu1 &&o2 instanceof Student stu2){
//                    if (stu1.getAge()< stu2.getAge())return -1;
//                    else if(stu1.getAge()> stu2.getAge())return 1;
//                    else return 0;
//                }throw new ClassCastException("类型不匹配");
//            }
//        });
        sort(vector, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() < o2.getAge()) return -1;
                else if (o1.getAge() > o2.getAge()) return 1;
                else return 0;
            }

        });

        //lambda表达式
//        vector.sort((o1,o2)->{
//                if (o1 instanceof StudentList stu1 &&o2 instanceof StudentList stu2){
//                     return stu1.getAge()- stu2.getAge();
//
//                }throw new ClassCastException("类型不匹配");
//
//        });


        //当返回值只有一句可以不写方法体和return
        方法引用: vector.sort(Comparator.comparingInt(Student::getAge));
        //vector.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(vector.toString());
        Student student = (Student) vector.get(3);
        student.setName("三娃");
        vector.add(4, new Student(20, "五娃", 23));
        System.out.println(vector.toString());
        vector.remove(vector.size() - 1);

        //最终姓名输出
        System.out.println("名字遍历:");
        for (int i = 0; i < vector.size(); i++) {
            Student studentname = (Student) vector.get(i);
            System.out.print(studentname.getName() + "\t");
        }


    }


    public static void sort(Vector vector, Comparator comparator) {
        for (int i = 0; i < vector.size() - 1; i++) {
            for (int j = 0; j < vector.size() - i - 1; j++) {
                int result = comparator.compare(vector.get(j), vector.get(j + 1));
                if (result > 0) {
                    Object tem = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, tem);
                }


            }
        }
    }


}
