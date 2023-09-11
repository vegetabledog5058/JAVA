package javaEx.plus.homework.Day0907.shidianban;
import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/8 15:18
 * @desciption:
 */
public class Poker {
    private List<Card> poker;

    public Poker(){
        poker = new LinkedList<>();
    }
    public    List<Card> poker() {


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                poker.add(new Card(Card.symbolList.get(i), Card.cardRanksList.get(j), 4 * j + i + j + 2));
            }
        }
        poker.add(new Card("", Card.getRedJoker(), 0));
        poker.add(new Card("", Card.getBlackJoker(), 1));
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(poker);
        }
        return poker;
    }


}
