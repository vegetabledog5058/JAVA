package javaEx.plus.homework.Day0907;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/7 20:28
 * @desciption: 有一个集合保存扑克牌的花色(四种)，另一个集合保存扑克牌点数(13个)。
 * 创建一个新的集合保存所有的扑克牌(54张，包含 大小王)。将扑克牌分为四份（3个玩家，1份底牌），排序后输出四份手牌。
 */
public class Ex5 {
    public static void main(String[] args) {
        String redText = "\u001B[31mJOKER\u001B[0m";
        String blackText = "\u001B[30mJOKER\u001B[0m";
        List<String> cardSuitSymbols = List.of("\u001B[30m♠\u001B[0m", "\u001B[31m♥\u001B[0m", "\u001B[30m" +
                "♣\u001B[0m", "\u001B[31m♦\u001B[0m");
        List<String> cardRanks = new ArrayList<>();
        // 使用循环添加点数（1 到 13）到集合中
        String count[] = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2"};
        for (int rank = 0; rank <13; rank++) {
            cardRanks.add(count[rank]);
        }
        List<String> poke = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <13 ; j++) {
               poke.add(cardSuitSymbols.get(i)+cardRanks.get(j));
            }
        }
        poke.add(redText);
        poke.add(blackText);
        Collections.shuffle(poke);
        //System.out.println(poke);

        int num = (poke.size()-2 )/3;
        List<List<String>> result = new LinkedList();

        for (int i = 1; i <= 3; i++) {
            result.add(poke.stream().skip(num*(i-1)).limit(num).collect(Collectors.toList()));
        }
        result.add(poke.stream().skip(3*num).collect(Collectors.toList()));
        String[] CARD_ORDER = {
                "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2",
                "\u001B[30mJOKER\u001B[0m","\u001B[31mJOKER\u001B[0m",
        };
        for (int i = 0; i < 4; i++) {
            Collections.sort(result.get(i),(e1,e2)->{
                String s1= e1.toString();
                String s2= e2.toString();
                Integer index1 = Arrays.asList(CARD_ORDER).indexOf(s1.substring(1));
                Integer index2 = Arrays.asList(CARD_ORDER).indexOf(s2.substring(1));
                if(s1.equals(redText))return 1;
                else if(s2.equals(redText))return -1;
                if(s1.equals(blackText)&&!s2.equals(redText))return 1;
                else if(s2.equals(blackText)&&!s1.equals(redText))return -1;
                else
                return index1-index2;
            });
        }

        System.out.println("玩家1:"+result.get(0));
        System.out.println("玩家2:"+result.get(1));
        System.out.println("玩家3:"+result.get(2));
        System.out.println("底牌"+result.get(3));

    }
}
