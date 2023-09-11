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
    private  Poker poker;
    private List<Card> cardsList;
    private Scanner scanner = new Scanner(System.in);
    private Player player;
    private Computer robot;
    private  Integer  robotResult;
    private  boolean flagPlayer ;
    private  boolean flagRobot ;


    public PokerGame() {
        poker = new Poker();
        cardsList = poker.poker();
        player = new Player(Licensing());
        robot = new Computer(Licensing());
    }

    public void home() {
        choice();
        //没有撑死,开始比较
        if (player.getCardsNum() == 5&&player.getNumPoint()<=21) {
            System.out.println("您赢了!!!对方手牌是:");
            System.out.println(robot.getCardRobot());
        }else if (player.getCardsNum() < 5 && player.getNumPoint() <= 21) {

//            computerChoice1();
            computerChoice2();
            booPrint();
         }else {
            //撑死
            System.out.println("你撑死了!");
        }
        again();
    }

    private void renew() {
        robotResult = 0;
        player = null;
        robot = null;
        flagRobot = true;
        flagPlayer = true;
        player = new Player(Licensing());
        robot = new Computer(Licensing());

    }

    private void again() {
        System.out.println("输入1继续游戏,其他则退出");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> renew();
            case 2 -> System.exit(1);
        }
        home();
    }

    private void choice() {
        System.out.println("您的手牌");
        System.out.println(player.getPlayer());
        flagPlayer=true;
        while (flagPlayer) {
            System.out.println("输入:1.摸牌" + "\t" + "2.停止摸牌" + "\t");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> player.addCard(Licensing());
                default -> flagPlayer = false;
            }
            if (!booleanResultPlayer()) flagPlayer = false;
            System.out.println("您的手牌");
            System.out.println(player.getPlayer());
        }
    }

    //手牌与点数判断
    private boolean booleanResultPlayer() {
        if (player.getCardsNum() <= 5) {
            if (player.getNumPoint() <= 21) {
                return true;
            }
        }
        return false;
    }

    private boolean booleanResultRobot() {
        if (robot.getCardsNum() <= 5) {
            if (robot.getNumPoint() <= 21) {
                return true;
            }
        }
        return false;
    }

    private Card Licensing() {
        Card tem = cardsList.get(0);
        cardsList.remove(0);
        return tem;
    }
private  void booPrint(){
        if (robotResult<0){
            System.out.println("对方撑死了,手牌是:");
            System.out.println(robot.getCardRobot());
        }else if (compare()>0){
            System.out.println("你输了!对方手牌是:");
            System.out.println(robot.getCardRobot());
        }else if (compare()==0){
            System.out.println("平局!,对方手牌是:");
            System.out.println(robot.getCardRobot());
        }
        else {
            System.out.println("你赢了!对方手牌是:");
            System.out.println(robot.getCardRobot());
        }
}
    private void computerChoice1() {

        if (robot.getNumPoint() <= player.getNumPoint() && robot.getNumPoint() != 21) {
            flagRobot =true;
            while (flagRobot) {
                robot.addCard(Licensing());
                if (robot.getNumPoint() > player.getNumPoint()) flagRobot = false;
                if (!booleanResultRobot()) flagRobot = false;
            }

        }if (robot.getNumPoint() > 21) {robotResult = -1;}
        else {robotResult = robot.getNumPoint();}


    }
    //记牌器算法
    private void computerChoice2() {
            flagRobot =true;
            while (cardCount()&&flagRobot) {
                robot.addCard(Licensing());
                if (!booleanResultRobot()) flagRobot = false;
            }

        if (robot.getNumPoint() > 21) {robotResult = -1;}
        else {robotResult = robot.getNumPoint();}


    }
    private boolean cardCount(){
        //int nums[] = {1,1,1,2,4,6,8,10,12,14,16,18,20};
       // List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
       //num = num%2==0 ? num:num-1;
       // int index = Collections.binarySearch(list,num);
        int num = 21-robot.getNumPoint();
        int count = 0;
            for (int i = 0; i < cardsList.size(); i++) {
                if(cardsList.get(i).getPoint()<=num){
                    count++;
                }
            }
            if(count>cardsList.size()-count){
                return true;
            }return false;


    }

    //开始比较
    private Integer compare() {
        return robotResult - player.getNumPoint();
    }



}
