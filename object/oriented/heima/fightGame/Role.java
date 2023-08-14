package object.oriented.heima.fightGame;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Random;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/13 15:34
 * @desciption: 格斗小游戏
 */
public class Role {
    private String name;
    private int life;
    private char gender;

    private String face;

    String boyface[] = {"风流俊雅", "器宇轩昂", "面目狰狞"};
    String girlface[] = {"沉鱼落雁", "倾国倾城", "美轮美奂"};

    public Role() {
    }

    public Role(String name, int life, char gender) {
        this.name = name;
        this.life = life;
        this.gender = gender;
        setFace(gender);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if (gender == '男') {
            int index = r.nextInt(boyface.length);
            this.face = boyface[index];
        } else if (gender == '女') {
            int index = r.nextInt(girlface.length);
            this.face = girlface[index];

        } else {
            this.face = "长相狰狞";
        }
    }

    public String getFace() {
        return face;
    }

    //攻击动作
    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(40) + 1;
        //剩余血量
        int remainlife = role.life - hurt;
        remainlife = remainlife < 0 ? 0 : remainlife;
        System.out.println(this.getName() + "打了" + role.getName() + "一下" + "造成" + hurt + "伤害" + "剩余" + remainlife + "的血量");
    }

    public void showRoleInfo() {
        System.out.println(getName());
        System.out.println(getLife());
        System.out.println(getGender());
        System.out.println(getFace());
    }
}
