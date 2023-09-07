package javaEx.plus.collection.homework.Day0907;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/7 16:51
 * @desciption:
 */
public class StmTest {

    public static class Actor {
        private String name;

        public Actor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<String>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");
        ArrayList<String> womanList = new ArrayList<String>();
        womanList.add("林心如");
        womanList.add("张曼玉");
        womanList.add("林青霞");
        womanList.add("柳岩");
        womanList.add("林志玲");
        womanList.add("王祖贤");


       Stream<String> stream ;
       stream = Stream.concat(manList.stream(),womanList.stream());
       stream.filter(e->!e.startsWith("林")).filter(e->e.length()>2).forEach(e->{
           System.out.println(new Actor(e).toString());
       });
//        System.out.println(list);
        System.out.println(manList);

    }
}
