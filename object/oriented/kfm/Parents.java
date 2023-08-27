package object.oriented.kfm;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/27 12:25
 * @desciption:
 */

class child extends Parents {
    static Parents p1 = new Parents(1);
    Parents p3 = new Parents(3);

    child(int i) {
        super(i);
        System.out.println("child" + i);
    }


    public static void main(String[] args) {
        Parents p2 = new child(2);
    }
}

public class Parents {
    Parents(int i) {

        System.out.println("Parents" + i);
    }
}
