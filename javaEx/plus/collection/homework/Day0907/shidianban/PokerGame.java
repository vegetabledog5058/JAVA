package javaEx.plus.collection.homework.Day0907.shidianban;

import java.util.List;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/8 21:09
 * @desciption:
 */
public class PokerGame {
    private static Poker poker;
    private List<Card> cardsList;
    private Scanner scanner = new Scanner(System.in);
    private Player player;
    private Computer computer;
    private static Integer playerResultPoint;
    private static Integer computerResultPoint;

    public PokerGame() {
        poker = new Poker();
        cardsList = poker.poker();
        player = new Player(Licensing());
    }

    public void home() {
        System.out.println("输入:1.摸牌" + "\t" + "2.停止摸牌" + "\t");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> player.home1(Licensing());
            case 2 -> compare();

        }
    }

    private Card Licensing() {
        Card tem = cardsList.get(0);
        cardsList.remove(0);
        return tem;
    }

    private void recordResultPoint() {
        this.playerResultPoint = player.getNumPoint();
    }

    private boolean compare() {
//玩家停止摸牌
        recordResultPoint();
        computer = new Computer(Licensing(), player);
        return true;
    }


//    public void homeAlert(Integer result){
//        System.out.println("游戏结束!输入0重新开始");
//        switch (result){
//            case -1-> System.out.println("游戏结束,你撑死了");
//        }
//    }


}
