package EX_JDBC.EXAM0923;

import EX_JDBC.Utils.Util_jdbc;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/23 10:29
 * @desciption:
 */
public class BMTest {
    public static void main(String[] args) {
        BookManager bm = new BookManager();

        //Scanner sc = new Scanner(System.in);
//        String sql = "insert into books(book_title, publication_date, author, price, quantity)values(?,?,?,?,?);";
//        try (Util_jdbc db = new Util_jdbc("jdbc:mysql://localhost:3306/manger","root","");
//        ){
//            int result = db.insert(sql,"jack","2001-2-4","jack",10.88,10);
//            if(result>0)System.out.println("添加成功!第"+result+"本书");
//            System.out.println(result);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }





    }
}
