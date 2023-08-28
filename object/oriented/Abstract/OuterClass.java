package object.oriented.Abstract;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/28 17:31
 * @desciption: 匿名类
 */
public class OuterClass {
    private int outerPrivateVariable = 10;

    private void outerPrivateMethod() {
        System.out.println("Outer private method");
    }

    class InnerClass {
        private int innerPrivateVariable = 20;

        private void innerPrivateMethod() {
            System.out.println("Inner private method");
            System.out.println("Accessing outer private variable: " + outerPrivateVariable);
            outerPrivateMethod();
        }

        public void accessPrivateMembers() {
            System.out.println("Accessing inner private variable: " + innerPrivateVariable);
            innerPrivateMethod();
        }
    }

    public void test() {
        InnerClass innerInstance = new InnerClass();
        innerInstance.accessPrivateMembers();
    }

    public static void main(String[] args) {
        OuterClass outerInstance = new OuterClass();
        outerInstance.test();
    }
}