package object.oriented.comprehensive;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/14 23:41
 * @desciption: 学生类
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(){

    }
    public Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
