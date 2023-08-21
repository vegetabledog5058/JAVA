package project.Filmv2_0;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/21 19:40
 * @desciption:
 */
public class List {
    private Object[] arr;
    // 元素个数
    private int count;
    Movie movie = new Movie();


    public List() {
        this(0);
    }

    public List(int initial) {
        arr = new Object[initial];
    }


    //添加元素
    public void add(Object obj) {
        if (count + 1 > arr.length) {
            arr = Arrays.copyOf(arr, arr.length + 1);
        }
        arr[count++] = obj;
    }

    //返回整个数组
    public Object[] showallarr() {
        return arr;
    }


    //删除元素
    public void delete(int index) {
        if (index >= 0 && index < count) {
            Object[] newarr = new Object[arr.length - 1];
            System.arraycopy(arr, 0, newarr, 0, index);
            System.arraycopy(arr, index + 1, newarr, index, arr.length - index - 1);
            arr = newarr;
            count--;
        }


    }

    // 获取元素
    public User getUser(int index) {
        return (User)arr[index];
    }
    public Movie getMovie(int index) {
        return (Movie) arr[index];
    }

    // 返回数组某个值
    public Object showall(int index) {
        if (index >= 0 && index < count && count != 0) {
            return arr[index];
        } else {
            return null;
        }
    }

    //数组长度
    public int length() {
        return count;
    }



}
