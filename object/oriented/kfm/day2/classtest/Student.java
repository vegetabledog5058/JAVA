package object.oriented.kfm.day2.classtest;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/16 16:56
 * @desciption:
 */
public class Student {
    /*属性：姓名（name）、年龄（age）、学号（studentId）、成绩（score）
    方法：构造方法、获取姓名的方法、获取年龄的方法、获取学号的方法、获取
    成绩的方法、设置成绩的方法*/

    private String name;
    private Integer age;
    private String studentID;
    private Integer score;

    public Student() {

    }

    public Student(String name, Integer age, String studentID, Integer score) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


}
