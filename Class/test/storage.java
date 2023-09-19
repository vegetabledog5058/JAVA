package Class.test;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/19 20:57
 * @desciption:
 */
public class storage {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        Thread thread1 = new Thread(() -> {
            threadLocal.set(1);
            threadLocal.set(3);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t1"+threadLocal.get());
           //threadLocal.remove();
        });
        Thread thread2 = new Thread(() -> {
           // threadLocal.set(2);
            //threadLocal.remove();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("t2"+threadLocal.get());
        });
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(5000);
            System.out.println(threadLocal.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
