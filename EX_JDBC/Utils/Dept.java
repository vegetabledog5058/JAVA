package EX_JDBC.Utils;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/29 10:53
 * @desciption:
 */
public class Dept {
private int deptno;
private String dname;
private String loc;

    public Dept() {
    }

    public Dept(int deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    /**
     * 获取
     * @return deptno
     */
    public int getDeptno() {
        return deptno;
    }

    /**
     * 设置
     * @param deptno
     */
    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    /**
     * 获取
     * @return dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * 设置
     * @param dname
     */
    public void setDname(String dname) {
        this.dname = dname;
    }

    /**
     * 获取
     * @return loc
     */
    public String getLoc() {
        return loc;
    }

    /**
     * 设置
     * @param loc
     */
    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String toString() {
        return "Dept{deptno = " + deptno + ", dname = " + dname + ", loc = " + loc + "}";
    }
}
