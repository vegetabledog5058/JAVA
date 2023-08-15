package object.oriented.kfm.day1;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/15 19:07
 * @desciption:
 */
public class girlfriendTest {
    public static void main(String[] args) {
        Girlfriend npy = new Girlfriend();
        npy.name = "翠花";
        npy.height = 155.0;
        npy.weight = 130.0;
        npy.intro();
        npy.wash();
        npy.cook();
    }
}
