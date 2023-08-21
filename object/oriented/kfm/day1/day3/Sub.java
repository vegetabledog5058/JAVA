package object.oriented.kfm.day1.day3;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/17 14:09
 * @desciption:
 */


public class Sub extends Sup {

    static int a = 11;
     int b = 22;


    public  Sub(int a, int b) {
        super(a, b);
        print();
    }

@Override
    public  void print() {

        System.out.println("Sup: " + a);
        System.out.println("Sup: " + b);
    }

}


