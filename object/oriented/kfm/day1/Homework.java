package object.oriented.kfm.day1;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/15 19:41
 * @desciption: 作业
 */
public class Homework {
        {
            printA();
            a = 5;
        }

        int a = 1;

        {
            printA();
        }

        public Homework(int a){
            printA();
            this.a = a;
            printA();
        }


        public void printA(){
            System.out.println(a);
        }

        public static void main(String[] args) {
            new Homework(6);
        }
    }

