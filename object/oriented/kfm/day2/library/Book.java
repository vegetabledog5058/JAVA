package object.oriented.kfm.day2.library;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/16 19:20
 * @desciption:
 */
public class Book {
   /* 图书管理系统 创建一个简单的图书管理系统，
    包含以下类：
    Book 类：表示图书，包含属性：书名（title）、作者（author）、出版年份
（year）、价格（price）
    Library 类：表示图书馆，包含属性：书库（使用数组保存图书）、添加图书
    的方法、查找图书的方法、显示所有图书的方法
            完成以下功能
    添加图书
            查找图书
    显示图书列表*/

    private String title;
    private String author;
    private String year;
    private Double price;

    public Book() {
    }

    public Book(String title, String author, String year, Double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
