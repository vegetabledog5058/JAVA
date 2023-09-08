package javaEx.plus.collection.homework.Day0907.shidianban;

import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/8 15:19
 * @desciption:
 */
public class Card {
    private static String symbol1 = "\u001B[30m♠\u001B[0m";
    private static String symbol2 = "\u001B[31m♥\u001B[0m";
    private static String symbol3 = "\u001B[30m♣\u001B[0m";
    private static String symbol4 = "\u001B[31m♦\u001B[0m";
    private static String redJoker = "\u001B[31mJOKER\u001B[0m";
    private static String blackJoker = "\u001B[30mJOKER\u001B[0m";
    public static final List<String> symbolList = List.of(symbol1, symbol2, symbol3, symbol4);
    public static final List<String> cardRanksList = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5",
            "4", "3");
    private String cardSuitSymbols;
    private String cardRanks;
    private Integer cardOrder;

public Card(String cardSuitSymbols,String cardRanks,Integer cardOrder){
    this.cardSuitSymbols = cardSuitSymbols;
    this.cardRanks = cardRanks;
    this.cardOrder = cardOrder;
}

    public static String getBlackJoker() {
        return blackJoker;
    }

    public static String getRedJoker() {
        return redJoker;
    }

    public Integer getCardOrder(){
    return this.cardOrder;
}

    @Override
    public String toString() {
        return cardSuitSymbols+cardRanks;
    }
}
