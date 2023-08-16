package object.oriented.kfm.day2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/16 19:14
 * @desciption:
 */
public class Caltest {
    public static void main(String[] args) {
        GeometryCalculator cal = new GeometryCalculator();
        double output = cal.calculateCircleArea(2.0);
        System.out.println(output);

    }
}
