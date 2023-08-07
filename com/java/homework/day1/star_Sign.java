package com.java.homework.day1;

import java.util.Scanner;

public class star_Sign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mon = sc.nextInt();
        int day = sc.nextInt();

        if(day<32&day>0){}
        switch (mon) {
            case 1: {
                if (day >= 20&day<31) {
                    System.out.println("水平");
                } else {
                    System.out.println("摩羯");
                }
            }break;
            case 2: {
                if (day >= 19&day<28) {
                    System.out.println("双鱼");
                } else {
                    System.out.println("水平");
                }
            }break;
            case 3: {
                if (day >= 21&day<31) {
                    System.out.println("白羊");
                } else {
                    System.out.println("双鱼");
                }
            }break;
            case 4: {
                if (day >= 20) {
                    System.out.println("金牛");
                } else {
                    System.out.println("白羊");
                }
            }break;
            case 5: {
                if (day >= 21) {
                    System.out.println("双子");
                } else {
                    System.out.println("金牛");
                }
            }break;
            case 6: {
                if (day >= 21) {
                    System.out.println("巨蟹");
                } else {
                    System.out.println("双子");
                }
            }break;
            case 7: {
                if (day >= 23) {
                    System.out.println("狮子");
                } else {
                    System.out.println("巨蟹");
                }
            }break;
            case 8: {
                if (day >= 23) {
                    System.out.println("处女");
                } else {
                    System.out.println("狮子");
                }
            }break;
            case 9: {
                if (day >=22) {
                    System.out.println("天秤");
                } else {
                    System.out.println("处女");
                }
            }break;
            case 10: {
                if (day >=23) {
                    System.out.println("天蝎");
                } else {
                    System.out.println("天秤");
                }
            }break;
            case 11: {
                if (day >= 22) {
                    System.out.println("射手");
                } else {
                    System.out.println("天蝎");
                }
            }break;
            case 12: {
                if (day >= 22) {
                    System.out.println("水平");
                } else {
                    System.out.println("摩羯");
                }
            }break;

            }
        }
    }

