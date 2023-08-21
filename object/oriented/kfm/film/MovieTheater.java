package object.oriented.kfm.film;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/18 21:22
 * @desciption: 电影院类
 */
public class MovieTheater {
     private Movie[] movies = new Movie[10];
    static  User[] users = new User[10];
    static private Scanner sc = new Scanner(System.in);
    static private Movie movie = new Movie();
    static private User user = new User();
    static private Menu menu = new Menu();
    private  User status;
    private Integer deleteIndex;

    static private int mvcount = 0;
    static int uscount = 0;

    {

        addmovie_add(new Movie("泰坦尼克号", 200.0, "james", 2011,100));
        addmovie_add(new Movie("星球大战", 900.0, "喜羊羊", 2007,50));
        addmovie_add(new Movie("绿皮书", 300.0, "双面龟", 2009,30));
        addmovie_add(new Movie("霸王别姬", 666.0, "张国荣", 2004,60));
        addmovie_add(new Movie("盗梦空间", 999.0, "玛卡巴卡", 2002,80));
        sort_Movies();


        adduser(new User("admin", "13109315251", "admin", 1));
    }


    //排序
    private void sort_Movies() {
        for (int i = 0; i < mvcount; i++) {
            for (int j = 0; j < mvcount - i - 1; j++) {
                if (movies[j].getDate() < movies[j + 1].getDate()) {
                    Movie tem = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = tem;
                }
            }

        }
    }

    //添加电影
    public void addmovie_input() {
        System.out.println("请输入电影名称(String)");
        String name = sc.next();
        System.out.println("请输入电影价格(Double)");
        Double price = sc.nextDouble();
        System.out.println("请输入电影的导演(String)");
        String director = sc.next();
        System.out.println("请输入上映日期(Integer)");
        Integer date = sc.nextInt();
        System.out.println("请输入电影票数量(Integer)");
        Integer ticketCount = sc.nextInt();
        Movie movie = new Movie(name, price, director, date,ticketCount);
        addmovie_add(movie);
        user.function_admin();
    }
    //添加电影,判断条件是否扩容

    private void addmovie_add(Movie movie) {
        if (mvcount + 1 > movies.length) {
            extend_movies();
        } else {
            movies[mvcount++] = movie;
        }

    }

    //扩容数组
    private void extend_movies() {
        movies = Arrays.copyOf(movies, movies.length * 2);
    }

    //删除电影
    public void function_deletemovie() {
        System.out.println("输入您要删除的电影的名字:");
        String input = sc.next();
        boolean result = deletemovie(input);
        if (result) {
            movieFill();
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败,不存在此电影");
        }
        user.function_admin();
    }

    private boolean deletemovie(String name) {
        for (int i = 0; i < mvcount; i++) {
            if (name.equals(movies[i].getName())) {
                deleteIndex = i;
                movieFill();
                return true;

            }
        }
        return false;
    }

    //删除电影后数组的向前填充
    private void movieFill() {

        System.arraycopy(movies, deleteIndex + 1, movies, deleteIndex, movies.length - 1 - deleteIndex);
        movies[--mvcount] = null;

    }

    //修改电影
    public void function_update() {
        System.out.println("输入您要修改的电影名称");
        String input = sc.next();
        Movie movie = searchmovie(input);
        if (movie == null) {
            System.out.println("输入的电影不存在");
        } else {
            update(movie);

        }
        user.function_admin();
    }

    //修改电影
    private void update(Movie movie) {
        System.out.println("1. 修改价格");
        System.out.println("2. 修改上映时间");
        System.out.println("选择要修改的内容");
        int input = sc.nextInt();

        updatemovie(input, movie);
    }

    private void updatemovie(int input, Movie movie) {
        switch (input) {
            case 1 -> updateprice(movie);
            case 2 -> updatedate(movie);
        }
    }

    //修改价格
    private void updateprice(Movie movie) {
        System.out.println("请输入新的价格");
        Double input = sc.nextDouble();
        movie.setPrice(input);
        System.out.println("修改成功");
    }

    //修改上映时间
    private void updatedate(Movie movie) {
        System.out.println("请输入新的上映日期");
        Integer input = sc.nextInt();
        movie.setDate(input);
        System.out.println("修改成功");
    }

    //主菜单功能---判断电影是否存在
    public void function_searchmovie() {
        System.out.println("输入电影名称");
        String name = sc.next();
        Movie searchmovie = searchmovie(name);
        if (searchmovie == null) {
            System.out.println("没有这个电影");
        } else {
            System.out.println(searchmovie.toString());
        }
        menu.showmenu();
    }

    //查询某一个电影
    private Movie searchmovie(String name) {
        for (int i = 0; i < mvcount; i++) {
            if (name.equals(movies[i].getName())) {
                return movies[i];
            }
        }
        return null;
    }

    //查询全部电影
    public void function_showallmovies() {
        sort_Movies();
        for (int i = 0; i < mvcount; i++) {
            if (movies[i] != null) {
                System.out.println("第" + (i + 1) + "个电影");
                System.out.println(movies[i].toString());
            }
        }
        menu.showmenu();
    }

    //--------------------------------
    //输入用户信息
    public void register() {
        System.out.println("输入您的用户名");
        String name = sc.next();
        System.out.println("输入您的联系电话");
        String phone = sc.next();
        System.out.println("输入您的密码");
        String password = sc.next();
        User user = new User(name, phone, password, 2);
        adduser(user);
        System.out.println("注册成功");
        menu.showmenu();
    }

    //添加用户到数组
    private void adduser(User user) {
        if (uscount + 1 > users.length) {
            extend_users();
        } else {
            users[uscount++] = user;
        }
    }

    private void extend_users() {
        users = Arrays.copyOf(users, 2 * users.length);
    }

    //修改用户信息
    public void updateuser(User user) {
        this.status = user;
        System.out.println("请选择要修改的信息");
        System.out.println("1. 姓名");
        System.out.println("2. 电话");
        System.out.println("3. 密码");
        int input = sc.nextInt();
        info_choice(input);


    }

    //选择修改的信息
    private void info_choice(int input) {
        switch (input) {
            case 1 -> upname();
            case 2 -> upphone();
            case 3 -> uppassword();
        }
    }

    private void upname() {
        System.out.println("输入您的新用户名");
        String username = sc.next();
        status.setUsername(username);
        user.function_user();
    }

    private void upphone() {
        System.out.println("输入您的新电话");
        String phone = sc.next();
        status.setPhone(phone);
        user.function_user();
    }

    private void uppassword() {
        System.out.println("输入您的新密码");
        String password = sc.next();
        status.setPassword(password);
        user.function_user();
    }

    //查询用户信息
    public void select_user(User status) {
        this.status = status;
        System.out.println(status.toString());
        user.function_user();
    }

    //查询所有用户信息
    public void select_alluser() {
        for (int i = 0; i < uscount; i++) {
            if (users[i].getRole() == 2) {
                System.out.println(users[i].toString());
            } else {
                System.out.println("暂无用户");
            }
        }
        user.function_admin();
    }


}
