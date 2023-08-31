package com.java.interface_ex;

import org.w3c.dom.Node;

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
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }


    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        Node pointer = first;
        int i = 0;
        while (pointer.next != null) {
            array[i++] = pointer;
            pointer = pointer.next;
        }

        return array;
        //返回数组
    }

    @Override
    public boolean add(Object o) {
        Node current = new Node(o, null);
        if (first == null) {
            first = current;
        } else {
            //有元素的情况一种遍历到最后一位空的
            Node point = first; //头结点
            //循环内指针每次,将指向下一个节点
            while (point.next != null) {
                point = point.next;
            }
            //找到最后一个元素后
            point.next = current;
        }
        size++;

        return true;

    }

    @Override
    public boolean remove(Object o) {
        Node pointer = first;
        while (pointer != null) {
            //分为三种情况头尾中
            //头结点
            if (first.value.equals(o)) {
                first = first.next;
                size--;

                return true;
            } else if (pointer.next.value.equals(o) && pointer.next.next != null) {
                Node tem = pointer.next.next;
                pointer.next.next = null;
                pointer.next = tem;

                size--;

                return true;
            } else if (pointer.next.next == null) {
                pointer.next = null;
                size--;
                return true;
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
        size = 0;
    }

    @Override
    public Object get(int index) {

        Node pointer = first;
        while (pointer != null && index != 0) {
            if (pointer == null) return null;
            pointer = pointer.next;
            index--;
        }
        return pointer.value;
    }

    @Override
    public Object set(int index, Object element) {
        Node current = new Node(element, null);
        Node pointer = first;
        Object old = null;
        if (first != null && index >= 0 && index < size) {
            for (int i = index; i > 0; i--) {
                pointer = pointer.next;
            }
            old = pointer;
            pointer.value = element;

        }
        return old;
//        while(pointer!=null){
////            pointer=pointer.next;
//            if (index!=2){
//                index--;
//                continue;
//            }else {
//                Node tem = pointer.next.next;
//                current.next = tem;
//                pointer.next = current;
//                return current;
//            }
//        }

    }

    @Override
    public void add(int index, Object element) {
        Node current = new Node(element, null);
        Node pointer = first;
        //下标判断
        if (index >= 0 && index <= size) {
            if (index == 0) {
                //新加元素为头节点
                current.next = first;
                first = current;
            }
            while (pointer.next != null) {
                pointer = pointer.next;
                index--;
                if (index == 1) {
                    current.next = pointer.next;
                    pointer.next = current;
                }
            }
            size++;
        }
    }

    @Override
    public Object remove(int index) {
        Node pointer = first;
        if (size < 0 || index < 0 || index >= size) {
            return null;
        }
        if (index == 0) {
            first = first.next;
        }
        while (index > 0) {
            if (index == 1) {
                if (pointer.next != null) {
                    pointer.next = pointer.next.next;
                } else {
                    pointer.next = null;
                }
            }
            pointer = pointer.next;
            index--;
        }

        size--;
        return null;
    }

    @Override
    public int indexOf(Object o) {
        Node pointer = first;
//        int count = 0;
//        while (pointer != null) {
//            if (o == null && pointer == null) return count;
//            else if (pointer.value.equals(o)) return count;
//            pointer = pointer.next;
//            count++;
//        }
        for (int i = 0; i < size; i++) {
            if (pointer.value == null && o == pointer.value) return i;
            else if (pointer.value.equals(o)) return i;
            pointer = pointer.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        Node pointer = first;
        for (int i = 0; i < size; i++) {
            // if (pointer != null) {
            if (pointer.value == null && o == null) {
                index = i;
            } else if (pointer.value.equals(o)) {
                index = i;
            }
            pointer = pointer.next;
        }
        if (index != -1) {
            return index;
        } else return -1;

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
        Linked newlink = new Linked();
        Node pointer = first;
        for (int i = 0; i < toIndex; i++) {
            if (i >= fromIndex) {

                newlink.add(pointer.value);
            }
            pointer = pointer.next;


        }
        return newlink;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node pointer = first;
        for (int i = 0; i < size; i++) {
            if (pointer != null) {
                sb.append(pointer.value);
                pointer = pointer.next;
            }

        }
        return sb.toString();
    }

    //内部类
    private class Node {
        //储存元素的值
        private Object value;
        //指向的下一个节点的元素(对象)
        private Node next;

        //有参构造
        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            if (obj == this) {
                return true;
            }

            if (obj instanceof Node node) {
                if (this.value == null) {
                    return node.value == null;
                } else {
                    return value.equals(node.value);
                }
            }
            return false;
        }

    }
}
