package object.oriented.kfm.Filmv2_0;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/21 21:24
 * @desciption:
 */
public class User {
    private String username;
    private String phone;
    private String password;
    private Integer role;
    private object.oriented.kfm.film.User status;

    private static Scanner sc = new Scanner(System.in);
    private List tickets = new List();


    public User() {

    }

    public User(String username, String phone, String password) {
        this(username, phone, password, 2);
    }

    public User(String username, String phone, String password, Integer role) {
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public void addTicket(Tickets ticket) {
        // 考虑扩容
        tickets.add(ticket);
    }

    public void showTickets() {
        System.out.println("序号" + "\t" + "电影名称" + "\t" + "上映时间" + "\t" + "数量");
        for (int i = 0; i < tickets.length(); i++) {
            System.out.println(i + 1 + " \t " + tickets.getTickets(i).info());
        }
    }

    @Override
    public String toString() {
        return getUsername() + "\t" + getPhone() + "\t" + getPassword() + "\t";
    }
}
