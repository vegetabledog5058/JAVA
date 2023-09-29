package EX_JDBC;

import EX_JDBC.Utils.Util_jdbc;

import java.rmi.Naming;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/25 15:17
 * @desciption:
 */
public class My_Transection {
    public static void main(String[] args) {


        Connection con = null;
        try ( Util_jdbc tb = new Util_jdbc("jdbc:mysql://localhost:3306/company","root","");
             ){
            con = tb.getConnection();
            con.setAutoCommit(false);
            String sql3 = "update dept set DNAME = ?  where deptno = ?";
            tb.update(sql3,"tom",10);
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            throw new RuntimeException(e);
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
