package EX_JDBC.EXAM0923;


import EX_JDBC.Utils.Util_jdbc;

import java.io.*;
import java.math.BigDecimal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/23 9:06
 * @desciption:
 */
public class BookManager {

    private Scanner sc = new Scanner(System.in);
    private Util_jdbc db;

    public BookManager() {
        db = new Util_jdbc("jdbc:mysql://localhost:3306/manger", "root", "");
        init();
    }

    private void init() {
        boolean booksFlag = check("books");
        boolean logFlag = check("log");
        if (!(booksFlag && logFlag)){
            // 表不存在
            createTables(booksFlag, logFlag);
        }

    }

    public void createTables(boolean booksFlag,boolean logFlag) {
        File file = new File("EX_JDBC/EXAM0923/sql.txt");
        String sql;
        byte bytes[];
        try (FileInputStream fis = new FileInputStream(file)) {
            bytes = fis.readAllBytes();
            sql = new String(bytes);
            String sqls[] = sql.split(";");
            if (!booksFlag) {
                System.out.println("创建 books 表");
                db.execute(sqls[0].trim());
            }
            if (!logFlag) {
                System.out.println("创建 log 表");
                db.execute(sqls[1].trim());
            }
        } catch (IOException | SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private boolean check(String tableName) {

        try (Connection con = db.getConnection();
             ResultSet resultSet = con.getMetaData().getTables(null, "manager", tableName, new String[]{"TABLE"});
        ) {
            if (resultSet.next()) {
                return true;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return false;
    }

    /**
     * 添加图书
     */
    public void addBookInfo() {
//        String sql = "insert into books(book_title, publication_date, author, price, quantity)values ('test'," +
//                "'2000-2-2','joker',9.99,10)";
        String sql = "insert into books(book_title, publication_date, author, price, quantity)values(?,?,?,?,?);";
        try {
            System.out.println("输入书名");
            String a = sc.next();
            System.out.println("输入出版日期例如(2020-2-2)");
            String b = sc.next();
            System.out.println("输入作者");
            String c = sc.next();
            System.out.println("输入价格(两位小数)");
            String d = sc.next();
            System.out.println("输入质量");
            String e = sc.next();
            int result = db.insert(sql, a, b, c, d, e);
            //结果
            if (result > 0) System.out.println("添加成功!第" + result + "本书");
            else System.out.println("添加失败");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            db.close();
        }

    }

    /**
     * 删除图书
     */
    public void removeBook() {
        String sql = "delete from books where book_title = ?";
        try (Util_jdbc db = new Util_jdbc("jdbc:mysql://localhost:3306/manger", "root", "");
        ) {
            System.out.println("输入您要删除的书名");
            int result = db.delete(sql, sc.next());

            if (result > 0) System.out.println("删除成功!" + result + "行受到影响");
            else System.out.println("删除失败");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 修改图书数量
     */
    public void modifyBookQuantity() {
        String sql = "update books set quantity  = ? where book_title = ?";
        try (Util_jdbc db = new Util_jdbc("jdbc:mysql://localhost:3306/manger", "root", "");
        ) {
            System.out.println("输入新的数量");
            int a = sc.nextInt();
            System.out.println("输入修改的书名");
            String b = sc.next();
            int result = db.update(sql, a, b);

            if (result > 0) System.out.println("修改成功!" + result + "行受到影响");
            else System.out.println("修改失败");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 查询所有图书
     */
    public void showAllBooks() {
        String sql = "select * from books";
        try (Util_jdbc db = new Util_jdbc("jdbc:mysql://localhost:3306/manger", "root", "");
        ) {





        }
    }


}

