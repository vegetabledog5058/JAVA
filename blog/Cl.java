package blog;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/18 10:19
 * @desciption: ClassIner
 */
public class Cl {
    static int sum = 20;
    int nums =5;
    public static void main(String[] args) {
        int num = 0;
        AtomicInteger ss =  new AtomicInteger(2);
        Runnable r = () -> {
           int sum;

            System.out.println(num);

        };




        Runnable s = new Runnable() {
            int num =7 ;
            int sum = 8;
            int nums;

            @Override
            public void run() {
                System.out.println("www");

                System.out.println(num);

                System.out.println(Cl.sum);
                System.out.println(new Cl().nums);
            }
        };

        Runnable x = new Runnable() {
            int num;
            @Override
            public void run() {

            }
        };
        Thread t1 = new Thread(s);
        t1.start();

    }


}
