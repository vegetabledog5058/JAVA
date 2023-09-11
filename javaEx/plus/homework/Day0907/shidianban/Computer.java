package javaEx.plus.homework.Day0907.shidianban;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/8 21:04
 * @desciption:
 */
public class Computer {
    private List<Card> cardRobot;
    private Integer playerPoint;
    private Integer numPoint;
    private Integer cardsNum;

    public Computer(Card card){
        cardRobot = new ArrayList<>();
        cardRobot.add(card);
        cardsNum =1;
        numPoint= card.getPoint();

    }
    public List<Card> getCardRobot() {
        return cardRobot;
    }
    public Integer getNumPoint(){
        return numPoint;
    }
    public Integer getCardsNum(){
        return cardsNum;
    }

    public void addCard(Card card){
        numPoint+=card.getPoint();
        cardsNum++;
        cardRobot.add(card);
    }




}
