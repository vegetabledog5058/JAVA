package javaEx.plus.collection.homework.Day0907.shidianban;

import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/8 19:50
 * @desciption:
 */
public class CardTest {
    public static void main(String[] args) {
        Poker test = new Poker();
        List<Card> list = test.poker();
        for (int i = 0; i < 54; i++) {
            System.out.print(list.get(i)+"\t");
        }
    }
}
