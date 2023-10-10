package Class.test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/20 20:01
 * @desciption:test
 *
 */
public class arrays {
    public static void main(String[] args) {
        int []arr = new int[10];
       arr=  Arrays.copyOf(arr,20);
       arr=  Arrays.copyOf(arr,20);
        System.out.println(arr.length);

    }
}
