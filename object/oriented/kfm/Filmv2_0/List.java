package object.oriented.kfm.Filmv2_0;

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
    private final int initial = 10;



    public List() {
        this(10);
    }

    public List(int initial) {
        arr = new Object[initial];
    }


    //添加元素
    public void add(Object obj) {
        if (count + 1 > arr.length) {

            grow();
        }
        arr[count++] = obj;
    }

    private void grow() {
        arr = Arrays.copyOf(arr, arr.length * 2);

    }

    //返回整个数组
    public Object[] showallarr() {
        return arr;
    }


    //删除元素
    public void delete(int index) {
        if (index >= 0 && index < count) {
            System.arraycopy(arr, index + 1, arr, index, arr.length - index - 1);
            arr[--count] = null;
        }


    }

    public boolean delete(Object obj) {
        for (int i = 0; i < arr.length; i++) {
            if (obj == null) {
                if (obj == arr[i]) {
                    delete(i);
                    return true;
                }
            } else {
                if (obj.equals(arr[i])) {
                    delete(i);
                    return true;
                }
            }
        }
        return false;
    }

    // 获取元素
    public User getUser(int index) {
        return (User) arr[index];
    }

    public Movie getMovie(int index) {
        return (Movie) arr[index];
    }

    public Tickets getTickets(int index) {
        return (Tickets) arr[index];
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

    //排序
    public void Moviesort() {

    }


}
