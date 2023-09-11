package javaEx.plus.homework.Day0907.shidianban;



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
    private Integer cardsNum;


    public Player(Card card) {
        player = new ArrayList<>();
        player.add(card);
        cardsNum = 1;
        numPoint = card.getPoint();
    }

    public List<Card> getPlayer() {
        return player;
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
        player.add(card);
    }


    //摸牌

    //玩家结束结果判断



}
