package date_Structure.Link;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/31 19:42
 * @desciption:
 */
public class Doublelink_test {
    public static void main(String[] args) {
        DoubleLinked test = new DoubleLinked();
        //add(Object)
        test.add("a");
        test.add("b");
        test.add("c");
        System.out.println(test.toString());

        //remove(Object)
//        test.remove("b");
//        test.remove("c");
//        test.remove("a");
        //System.out.println(test.toString());

        //get(index)
//        System.out.println(test.get(0));
//        System.out.println(test.get(1));
//        System.out.println(test.get(2));

        //add(index,element)
//        test.add(0,"0");
//        test.add(4,"z");
//        System.out.println(test.toString());
        test.add(0,"z");
        test.add(1,"a");
        test.add(3,"o");

        System.out.println(test.toString());
        System.out.println(test.size());
        //indexof(object)\
        //System.out.println(test.indexOf("c"));

        //lastIndexof()
        //System.out.println(test.lastIndexOf("z"));

        //remove(index)
        test.remove(1);
        System.out.println(test.toString());

        //sublist
        //System.out.println(test.subList(0,5));

        //toArray
        test.toArray();

        //set(index element)\
        test.set(4,"A");
        System.out.println(test.toString());


        Object arr[] = {"a","b"};
        Object newarr[] = test.toArray(arr);
        System.out.println(Arrays.toString(newarr));
    }

}
