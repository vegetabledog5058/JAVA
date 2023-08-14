package object.oriented.cart;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/13 18:07
 * @desciption: 测试类
 */
public class testCart {
    public static void main(String[] args) {
        Cart []arr = new Cart[3];
        //直接录入
        Cart g1 = new Cart(001,"手机",1000.99,100);
        Cart g2 = new Cart(002,"电脑",7000.99,50);
        Cart g3 = new Cart(003,"手表",2000.88,30);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
         Cart good = arr[i];
            System.out.println(good.getId()+","+good.getName()+","+good.getPrice()+","+good.getStorage());
        }
    }
}
