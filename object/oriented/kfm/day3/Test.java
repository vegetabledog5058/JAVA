package object.oriented.kfm.day3;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/17 14:10
 * @desciption:
 */
public class Test {


    public static void main(String[] args) {
       // Sub stu= new Sub(6, 9);
        Student stu = new Student();
        Student stu1 = new Student();
        System.out.println(stu.hashCode());
        System.out.println(stu1.hashCode());
        // 调用 static 方法时，看 sub 对象的类型是谁
//        sub.print();
    }


}
