package EX_JDBC.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/21 17:57
 * @desciption:
 */
public class EX_2jdbc {
    public static void main(String[] args) {
        update();
    }

    private static void add() {

        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //2.创建连接
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String pass = "";
        try (Connection connection = DriverManager.getConnection(url, user, pass);
//          3.  创建statement对象
             Statement statement = connection.createStatement();) {
            int Deptno = 50;
            String Dname = "jack";
            String LOC = "beijing";
            String sql = "insert into DEPT(DEPTNO,DNAME,LOC)values(%d,'%s','%s')".formatted(Deptno, Dname, LOC);
//           无影响
//            System.out.println(statement.execute(sql));
            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("添加成功");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void delete() {
        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //2.创建连接
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String pass = "";
        try (Connection connection = DriverManager.getConnection(url, user, pass);
//          3.  创建statement对象
             Statement statement = connection.createStatement();) {
            String Dname = "jack";
            String sql = "delete from DEPT where DNAME ='%s';".formatted(Dname);
//           无影响
//            System.out.println(statement.execute(sql));
            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("删除成功");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void update() {
        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //2.创建连接
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String pass = "";
        try (Connection connection = DriverManager.getConnection(url, user, pass);
//          3.  创建statement对象
             Statement statement = connection.createStatement();) {
            String Dname = "XIAN";
            int Deptno = 30;
            String sql = "update dept set DEPTNO = %d where LOC ='%s'".formatted(Deptno, Dname);
//           无影响
//            System.out.println(statement.execute(sql));
            // System.out.println(sql);
            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("删除成功");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void select() {
        try {
            //1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        //2.创建连接
        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String pass = "";
        try (Connection connection = DriverManager.getConnection(url, user, pass);
//          3.  创建statement对象
             Statement statement = connection.createStatement();) {
            String Dname = "XIAN";
            int Deptno = 40;
            String sql = "update dept set DEPTNO = %d where LOC ='%s'".formatted(Deptno, Dname);
//           无影响
//            System.out.println(statement.execute(sql));
            // System.out.println(sql);
            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("删除成功");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
