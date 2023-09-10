package javaEx.plus.collection.homework.Day0907.shidianban;

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
    private Integer CardsNum;

    public Computer(Card card,Player player){
        cardRobot = new ArrayList<>();
        cardRobot.add(card);
        CardsNum =1;
        numPoint= card.getPoint();
        playerPoint = player.getNumPoint();
    }
    //判断规则
    //摸牌
    public void ReceiveCard(Card card){
        if(isOrNotAdd()){
            //摸牌

        }else {
            //不摸牌

        }
    }
    private boolean isOrNotAdd() {
        //true时需要补牌
    return numPoint<playerPoint&&numPoint!=21;
    }
    private Integer add(Card card){
        numPoint+=card.getPoint();
return 0;
    }
    private boolean BooleanPoint(){
        return numPoint<=21;
    }
    //手牌判断(添加以后判断)
    private boolean BooleanCardNum(){
        return CardsNum==5;
    }





}
