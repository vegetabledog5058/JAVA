package object.oriented.comprehensive;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/14 23:49
 * @desciption: 测试类
 */
public class studentTest {
    public static void main(String[] args) {
        Student arr[] = new Student[3];
        Student s1 = new Student(1, "张三", 20);
        Student s2 = new Student(2, "李四", 26);
        Student s3 = new Student(3, "王五", 24);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        //arr[2] = s3;

        //要求1:添加一个新学生对象,并在添加时候对学号进行唯一性判断
        //要求2:遍历数组
        //进行判断,如果没有存满遍历arr否则遍历newarr
        Student s4 = new Student(4, "老六", 16);
        boolean flag = existId(arr, s4.getId());
        if (flag) {
            System.out.println("ID已经存在");
        } else {
            int count = repeat(arr);
            if (count == arr.length) {
                //已经存满
                //创建方法copy数组
                Student newarr[] = newarr(arr);
                newarr[count] = s4;
                //printArr(newarr);
            } else {
                arr[count] = s4;
                //printArr(arr);
            }

        }
        //要求3.通过id删除学生信息,存在则删除不存在提示删除失败

        int index  = findIndex(arr,4);
        if(index==-1){
            System.out.println("删除失败");
        }else {
            arr[index] = null;
            printArr(arr);
        }
        //4.删除完后遍历数组









    }
    //问题3创建一个方法找到id的索引
    public static int findIndex(Student []arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            //非空判断
            if (s != null) {
                if(id == s.getId()){
                    return i;
                }
            }

        }return -1;
    }

    //写一个方法遍历并且打印数组
    public static void printArr(Student[] arr) {

        for (int i = 0; i < arr.length; i++) {
            Student s = arr[i];
            if (arr[i] != null) {
                System.out.println(s.getId() + "," + s.getName() + "," + s.getAge());
            }
        }

    }

    //写一个方法创建arr.length+1 长度的数组
    public static Student[] newarr(Student arr[]) {
        Student[] newarr = Arrays.copyOf(arr, arr.length + 1);
        return newarr;
    }
   

    //写一个方法判断数组是否已满
    public static int repeat(Student arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //写一个方法,对学号是否重复进行判断
    public static boolean existId(Student arr[], int id) {
        for (int i = 0; i < arr.length; i++) {

            Student s = arr[i];
            //增加非空判断
            if (arr[i] != null) {
                if (s.getId() == id) {
                    return true;
                }
            }
        }
        return false;


    }
}
