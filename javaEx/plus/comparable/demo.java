package javaEx.plus.comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/31 10:46
 * @desciption:
 */
public class demo {
    public static void main(String[] args) {
        String[] arr = {"cbd", "abc", "bca", "cba", "bac", "cab", "ab"};

        Student[] stus = {
                new Student("张三", 23, 90),
                new Student("李四", 24, 80),
                new Student("王五", 23, 70),
                new Student("赵六", 24, 80),
                new Student("田七", 25, 50)
        };

//匿名类
//        Arrays.sort(stus, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//
//                if (o1.getAge() > o2.getAge()){
//                   return 1;
//               } else if (o1.getAge() < o2.getAge()){
//                   return -1;
//               } else {
//                   return 0;
//               }
//
//            }
//        });

        //lamda表达式(函数接口)
        Arrays.sort(stus, (o1, o2) -> {
            // 只比较年龄
            if (o1.getAge() > o2.getAge()){
                return 1;
            } else if (o1.getAge() < o2.getAge()){
                return -1;
            } else {
                return 0;
            }

        });
//        sort(arr);
        //sort(stus);
        // 遍历
        for (Student stu : stus) {
            System.out.println(stu);
        }
    }
    //比较对象数组,自然比较
    private static void sort(Student[] stus) {
        // 冒泡
        for (int i = 0; i < stus.length - 1; i++) {
            // 每次比较的次数
            for (int j = 0; j < stus.length - 1 - i; j++) {
                // 比较
                if (stus[j].compareTo(stus[j + 1]) > 0) {
                    // 交换
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }
    private static void sort(String[] arr) {
        // 冒泡
        for (int i = 0; i < arr.length - 1; i++) {
            // 每次比较的次数
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 比较
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // 交换
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
class studentcomparetor implements Comparator{
    /**
     * 比较两个 Student 对象的大小
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof  Student student&&o2 instanceof Student student1){
            if(student.getAge()>student1.getAge()){
                return 1;
            }else if (student.getAge()<student.getAge()){
                return -1;
            }
            // 比较成绩
            if (student.getScore() > student1.getScore()) {
                return 1;
            } else if (student.getScore() < student1.getScore()) {
                return -1;
            }
            // 比较名字
            return student.getName().compareTo(student1.getName());

        }throw new CompareException("类型不匹配");

    }
}
class Student implements Comparable, Cloneable {

    private String name;
    private int age;
    private int score;

    public Student() {
        super();
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) throws RuntimeException {
        if (o instanceof Student stu) {
            //比较权重
            if (this.age > stu.age) {
                return 1;
            } else if (this.age < stu.age) {
                return -1;
            }
            if (this.score > stu.score) {
                return 1;
            } else if (this.score < stu.score) {
                return -1;
            }
            return this.name.compareTo(stu.name);
        }
        /**
         *  checked exception 检查异常，必须处理
         *      Exception 异常
         *  unchecked exception 非检查异常，可以处理，也可以不处理
         *      RuntimeException 运行时异常
         *      Error 错误
         *
         *  编译时异常: 代码编译时, 就会报错 javac
         */
        throw new CompareException("类型不匹配");
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
    }
}

class CompareException extends RuntimeException {
    public CompareException() {
    }

    public CompareException(String message) {
        super(message);
    }
}