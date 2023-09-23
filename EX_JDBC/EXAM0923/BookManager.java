package EX_JDBC.EXAM0923;

import EX_JDBC.Utils.Util_jdbc;

import java.io.*;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/23 9:06
 * @desciption:
 */
public class BookManager {
    private boolean book =false;
    private boolean log = false;
    private Scanner sc = new Scanner(System.in);

    public BookManager() {
        File file = new File("EX_JDBC\\EXAM0923\\sql.txt");
        String sql;
        byte bytes[];
        try (FileInputStream fis = new FileInputStream(file)) {
            bytes = fis.readAllBytes();
            sql = new String(bytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String sqls[] = sql.split(";");
        //jdbc
                try (Util_jdbc db = new Util_jdbc("jdbc:mysql://localhost:3306/manger","root","");
        ){
            db.execute(sqls[0]);
            db.execute(sqls[1]);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     *
     */
    public void addBookInfo(){
//        String sql = "insert into books(book_title, publication_date, author, price, quantity)values ('test'," +
//                "'2000-2-2','joker',9.99,10)";
        String sql = "insert into books(book_title, publication_date, author, price, quantity)values(?,?,?,?,?);";
        try (Util_jdbc db = new Util_jdbc("jdbc:mysql://localhost:3306/manger","root","");
        ){
            System.out.println("输入书名");
            String a= sc.next();
            System.out.println("输入出版日期例如(2020-2-2)");
            String b= sc.next();
            System.out.println("输入作者");
            String c= sc.next();
            System.out.println("输入价格(两位小数)");
            double d= sc.nextDouble();
            System.out.println("输入质量");
            String e= sc.next();
            int result = db.insert(sql,"jack","2001-2-4","jack","10.88",10);

            if(result>0)System.out.println("添加成功!第"+result+"本书");
            System.out.println(result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    /**
     *
     */
    public void removeBook(){}
    /**
     *
     */
    public void modifyBookQuantity(){}
}
class Test{
    public static void main(String[] args) {


    }

}

