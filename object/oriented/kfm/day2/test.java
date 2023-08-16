package object.oriented.kfm.day2;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/16 14:08
 * @desciption:
 */
public class test {public static void main(String[] args)
{
    //方式1:public Integer(int value)
    int a= 100;
    //将int类型的i转换为Integer类型的ii
    Integer n1 = 100;
    Integer n2 = 100;
    //-----
   Integer old1 = new Integer(100);
   Integer old2 = new Integer(100);
   Integer old3 = new Integer(100);
    //---------
   Integer num2 = Integer.valueOf(100);
   Integer num3 = Integer.valueOf(100);
   Long num4 = Long.valueOf(100);
    System.out.println(n1==a);
    System.out.println();
    System.out.println(n1==n2);
    System.out.println();
    System.out.println(old1 == old2);
    System.out.println();
    System.out.println(num2.equals(num3));
    System.out.println(num4.equals(num3));


    //方式２:public Integer(String s)
    String s = "100";
    //String s = "abc";出错,因为这个字符串必须由数字字符组成。
    Integer iii = new Integer(s);
    System.out.println("iii:"+iii);//100
}

}
