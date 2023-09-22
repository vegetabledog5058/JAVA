package EX_JDBC.day2;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/22 9:23
 * @desciption:
 */
public class ex1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String pass = "";
        try (Connection connection = DriverManager.getConnection(url, user, pass);
             Statement statement = connection.createStatement();
            ){
//           String sql = "create table mytable3(name varchar(20),id int)";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            String sql1 = "insert into dept values(?,?,?)";
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);

            preparedStatement1.setObject(1,33);
            preparedStatement1.setObject(2,"jack");
            preparedStatement1.setObject(3,"Xian");

            preparedStatement1.setString(3,"NewYork");
          int row=  preparedStatement1.executeUpdate();
//            int row = statement.executeUpdate(sql);
            if(row>0){
                System.out.println("操作成功");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
