package object.oriented.kfm.day2.library;


import object.oriented.kfm.day2.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/16 19:22
 * @desciption:
 */
public class Library {
    static Scanner sc = new Scanner(System.in);
    //Book Library[] = new Book[0];
    ArrayList<Book> Library = new ArrayList<Book>();

    private int count = 0;

    public Library() {
        // System.out.print("title" + "\t" + "author" + "\t" + "year" + "\t" + "price" + "\t");
        System.out.println("欢迎来到图书管理系统");
    }


    public void addBook() {
        //String title,String author,String year,Double price

      //  Library = Arrays.copyOf(Library, Library.length + 1);
        print("请输入书的【名称】:");
        String title = sc.next();
        print("请输入书的【作者】:");
        String author = sc.next();
        print("请输入书的【出版年份】:");
        String year = sc.next();
        print("请输入书的【出版价格】:");
        double price = sc.nextDouble();
        Book book = new Book(title, author, year, price);
        Library.add(book);
        count++;
       // Library[count++] = book;
       showmenu();

    }

    public void selectBook() {
        boolean flag = false;
        Book b1 = new Book();
        String input = sc.next();
        for (int i = 0; i <Library.size(); i++) {
            b1 = Library.get(i);
            if (b1.getTitle().equals(input)) {
                flag = true;
                System.out.println(b1.getTitle() + "\t" + b1.getAuthor() + "\t" + b1.getYear() + "\t" + b1.getPrice() + "\t");
                break;
            }
        }
        if (!flag) {
            System.out.println("未找到书籍");
        }
        showmenu();
    }


    public void showBook() {
        if (count == 0) {
            System.out.println("目前没有存书");
        } else {
            System.out.print("title" + "\t" + "author" + "\t" + "year" + "\t" + "price" + "\t");
            System.out.println();
            for (int i = 0; i < Library.size(); i++) {
                Book b1 = new Book();
                b1 = Library.get(i);
                System.out.println(b1.getTitle() + "\t" + b1.getAuthor() + "\t" + b1.getYear() + "\t" + b1.getPrice() + "\t");            }
        }
        showmenu();
    }


    public void showmenu() {
        print("请选择功能:");
        print("1. 添加图书");
        print("2. 查找图书");
        print("3. 显示所有图书");
        print("0. 退出系统");
        System.out.print("请输入：");
        int input = sc.nextInt();
        startmenu(input);
    }

    public void print(String menu) {
        System.out.println(menu);
    }

    public void startmenu(int choice) {
        switch (choice) {
            case 1 -> addBook();
            case 2 -> selectBook();
            case 3 -> showBook();
            default -> exit();

        }

    }


    public void exit() {
        System.out.println("欢迎下次光临");
        System.exit(0);
    }

}
