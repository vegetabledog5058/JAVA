package EX_JDBC;


import com.mysql.cj.protocol.Resultset;

import java.sql.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/21 15:46
 * @desciption:
 */
public class Ex_jdbc {
    public static void main(String[] args) {
        try {
            // DriverManager.registerDriver(new Driver());
            //全限定类名
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String URL = "jdbc:mysql://localhost:3306/company";
        String USER = "root";
        String PASS = "";

        try (Connection connection =DriverManager.getConnection(URL,USER,PASS);
             Statement statement = connection.createStatement();){

            String sql  ="select* from dept";
           boolean flag = statement.execute(sql);
           if(flag){
               System.out.println("执行成功");
               ResultSet resultset =statement.getResultSet();
               while (resultset.next()){
                   Object object = resultset.getObject(1);
                   Object DNAME = resultset.getObject("DNAME");
                   String loc = resultset.getString("LOC");
                   System.out.println(object+"-"+DNAME+"-"+loc);
               }
           }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
