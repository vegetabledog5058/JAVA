package object.oriented.heima.fightGame;

import com.sun.source.tree.NewArrayTree;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/13 16:17
 * @desciption: 测试类
 */
public class pstest {
    public static void main(String[] args) {
        Role r1 = new Role("Joe",100,'女');
        Role r2 = new Role("Tomy",100,'男');

        r1.showRoleInfo();
        r2.showRoleInfo();

       /* while (true){
            r1.attack(r2);
            if(r2.getLife()==0){
                System.out.println(r1.getName()+"KO了"+ r2.getName());
                break;
            }
            if (r1.getLife()==0){
                System.out.println(r2.getName()+"KO了"+r1.getName());
                break;
            }
        }*/
    }






}
