package EX_JDBC.EXAM0923;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLData;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/23 9:08
 * @desciption:
 */
public class Book {
    private int id;
    private String bookTitle;
    private Date publicationDate;
    private String author;
    private BigDecimal price;
    private int quantity;

    public Book() {
    }

    public Book(int id, String bookTitle, Date publicationDate, String author, BigDecimal price, int quantity) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.publicationDate = publicationDate;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return bookTitle
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * 设置
     * @param bookTitle
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * 获取
     * @return publicationDate
     */
    public Date getPublicationDate() {
        return publicationDate;
    }

    /**
     * 设置
     * @param publicationDate
     */
    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    /**
     * 获取
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * 设置
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Book{id = " + id + ", bookTitle = " + bookTitle + ", publicationDate = " + publicationDate + ", " +
                "author = " + author + ", price = " + price + ", quantity = " + quantity + "}"+"\n";
    }


}
