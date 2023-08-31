package date_Structure.interface_ex;


import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/29 15:32
 * @desciption:
 */
public class Mylist implements List {

    private  int size;
    private int increment;
    private Object value[];
    private static final int default_size = 12;
    private static final int default_increment = 10;


    public Mylist() {

        this(default_size, default_increment);
    }

    public Mylist(int size) {
        this(size, default_increment);
    }

    public Mylist(int size, int increment) {
        if (size < 0) {
            size = default_size;
        }
        if (increment < 0) {
            increment = default_increment;
        }
        value = new Object[size];
        this.increment = increment;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
       return indexOf(0)!=-1;
    }


    @Override
    public Object[] toArray() {
        return Arrays.copyOf(value, size);
    }

    @Override
    public Object[] toArray(Object[] a) {
        return Arrays.copyOf(a, a.length);
    }

    @Override
    public boolean add(Object o) {
        grow(size + 1);
        value[size] = o;
        size++;
        return true;
    }

    private void grow(int minCapacity) {
        // 所需空间 大于 总长度
        if (minCapacity > value.length) {
            // 扩容
            int old = value.length;
            int newLength = old + increment;

            // 把元素复制到新数组中
            value = Arrays.copyOf(value, newLength);
        }
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o == null && value[i] == null) return true;
            if (value[i].equals(o)) {
                System.arraycopy(value,i+1,value,i,size-i);
                value[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {
        value = new Mylist[]{};
    }

    @Override
    public Object get(int index) {
        if (index >= 0 && index < size) return value[index];
        else return null;
    }

    @Override
    public Object set(int index, Object element) {
        Object tem = value[index];
        value[index] = element;
        return tem;
    }

    @Override
    public void add(int index, Object element) {
        if(index>=0&&index<=size()){
            System.arraycopy(value,index,value,index+1,size()-index);
            value[index]=element;
            size++;
        }


    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        //可以用数组进行最后用list of()将数组转换为列表返回,也可以此种做法
        int length = toIndex-fromIndex;
        Mylist tem= new Mylist(length);
        for (int i = fromIndex; i < toIndex; i++) {
            tem.add(value[i]);
        }


        return tem;
    }


    @Override
    public Object remove(int index) {
        if (index < size() && index >= 0) {
            Object tem = value[index];
            System.arraycopy(value,index+1,value,index,size-index);
            value[--size] = null;
            return tem;
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o == null && value[i] == null) return i;
            else if (value[i].equals(o)) return i;
        }
        return -1;
    }


    @Override
    public int lastIndexOf(Object o) {
        for (int i = size() - 1; i > 0; i--) {
            if (o == null && value[i] == null) return i;
            else if (value[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(value);
    }
}
