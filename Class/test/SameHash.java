package Class.test;

import javaEx.plus.collection.Student;

import javax.naming.Name;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/11 10:08
 * @desciption:
 */
public class SameHash {
    public static void main(String[] args) {
        element s1 = new element(1, "a");
        element s3 = new element(1, "a");
        element s2 = new element(3, "c");


        Set<element> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
        s2.setNum(4);
        s2.setName("d");
        set.add(s2);
        System.out.println(set);
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());

    }

    static class element {
        private int num;
        private String name;

        public element(int num, String name) {
            this.num = num;
            this.name = name;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return Integer.toString(num) + "\t" + name;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            element otherElement = (element) o;

            return num == otherElement.num;
        }
        @Override
        public int hashCode() {
            return Objects.hash(num,name);
        }


    }
}