package javaEx.plus.collection.homework.Day0907.shidianban;

import object.oriented.kfm.day1.Homework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/8 21:10
 * @desciption:
 */
public class Player {
    private List<Card> player;
    private Integer numPoint;
    private Integer CardsNum;
    PokerGame pokerGame = new PokerGame();

    public Player(Card card) {
        player = new ArrayList<>();
        player.add(card);
        CardsNum = 1;
        numPoint = card.getPoint();
    }

    public Integer getNumPoint() {
        return numPoint;
    }
    //玩家结束结果判断
    private boolean aBooleanResult(Integer result) {
        return result == -1;
    }

    //摸牌
    public void home1(Card card) {
        player.add(card);
        int result = result(card);
        if (result == -1) {
            //撑死
            System.out.println("撑死");
        } else if (result == 0) {
            //停止抽牌

        }else {
            //可以继续抽牌
            System.out.println(player);
            pokerGame.home();
        }

        System.out.println("您的手牌:");
        System.out.println(player);
        pokerGame.home();
    }
    //判断结果
    private int result(Card card){
        numPoint+=card.getPoint();
        if(!BooleanPoint()){
            return -1;
        }else if(BooleanCardNum()){
            return 0;
        }else return 1;
    }

    //点数判断
    private boolean BooleanPoint() {
        return numPoint <= 21;
    }

    //手牌判断(添加以后判断)
    private boolean BooleanCardNum() {
        return CardsNum == 5;
    }


}
