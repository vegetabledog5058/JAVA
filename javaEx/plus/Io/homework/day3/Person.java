package javaEx.plus.Io.homework.day3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/13 21:45
 * @desciption:
 */
public class Person {
    String name = "person";

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    String name="Student";
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

}
class Pupil extends Student{
    String name="Pupil";
    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Test {
    public static void show(List<?extends Student> students){
        students.stream().forEach(s -> System.out.println(s));
    }
    public static void display(List<?super Student> students){
        students.stream().forEach(s -> System.out.println(s));
    }
    public static void main(String[] args) {
        List<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil());
        pupils.add(new Pupil());
        show(pupils);
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person());
        peoples.add(new Person());
        display(peoples);
    }
}
