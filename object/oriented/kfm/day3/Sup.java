package object.oriented.kfm.day3;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/17 12:04
 * @desciption:
 */
public class Sup {

   int a = 1;

    static {
        b = 3;
    }

    static int b = 2;

    public Sup(int a, int b) {
        print();
        this.a = a;
        this.b = b;
        print();
    }

    public  void print() {
        System.out.println("Sub"+a);
        System.out.println("Sub"+b);
    }
}



