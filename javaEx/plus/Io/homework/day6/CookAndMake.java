package javaEx.plus.Io.homework.day6;

import java.time.LocalDateTime;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/18 20:14
 * @desciption:
 */
public class CookAndMake {
    public static void main(String[] args) {

        Cook cook = Cook.getInstance();
        Thread make =new Maker(cook,"厨子");
        Eater eat = new Eater(cook, "八戒");
        Eater eat2 = new Eater(cook, "文博");
        Eater eat3 = new Eater(cook, "秦爽");

        make.start();

        eat.start();
        eat2.start();
        eat3.start();
    }
}

class Maker extends Thread {

    Cook cook;

    public Maker(Cook cook, String name){
        super(name);
        this.cook = cook;
    }

    @Override
    public void run(){
        while (true){
            cook.make();
        }
    }
}

class Eater extends Thread {
    Cook cook;

    public Eater(Cook cook, String name){
        super(name);
        this.cook = cook;
    }

    public void run(){
        while (true){
            cook.eat();
        }
    }
}
class Cook {
    private String name;
    private final static Cook cook = new Cook();

    private Cook() {
    }

    public static Cook getInstance() {
        return cook;
    }

    public synchronized void make() {
        if (name != null) {
            try {
                System.out.println(Thread.currentThread().getName() + "睡了");
                wait();
                System.out.println(Thread.currentThread().getName() + "醒了");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        name = LocalDateTime.now().toString();
        notify();
        System.out.println("做饭"+name);


    }

    public synchronized void eat() {
        if (name == null) {
            try {
                System.out.println(Thread.currentThread().getName() + "睡了");
                wait();
                System.out.println(Thread.currentThread().getName() + "醒了");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "吃了");
            name = null;
            notifyAll();
        }
    }
}

