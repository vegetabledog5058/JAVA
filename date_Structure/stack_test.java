package date_Structure;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/27 16:04
 * @desciption:
 */
public class stack_test {
    public static void main(String[] args) {
        Stack test = new Stack();
        test.push(1);
        test.push(2);
        test.push(3);
        System.out.println(test.toString());
        test.pop();
        System.out.println(test.toString());
        System.out.println(test.index);
        test.push(4);
        System.out.println(test.toString());


    }
}
