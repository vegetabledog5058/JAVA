package EX_JDBC.Utils;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/22 16:17
 * @desciption:
 */
public class Util_jdbc<T> implements AutoCloseable{
    //工具类的创建
    private String url;
    private String user;
    private String pass;
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rt;
    //考试用
    private DatabaseMetaData md;
    private boolean autoCommit = true;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public Util_jdbc(String url, String user, String pass) {
        this.url = url;
        this.user = user;
        this.pass = pass;
    }



    public Connection getConnection() throws SQLException {
        if (con == null) {
            try {
                con = DriverManager.getConnection(url, user, pass);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return con;
    }

    public void close() {
        if (rt != null) {
            try {
                rt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            con = null;
        }
    }


    //事务
    public void startTransaction() throws SQLException {
        getConnection();
        //防止空指针异常
        if(con!=null&&!con.isClosed()&& autoCommit){
            con.setAutoCommit(false);
            autoCommit = false;
        }
    }
    public void commit() throws SQLException {
      if(!autoCommit&&con!=null&&!con.isClosed()){
          con.commit();
          autoCommit=true;
      }

    }
    public void rollback() throws SQLException {
        if(!autoCommit&&con!=null&&!con.isClosed()){
            con.rollback();
            autoCommit=true;
        }
    }
    //JDBC增删改查

    private void execute(String sql, int autoGeneratedKeys, Object... params) throws SQLException {
        //首先确保con不为null,获取连接
        getConnection();
        ps = con.prepareStatement(sql, autoGeneratedKeys);
        setParams(params);
    }
    public void execute(String sql) throws SQLException {
        //首先确保con不为null,获取连接
        getConnection();
        ps = con.prepareStatement(sql);
        ps.execute();
    }
    public ResultSet executeRt(String sql) throws SQLException {
        //首先确保con不为null,获取连接
        getConnection();
        ps = con.prepareStatement(sql);
        return  ps.executeQuery();

    }
    //---------------

    private int update(String sql, int autoGeneratedKeys, Object... params) throws SQLException {
        //首先确保con不为null,获取连接
      execute(sql,autoGeneratedKeys,params);
        return ps.executeUpdate();
    }
    public int update(String sql, Object... params) throws SQLException {
        //首先确保con不为null,获取连接
       return update(sql,Statement.NO_GENERATED_KEYS,params);
    }

    public int insert(String sql, Object... params) throws SQLException {
        update(sql, Statement.RETURN_GENERATED_KEYS, params);

        //获取结果集
        rt = ps.getGeneratedKeys();
        return rt.next() ? rt.getInt(1) : -1;
    }

    public int delete(String sql, Object... params) throws SQLException {
        return update(sql, Statement.NO_GENERATED_KEYS, params);

    }

    public T selectOne(String sql,Class<T>cla, Object... params) throws SQLException {
        execute(sql, Statement.NO_GENERATED_KEYS, params);
        rt = ps.executeQuery();

        if (rt.next()) {
            return mapper(rt,cla);
        }return null;
    }

    public List<T> selectList(String sql, Class<T>cla,Object... params) throws SQLException {
        execute(sql,Statement.NO_GENERATED_KEYS,params);
        rt = ps.executeQuery();
        List list = new ArrayList<>();
        while (rt.next()){
            T t = mapper(rt,cla);
            list.add(t);
        }
        return list;
    }
    public List<T> selectAll(String sql, Class<T>cla) throws SQLException {
        execute(sql,Statement.NO_GENERATED_KEYS);
        rt = ps.executeQuery();
        List list = new ArrayList<>();
        while (rt.next()){
            T t = mapper(rt,cla);
            list.add(t);
        }
        return list;
    }

    private void setParams(Object... params) throws SQLException {
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
        }
    }
    //当数据库表字段名有多个字段的时候
    private String toCameCase(String columnName){
        String spit[] = columnName.split("_");
        StringBuilder sb = new StringBuilder(spit[0]);
        if(columnName.contains("_")){


            for (int i =1 ; i <spit.length ; i++) {
                String str= spit[i];
                sb.append(str.substring(0,1).toUpperCase()).append(str.substring(1).toLowerCase());
            }
        }return sb.toString();
    }
private <T> T mapper(ResultSet rt,Class<T> cla){
    T t ;
    try {
        Constructor<T>constructor = cla.getDeclaredConstructor();
        //创建对象
         t= constructor.newInstance();
//        获取元数据
        ResultSetMetaData resultSetMetaData = rt.getMetaData();
        //获取行数
        int columnCount = resultSetMetaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            String column = resultSetMetaData.getColumnLabel(i).toLowerCase();

                // 有多个单词组成，转换为驼峰命名
            if (column.contains("_")){
                // 有多个单词组成，转换为驼峰命名
                column = toCameCase(column);
            }


            //获取属性描述器
            PropertyDescriptor propertyDescriptor =new PropertyDescriptor(column,cla);
            Method writeMethod = propertyDescriptor.getWriteMethod();
            writeMethod.setAccessible(true);
            Object value = rt.getObject(i);
            writeMethod.invoke(t,value);

        }
    } catch (NoSuchMethodException e) {
        throw new RuntimeException(e);
    } catch (SQLException e) {
        throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
        throw new RuntimeException(e);
    } catch (InstantiationException e) {
        throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
        throw new RuntimeException(e);
    } catch (IntrospectionException e) {
        throw new RuntimeException(e);
    }return t;
}

}


//class EmpResultMapper implements IResultMapper<Emp> {
//
//    @Override
//    public Emp mapper(ResultSet set) {
//        Emp emp = new Emp();
//        try {
//            emp.setEmpno(set.getInt("empno"));
//            emp.setEname(set.getString("ename"));
//            emp.setJob(set.getString("job"));
//            emp.setHiredate(set.getDate("hiredate"));
//            emp.setMgr(set.getInt("mgr"));
//            emp.setSalary(set.getDouble("SALARY"));
//            emp.setComm(set.getDouble("comm"));
//            emp.setDeptno(set.getInt("deptno"));
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return emp;
//    }
//}

