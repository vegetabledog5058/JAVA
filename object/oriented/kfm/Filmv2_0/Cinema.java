package object.oriented.kfm.Filmv2_0;

import java.util.Scanner;


public class Cinema {
    private Scanner sc = new Scanner(System.in);
    private Movie movie = new Movie();
    private User user = new User();
    private User status;
    private Integer deleteIndex;

    private List users = new List();
    private List movies = new List();


    {
        addmovie_add(new Movie("泰坦尼克号", 200.0, "james", 2011, 100));
        addmovie_add(new Movie("星球大战", 900.0, "喜羊羊", 2007, 50));
        addmovie_add(new Movie("绿皮书", 300.0, "双面龟", 2009, 30));
        addmovie_add(new Movie("霸王别姬", 666.0, "张国荣", 2004, 60));
        addmovie_add(new Movie("盗梦空间", 999.0, "玛卡巴卡", 2002, 80));
        //sort_Movies();


        adduser(new User("admin", "13109315251", "admin", 1));
    }

    //开始菜单
    public void showmenu() {
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
        startmenu(input);
    }

    //开始菜单
    public void startmenu(int input) {
        switch (input) {
            case 1 -> function_searchmovie();
            case 2 -> function_showallmovies();
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
        System.out.println("3. 购买电影票");
        System.out.println("4. 查询电影票");
        System.out.println("5. 退出登录");
        int input = sc.nextInt();
        user_home(input);
    }

    private void user_home(int input) {
        switch (input) {
            case 1 -> function_updateuser();
            case 2 -> function_selectuser();
            case 3 -> buyTicket();
            case 4 -> showTickets();
            default -> exit_login();
        }
    }

    //管理员登录
    public void function_admin() {
        System.out.println("1. 新增电影");
        System.out.println("2. 删除电影（输入电影名称，删除对应电影）");
        System.out.println("3. 修改电影（输入电影名称，展示电影信息，选择要修改的内容（价格/上映时" +
                "间），输入内容，修改已存储的电影信息）");
        System.out.println("4. 查看所有用户信息");
        System.out.println("5. 退出登录");
        int input = sc.nextInt();
        admin(input);
    }

    private void admin(int input) {
        switch (input) {
            case 1 -> addmovie_input();
            case 2 -> function_deletemovie();
            case 3 -> function_update();
            case 4 -> function_select_all_user();
            default -> exit_login();
        }

    }

    //function 用户注册
    public void funtction_register() {
        register();
    }

    //修改用户信息
    private void function_updateuser() {
//传递对象status
        updateuser(status);
    }

    //查询用户信息
    private void function_selectuser() {
        select_user(status);
    }

    public Movie function_searchmovie(String name) {
        Movie searchmovie = searchmovie(name);
        if (searchmovie == null) {
            System.out.println("没有这个电影");
        } else {
            return searchmovie;
        }
        return null;

    }

    //购买电影票
    private void buyTicket() {
        showallmovies();
        Movie movie = null;
        do {
            if (movie != null) {
                System.out.println("请重新选择");
            }
            System.out.println("请输入要买的电影名称：");
            String name = sc.next();
            movie = function_searchmovie(name);


        } while (!(movie.getTicketCount() > 0));


        Integer count = null;
        do {
            if (count != null) {
                System.out.println("输入错误");
            }
            System.out.println("请输入购买数量：");
            count = sc.nextInt();
        } while (!(count > 0 && count <= movie.getTicketCount()));

        Tickets ticket = new Tickets(movie, count);
        double money = movie.getPrice() * count;
        System.out.println(count + "张" + movie.getName() + "票，共计 " + money + "元，请支付。");

        // 添加票
        status.addTicket(ticket);

        // 变电影票数量
        movie.setTicketCount(movie.getTicketCount() - count);

        System.out.println("购票成功");
        function_user();
    }

    //查询电影票
    private void showTickets() {
        status.showTickets();
        function_user();
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
            showmenu();
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
            showmenu();
        }
    }

    //管理员密码验证验证以及传递用户对象
    private User confirm_admin(String name, String password) {
        for (int i = 0; i < users.length(); i++) {
            if (users.getUser(i).getRole() == 1) {
                if (name.equals(users.getUser(i).getUsername())) {
                    if (password.equals(users.getUser(i).getPassword())) {
                        status = users.getUser(i);
                        return status;

                    }
                }
            }
        }
        return null;

    }

    //用户验证
    private User confirm_user(String name, String password) {
        for (int i = 0; i < users.length(); i++) {
            if (users.getUser(i).getRole() == 2) {
                if (name.equals(users.getUser(i).getUsername())) {
                    if (password.equals(users.getUser(i).getPassword())) {
                        status = users.getUser(i);
                        return status;

                    }
                }
            }
        }
        return null;

    }

    private void function_select_all_user() {
        select_alluser();

    }

    private void exit_login() {
        status = null;
        showmenu();
    }

    //排序
//    private void sort_Movies() {
//        for (int i = 0; i < movies.length(); i++) {
//            for (int j = 0; j < movies.length() - i - 1; j++) {
//                if (movies.getMovie(j).getDate() < movies.getMovie(j+1).getDate()) {
//                    Movie tem = movies.getMovie(j);
//                    movies.getMovie(j) = movies.getMovie(j+1);
//                    movies.getMovie(j+1) = tem;
//                }
//            }
//
//        }
//    }

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
        Movie movie = new Movie(name, price, director, date, ticketCount);
        addmovie_add(movie);
        System.out.println("添加成功");
        function_admin();
    }
    //添加电影

    public void addmovie_add(Movie movie) {
        movies.add(movie);


    }


    //删除电影
    public void function_deletemovie() {
        System.out.println("输入您要删除的电影的名字:");
        String input = sc.next();
        boolean result = deletemovie(input);
        if (result) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败,不存在此电影");
        }
        function_admin();
    }

    private boolean deletemovie(String name) {
        for (int i = 0; i < movies.length(); i++) {
            if (name.equals(movies.getMovie(i).getName())) {
                deleteIndex = i;
                movies.delete(i);
                return true;

            }
        }
        return false;
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
        function_admin();
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
        showmenu();
    }

    //查询某一个电影
    private Movie searchmovie(String name) {
        for (int i = 0; i < movies.length(); i++) {
            if (name.equals(movies.getMovie(i).getName())) {
                return movies.getMovie(i);
            }
        }
        return null;
    }

    //查询全部电影
    private void function_showallmovies() {
        //sort_Movies();
        showallmovies();
        showmenu();
    }

    private void showallmovies() {
        for (int i = 0; i < movies.length(); i++) {
            if (movies.getMovie(i) != null) {
                System.out.println("第" + (i + 1) + "个电影");
                System.out.println(movies.getMovie(i).toString());
            }
        }
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
        showmenu();
    }

    //添加用户到数组
    private void adduser(User user) {
        users.add(user);
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
        function_user();
    }

    private void upphone() {
        System.out.println("输入您的新电话");
        String phone = sc.next();
        status.setPhone(phone);
        function_user();
    }

    private void uppassword() {
        System.out.println("输入您的新密码");
        String password = sc.next();
        status.setPassword(password);
        function_user();
    }

    //查询用户信息
    public void select_user(User status) {
        this.status = status;
        System.out.println(status.toString());
        function_user();
    }

    //查询所有用户信息
    public void select_alluser() {
        for (int i = 0; i < users.length(); i++) {
            if (users.getUser(i).getRole() == 2) {
                System.out.println(users.getUser(i).toString());
            } else {
                System.out.println("暂无用户");
            }
        }
        function_admin();
    }


}
