package com.java.interface_ex;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/29 20:14
 * @desciption:
 */
public class Linked implements List {
    //头节点
    private Node first;
    //记录节点个数

    private int size;
    @Override
    public int size() {
        return size+1;
    }

    @Override
    public boolean isEmpty() {
        return first==null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    @Override
    public Object[] toArray() {
        Object []array = new Object[size()];
        Node pointer = first;
        int i = 0;
        while (pointer.next!=null){
            array[i++] = pointer;
            pointer = pointer.next;
        }
        array[i] = pointer;
        return array;
        //返回数组
    }

    @Override
    public boolean add(Object o) {
        Node current = new Node(o,null);
        if(first==null){
            first = current;
        }else {
            //有元素的情况一种遍历到最后一位空的
            Node point = first; //头结点
            //循环内指针每次,将指向下一个节点
            while (point.next!=null){
                point = point.next;
            }
            //找到最后一个元素后
            point.next = current;
            size++;
            return true;
        }


        return false;
    }

    @Override
    public boolean remove(Object o) {
        Node pointer = first;
        while (pointer!=null){
            if(pointer.value.equals(o)){

            }
            pointer = pointer.next;

        }


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
    public void clear() {
        first = null;
    }

    @Override
    public Object get(int index) {
        Node pointer = first;
        while (pointer!=null&&index!=0){
            pointer = pointer.next;
            index--;
        }
        return pointer.value;
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
       Node pointer = first;
       int count =0;
       while (pointer!=null){
           if(o==null&&pointer==null)return count;
           if(pointer.value.equals(o)) return count;
           pointer = pointer.next;
           count++;
       }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        //
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

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
    @Override
    public Iterator iterator() {
        return null;
    }


    //内部类
    private class Node{
    //储存元素的值
    private Object value;
    //指向的下一个节点的元素(对象)
    private Node next;

    //有参构造
    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }
}
}
