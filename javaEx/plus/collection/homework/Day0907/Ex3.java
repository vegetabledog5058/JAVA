package javaEx.plus.collection.homework.Day0907;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/7 19:58
 * @desciption: 有一个员工类Employee, 里面有name、age和salary字段。
 * 请通过 Stream 对多个Employee对象按salary排序,然后取前3个输出
 */
public class Ex3 {

    public static void main(String[] args) {
        Random r = new Random();
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Employee(""+(char)('A'+r.nextInt(25)),r.nextInt(30),r.nextInt(500)+1));
        }
        list.stream().sorted((e1,e2)-> e1.getSalary()-e2.getSalary()).limit(3).forEach(e-> System.out.println(e));
        //方法引用
        //list.stream().sorted(Comparator.comparingInt(Employee::getSalary)).limit(3).forEach(e-> System.out.println
        // (e));
    }


}
class  Employee{
    private String name;
    private Integer age;
    private Integer salary;

    public Employee() {
    }

    public Employee(String name, Integer age, Integer salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取
     * @return salary
     */
    public Integer getSalary() {
        return salary;
    }

    /**
     * 设置
     * @param salary
     */
    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name = " + name + ", age = " + age + ", salary = " + salary + "}";
    }
}
