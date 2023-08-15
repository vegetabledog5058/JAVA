package object.oriented.array;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/14 23:10
 * @desciption: 测试类
 */
public class phonePhone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //新建对象数组
        phone arr[] = new phone[3];
        for (int i = 0; i < arr.length; i++) {
            phone p = new phone();
            String brand = sc.next();
            int price = sc.nextInt();
            String color = sc.next();
            p.setBrand(brand);
            p.setPrice(price);
            p.setColor(color);
            arr[i] = p;
        }

        //遍历对象数组
        for (int i = 0; i < arr.length; i++) {
            phone p = arr[i];
            System.out.println(p.getBrand() + "," + p.getPrice() + "," + p.getColor());
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            phone p = arr[i];

            sum += p.getPrice();
        }
        double avg = sum*1.0 / 3;
        System.out.println(avg);

    }
}
