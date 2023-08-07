package com.java.basis.comprehensive;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/6 23:40
 * @desciption: 飞机票
 */
public class ticket_plane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextInt();
        int month = sc.nextInt();
        String l = sc.next();
        if(month<=10&&month>=5){
           price = Pricew(l,price);
        }else if (month>=1&&month<=4||month>=11&&month<=12){
            price = Priced(l,price);
        }else {
            System.out.println("不合法的输出");
        }
        System.out.println(price);

    }
    public static double Pricew(String l,double price){
        switch (l){
            case "头等舱"-> price=(0.9*price);
            case "经济舱"-> price=(0.85*price);
        }
        return price;
    }
    public static double Priced(String l,double price){
        switch (l){
            case "头等舱"->
                    System.out.println(0.7*price);
            case "经济舱"-> System.out.println(0.65*price);

        }return price;
    }
}
