package object.oriented.cart;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/13 18:43
 * @desciption: 测试类
 */
public class testCar {
    public static void main(String[] args) {
        Car []arr = new Car[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Car a = new Car();
            System.out.println("输入汽车品牌");
            String brand = sc.next();
            System.out.println("输入价格");
            int price = sc.nextInt();
            System.out.println("输入颜色");
            String color = sc.next();
            a.setBrand(brand);
            a.setPrice(price);
            a.setColor(color);
            //还需要把汽车对象放进数组
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            Car car = arr[i];
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
        }


    }
}
