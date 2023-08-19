package object.oriented.kfm.film;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/18 21:21
 * @desciption: 定义用户类 User ，包含以下属性：用户的名称（username）、用户登录手机号 （phone）、
 * 用户的密码（password）、用户的身份（role int类型 1 表示管理员 2 表 示普通用户）
 */
public class User {
    private String username;
    private String phone;
    private String password;
    private Integer role;
    private User status;
    static Scanner sc = new Scanner(System.in);
    static MovieTheater movieTheater = new MovieTheater();
    static Menu menu = new Menu();


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

    public User() {
    }

    //开始菜单
    public void startmenu(int input) {
        switch (input) {
            case 1 -> movieTheater.function_searchmovie();
            case 2 -> movieTheater.function_showallmovies();
            case 3 -> confirm_home_admin();
            case 4 -> confirm_home_user();
            case 5 -> funtction_register();
            default -> exit();
        }
    }


    //用户登录
    public void function_user() {
        System.out.println("1. 修改用户信息");
        System.out.println("2. 查询用户信息");
        System.out.println("3. 退出登录");
        int input = sc.nextInt();
        user_home(input);
    }

    private void user_home(int input) {
        switch (input) {
            case 1 -> function_updateuser();
            case 2 -> function_selectuser();
            default -> exit_login();
        }
    }

    //管理员登录
    public void function_admin() {
        System.out.println("1. 新增电影");
        System.out.println("2. 删除电影（输入电影名称，删除对应电影）");
        System.out.println("3.  修改电影（输入电影名称，展示电影信息，选择要修改的内容（价格/上映时\n" +
                "间），输入内容，修改已存储的电影信息）");
        System.out.println("4. 查看所有用户信息");
        System.out.println("5. 退出登录");
        int input = sc.nextInt();
        admin(input);
    }

    private void admin(int input) {
        switch (input) {
            case 1 -> movieTheater.addmovie_input();
            case 2 -> movieTheater.function_deletemovie();
            case 3 -> movieTheater.function_update();
            case 4 -> function_select_all_user();
            default -> exit_login();
        }

    }

    //function 用户注册
    public void funtction_register() {
        movieTheater.register();
    }

    //修改用户信息
    private void function_updateuser() {
//传递对象status
        movieTheater.updateuser(status);
    }

    //查询用户信息
    private void function_selectuser() {
        movieTheater.select_user(status);
    }

    //退出系统
    private void exit() {
        System.exit(0);
    }

    //用户登录
    private void confirm_home_user() {
        System.out.println("请输入您的用户名");
        String username = sc.next();
        System.out.println("请输入您的密码");
        String password = sc.next();
        User user = confirm_user(username, password);
        if (user != null) {
            System.out.println("登录成功");
            function_user();

        } else {
            System.out.println("用户名或密码错误请检查您的用户名或者密码");
            menu.showmenu();
        }


    }

    // 管理员登录
    private void confirm_home_admin() {
        System.out.println("请输入您的用户名");
        String username = sc.next();
        System.out.println("请输入您的密码");
        String password = sc.next();
        User user = confirm_admin(username, password);
        if (user != null) {
            System.out.println("登录成功");
            function_admin();

        } else {
            System.out.println("用户名或密码错误请检查您的用户名或者密码");
            menu.showmenu();
        }
    }

    //管理员密码验证验证以及传递用户对象
    private User confirm_admin(String name, String password) {
        for (int i = 0; i < MovieTheater.uscount; i++) {
            if (MovieTheater.users[i].getRole() == 1) {
                if (name.equals(MovieTheater.users[i].username)) {
                    if (password.equals(MovieTheater.users[i].getPassword())) {
                        status = MovieTheater.users[i];
                        return status;

                    }
                }
            }
        }
        return null;

    }
    //用户验证
    private User confirm_user(String name, String password) {
        for (int i = 0; i < MovieTheater.uscount; i++) {
            if (MovieTheater.users[i].getRole() == 2) {
                if (name.equals(MovieTheater.users[i].username)) {
                    if (password.equals(MovieTheater.users[i].getPassword())) {
                        status = MovieTheater.users[i];
                        return status;

                    }
                }
            }
        }
        return null;

    }

    private void function_select_all_user() {
        movieTheater.select_alluser();

    }

    private void exit_login() {
        status = null;
        menu.showmenu();
    }

    @Override
    public String toString() {
        return getUsername() + "\t" + getPhone() + "\t" + getPassword() + "\t";
    }
}