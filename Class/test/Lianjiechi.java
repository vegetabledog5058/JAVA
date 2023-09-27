package Class.test;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/27 15:33
 * @desciption:
 */
public class Lianjiechi {
    public static void main(String[] args) throws Exception {
        //c3p0
        //xml配置

        ComboPooledDataSource source= new ComboPooledDataSource("otherc3p0");
        //直接配置
//        source.setDriverClass("com.mysql.cj.jdbc.Driver");
//        source.setJdbcUrl("jdbc:mysql://localhost:3306/company");
//        source.setUser("root");
//        source.setPassword("");
//        source.setInitialPoolSize(5);
//        source.setMaxPoolSize(10);

        Connection con = source.getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("select * from dept");

        ResultSet resultSet = preparedStatement.executeQuery();
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int column = resultSetMetaData.getColumnCount();
        while (resultSet.next()){
            for (int i = 1; i <= column; i++) {
                System.out.println(resultSet.getObject(i));
            }
            System.out.println();
        }


   /*     //阿里巴巴
//        Map<String, String> map = new HashMap<>();
//        map.put("driverClassName", "com.mysql.cj.jdbc.Driver");
//        map.put("url", "jdbc:mysql://localhost:3306/company");
//        map.put("username", "root");
//        map.put("password", "");
        Properties map = new Properties();
        //类加载器横纵直接放在src下
       map.load(Lianjiechi.class.getClassLoader().getResourceAsStream("db.properties"));
       //这里需要放在resourse目录下,前面需要加/
      //  map.load(Lianjiechi.class.getResourceAsStream("/db.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(map);
        System.out.println(dataSource.getConnection());*/




    }
}
