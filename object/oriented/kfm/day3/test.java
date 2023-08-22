package object.oriented.kfm.day3;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/22 21:06
 * @desciption:
 */
public class test {
    public static void main(String[] args) {
        CAB cab = new CAB();
        Person person1 = new Person("张亿多",'男',22,false);
        Person person2 = new Person("xxx",'女',21,false);
        cab.canMarry(person1,person2);
        System.out.printf(person1.toString()+"和"+person2.toString()+"可以结婚");
    }
}
