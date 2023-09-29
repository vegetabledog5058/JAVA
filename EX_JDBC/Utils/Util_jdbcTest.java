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
     /*   String sql1 = "select* from dept ";
        String sql2 = "select* from emp where deptno = ?";
        String sql3 = "update dept set DNAME = ?  where deptno = ?";

        try(Util_jdbc<Dept> myDb = new Util_jdbc(url,user,pass);) {
            List<Dept> list = myDb.selectAll(sql1,Dept.class);
            //Emp emp1 = myDb.selectOne(sql1,new EmpResultMapper(),7788);
           // List<Emp>list = myDb.selectList(sql2,new EmpResultMapper(),20);
            //myDb.update(sql3,0,"jack",10);
            System.out.println(list);
//            System.out.println(emp1);

           // System.out.println(list);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }*/


//        String sql1 = "insert into dept(deptno,dname,loc)values(?,?,?);";
//        String sql2 = "insert into emp(ENAME,JOB,MGR,HIREDATE,SALARY,COMM,DEPTNO)values(?,?,?,?,?,?,?);";
//        String sql3 = "delete from emp where ENAME = ?";
//        String sql4 = "update emp set JOB = ? where ENAME = ?";
//        try (Util_jdbc db = new Util_jdbc("jdbc:mysql://localhost:3306/company","root","");
//        ){
//            int result = db.update(sql4,"MANAGER","tomy");
////            int result = db.delete(sql3,"tomy");
//            if(result>0)System.out.println("添加成功!第"+result+"本书");
//            System.out.println(result);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

//        String sql4 = "{call sum1(?, ?, ?)}";
//        try (Util_jdbc db = new Util_jdbc("jdbc:mysql://localhost:3306/company","root","");
//        ){
//            Connection con = db.getConnection();
//           CallableStatement callableStatement =  con.prepareCall(sql4);
//           callableStatement.setObject(1,1);
//           callableStatement.setInt(2,2);
//           callableStatement.registerOutParameter(3, Types.INTEGER);
//           callableStatement.execute();
//           int result = callableStatement.getInt(3);
//            System.out.println(result);
//
//            con.close();
////
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        try (Util_jdbc db = new Util_jdbc<>(url, user, pass);) {
            String sql ="update dept set dname = ? where deptno = ?";
            db.startTransaction();
            db.update(sql,"eron",10);
            db.commit();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
