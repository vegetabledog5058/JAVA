package date_Structure;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/27 16:57
 * @desciption:
 */
public class queue_test {
    public static void main(String[] args) {

        queue test = new queue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        System.out.println(test.toString());
        Object obj = test.dequeue();
        System.out.println(test.toString());
        System.out.println(test.peek());
        Object obj2 = test.dequeue();
        System.out.println(test.toString());

    }
}
