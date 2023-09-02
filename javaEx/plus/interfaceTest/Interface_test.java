package javaEx.plus.interfaceTest;

import java.awt.print.Printable;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/1 19:51
 * @desciption:
 */
public class Interface_test {
    public interface Bird{
        public static final   int a = 0;
        public abstract void boom();
        public abstract  void bark();
        public abstract void now();
         default void println(){
            System.out.println("这是个私有默认方法");
        }
        private static void print(){
            System.out.println("抽象静态方法");
        }
        private void printf(){
            System.out.println("这是个私有方法");
        }

    }
    static class Redbird implements Bird{

        @Override
        public void boom() {

        }

        @Override
        public void bark() {

        }

        @Override
        public void now() {

        }

    }

}
  class Test{

        public static void main(String[] args) {


    }

}

