package com.java.homework.day10String2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/24 19:19
 * @desciption:
 */
public class poke {
    public static void main(String[] args) {
        Character[] assortment = {'♥', '♠', '♣', '♦'};
        String[] poker = {
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K"};
        for (char color: assortment
             ) {

            for (String poke: poker
                 ) {
                System.out.print((color+poke)+"\t");

            }
            System.out.println();
        }
    }
}
