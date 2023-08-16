package object.oriented.kfm.day2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/16 16:53
 * @desciption:
 */
public class test1 {
    public class Main {
        public static void main(String[] args) {
          /* // change(10);
            Student stu = new Student();
            change(stu);
            System.out.println(stu.getAge());*/
        }

        public static void change(final Student stu) {
            // Trying to modify a final parameter (this won't compile)
            // num++;

            // This method does not compile, so I'm commenting it out
            // public static void change(final Student stu) {
            //     stu.setAge(28);
            // }
        }
    }

}
