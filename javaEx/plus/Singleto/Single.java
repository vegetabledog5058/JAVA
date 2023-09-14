package javaEx.plus.Singleto;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/1 15:29
 * @desciption:* 单例模式
 *  * 单实例，在项目中只有一个实例。
 *  * 步骤：
 *  * 1. 构造方法私有(private)
 *  * 2. 提供获取唯一实例的方式
 */
public class Single {

    //饿汉模式
    private static final Single eh = new Single();
    private Single(){}
    public static Single getInstance(){
        return eh;
    }
}
//懒汉模式
class LazySingle{
    private static LazySingle lazySingle;
    private LazySingle(){}
    public static LazySingle getInstance(){
        if(lazySingle==null)lazySingle = new LazySingle();
            return lazySingle;
        }
    }


    //静态嵌套类(内部类)
class outer{
    private outer(){
        if(inner.outer!=null){
            throw new RuntimeException("已经有实例了");
        }
    }
    static class inner{
        private static outer outer = new outer();
    }
public static outer getInstance(){
        //内部类之间静态成员互相访问
        return inner.outer;
}
    }

class Test{
    public static void main(String[] args) {
        Single test1 = Single.getInstance();
        Single test2 = Single.getInstance();
//        System.out.println(test1);
//        System.out.println(test2);

        //懒汉
        LazySingle test3 = LazySingle.getInstance();
        LazySingle test4 = LazySingle.getInstance();
//        System.out.println(test1);
//        System.out.println(test2);

        //静态内部类
        outer test5 = outer.getInstance();
        outer test6 = outer.getInstance();
        System.out.println(test1);
        System.out.println(test2);
    }
}