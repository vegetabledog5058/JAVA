package Class.test;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/19 19:42
 * @desciption:
 */
public class lock {
    public static void main(String[] args) {
        Object a = new Object();

        Runnable r = () -> {
            synchronized (a){
                System.out.println("111");
                System.out.println("111");
                System.out.println("111");
            }

        };

        Runnable x = () -> {
            synchronized (a) {
                System.out.println("222");
                System.out.println("222");
                System.out.println("222");

            } ;
        };
        Runnable s = new Runnable() {
            @Override
            public void run() {
                System.out.println("222");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("222");
                System.out.println("222");
            }
        };



    }
}

