package object.oriented.kfm.film;

import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/19 13:32
 * @desciption:
 */
public class Menu {
    static MovieTheater movieTheater = new MovieTheater();
    static User user = new User();
    static Scanner sc = new Scanner(System.in);

    //显示菜单
    public void showmenu(){
        System.out.println("*******************************");
        System.out.println("欢迎来到开发喵电影院,输入数字选择功能");
        System.out.println("1. 查询电影信息");
        System.out.println("2. 显示所有电影信息 (按照评分降序显示)");
        System.out.println("3. 管理员登录");
        System.out.println("4. 用户登录");
        System.out.println("5. 用户注册");
        System.out.println("6. 退出");
        System.out.println("*******************************");
        int input = sc.nextInt();
        user.startmenu(input);


    }


}
