package object.oriented.kfm.day2.library;

import object.oriented.kfm.day2.Student;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/16 19:22
 * @desciption:
 */
public class Library {
    private Book bookLi[] = new Book[0];

    public Library() {
        System.out.print("title" + "\t" + "author" + "\t" + "year" + "\t" + "price" + "\t");
        System.out.println();
    }


    public void addBook(String title, String author, String year, Double price) {

        //String title,String author,String year,Double price
        bookLi = Arrays.copyOf(bookLi, bookLi.length + 1);
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
//        book.setTitle(sc.next());
//        book.setAuthor(sc.next());
//        book.setYear(sc.next());
//        book.setPrice(sc.nextDouble());
        book.setTitle(title);
        book.setAuthor(author);
        book.setYear(year);
        book.setPrice(price);
        bookLi[bookLi.length - 1] = book;
    }

    public void selectBook(String title) {
        Book b1 = new Book();
        for (int i = 0; i < bookLi.length; i++) {
            b1 = bookLi[i];
            if (b1.getTitle().equals(title)) {
                System.out.println(b1.getTitle() + "\t" + b1.getAuthor() + "\t" + b1.getYear() + "\t" + b1.getPrice() + "\t");
            } else {
                continue;
            }
        }
        if (b1.getTitle() == null) {
            System.out.println("不存在");
        }

    }

    public void showBook() {
        for (int i = 0; i < bookLi.length; i++) {
            Book b1 = new Book();
            b1 = bookLi[i];
            System.out.println(b1.getTitle() + b1.getAuthor() + b1.getYear() + b1.getPrice());
        }
    }

}
