package javaEx.plus.collection;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/4 15:44
 * @desciption:/**
 *  * 创建一个集合， 存储 5 个 StudentList 对象(name, age, toString, equals, hashCode, getter/setter).
 *  *  1. 设计方法对集合元素，按照年龄进行排序
 *  *  2. 输出排序后的集合元素
 *  *  3. 将下标为 3 的学生的姓名改成 "三娃"
 *  *  4. 在下标为 4 处添加学生 五娃 20岁
 *  *  6. 删除最后一个学生
 *  *  7. 遍历输出每个学生的姓名
 *  */

public class Student {
    private int age;

    private String name;
    private Integer score;
    public Student() {
    }

    public Student(int age, String name,Integer score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 获取
     * @return age
     */

    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
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

    public String toString() {
        return "StudentList{age = " + age + " name = " + name +"score"+score+ "}"+'\n';
    }
}
