package com.java.interface_ex;


import java.util.*;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/29 15:32
 * @desciption:
 */
public class Mylist implements List {

    private int size;
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
        if (indexOf(o) == -1) return false;
        else return true;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        grow(size + 1);
        value[size] = o;
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

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {


    }


    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < value.length; i++) {
            if (o == null && value[i] == null) return i;
            else if (value[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
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
    public List subList(int fromIndex, int toIndex) {
        return null;
    }
}
