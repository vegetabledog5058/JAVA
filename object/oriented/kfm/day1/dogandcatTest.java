package object.oriented.kfm.day1;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/15 19:30
 * @desciption:
 */
public class dogandcatTest {
    public static void main(String[] args) {
        Cat cat = new Cat("花色","波斯猫");
        Dog dog = new Dog("黑色","藏獒");

        cat.eat();
        cat.catchMouse();
        dog.eating();
        dog.watching();



    }
}
