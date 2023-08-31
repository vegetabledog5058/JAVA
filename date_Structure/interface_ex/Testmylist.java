package date_Structure.interface_ex;

import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/29 18:54
 * @desciption:
 */
public class Testmylist {
    public static void main(String[] args) {
        Mylist list = new Mylist();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(0,"cc");
        list.add(4,"yy");
        System.out.println(list.toString());
        list.remove(2);
        System.out.println(list.toString());
        List tem = list.subList(2,3);
        //System.out.println(tem.toString());
        //System.out.println(tem.size());
        System.out.println(list.toString());



    }


}
