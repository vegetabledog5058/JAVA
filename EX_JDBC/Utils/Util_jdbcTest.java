package EX_JDBC.Utils;

import java.sql.SQLException;
import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/22 16:17
 * @desciption:
 */
public class Util_jdbcTest {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/company";
        String user = "root";
        String pass = "";

        String sql1 = "select* from emp where EMPNO = ?";
        String sql2 = "select* from emp where deptno = ?";

        try(Util_jdbc<Emp> myDb = new Util_jdbc(url,user,pass);) {
            Emp emp = myDb.selectOne(sql1,new EmpResultMapper(),7369);
            Emp emp1 = myDb.selectOne(sql1,new EmpResultMapper(),7788);
            List<Emp>list = myDb.selectList(sql2,new EmpResultMapper(),20);
//            System.out.println(emp);
//            System.out.println(emp1);

            System.out.println(list);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
