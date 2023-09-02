package date_Structure.Link;

import java.util.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/31 19:21
 * @desciption:
 */
public class DoubleLinked extends AbstractDoublelink {
    private int size;
    private Node first;
    private Node last;

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
        Node pointer = first;
        Object arr[] = new Object[size];
        for (int i = 0; i < size; i++) {
            if (pointer != null) {
                arr[i] = pointer;
                pointer = pointer.next;
            }
        }
        return super.toArray();
    }

    @Override
    public boolean add(Object o) {
        if (first == null) last = first = new Node(null, o, last);
        else last = last.next = new Node(last, o, null);
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (first == null) return false;
        if (first.equalsValue(o)) {
            first = first.next;
            first.pre = first.pre.next = null;

        } else {
            Node pointer = first.next;
            while (pointer.next != null && !pointer.equalsValue(o)) {
                pointer = pointer.next;
            }
            if (pointer != null) {
                if (last == pointer) {
                    pointer.pre.next = pointer.pre = null;
                    last = pointer.pre;

                } else {
                    pointer.pre.next = pointer.next;
                    pointer.next.pre = pointer.pre;
                }
            }

        }
        size--;
        return true;
    }


    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        if(index>=size||index<0){
            throw new NullPointerException("越界");
        }
        Node pointer = first;
        for (int i = index - 1; i >= 0; i--) {
            pointer = pointer.next;
        }
        return pointer.value;
    }

    @Override
    public Object set(int index, Object element) {
        Object old = null;
        if (index >= 0 && index < size) {
            if (index == 0) {
                old = first;
                first = first.next.pre = new Node(null, element, first.next);
            } else if (index == size - 1) {
                old = last;
                last = last.pre.next = new Node(last.pre, element, null);

            } else {
                Node prepointer = first;
                for (int i = index; i > 0; i--) {
                    if (prepointer != null) {
                        prepointer = prepointer.next;
                    }
                }
                old = element;
                prepointer.pre.next = prepointer.next.pre = new Node(prepointer.pre, element, prepointer.next);
            }
        }
        return old;
    }

    @Override
    public void add(int index, Object element) {
        boolean flag = index <= size >> 1 ? true : false;
        if (index == 0) first = first.pre = new Node(null, element, first);
        else if (index == size) last = last.next = new Node(last, element, null);
        else {
            Node prepointer = first;
            Node lastpointer = last;
            //索引靠前
            if (flag) {
                for (int i = index; i > 0; i--) {
                    prepointer = prepointer.next;
                }
                prepointer.pre = prepointer.pre.next = new Node(prepointer.pre, element, prepointer);
            } else {
                for (int i = size - 1; i <= size - 1 - index; i++) {
                    lastpointer = lastpointer.pre;
                }
                lastpointer.pre = lastpointer.pre.next = new Node(lastpointer.pre, element, lastpointer);
            }
        }
        size++;
    }

    @Override
    public Object remove(int index) {
        Node pointer = first;
        Object del = null;
        if (index >= 0 && index < size && first != null) {
            if (index == 0) {
                del = first;
                first = first.next;
                first.pre = first.pre.next = null;
            } else if (index == size - 1) {
                del = last;
                last = last.pre;
                last.next = last.next.pre = null;
            } else {
                for (int i = index - 1; i >= 0; i--) {
                    pointer = pointer.next;
                }
                del = pointer;
                pointer.next.pre = pointer.pre;
                pointer.pre.next = pointer.next;

            }
            size--;
        }
        return del;

    }

    @Override
    public int indexOf(Object o) {
        Node pointer = first;
        int count = 0;
        while (pointer != null && !pointer.equalsValue(o)) {
            pointer = pointer.next;
            count++;
        }
        if (pointer != null) {
            return count;
        }
        return -1;

    }

    @Override
    public int lastIndexOf(Object o) {
        Node pointer = last;
        int count = 0;
        while (pointer != null && !pointer.equalsValue(o)) {
            pointer = pointer.pre;
            count++;
        }
        if (pointer != null) {
            return size - 1 - count;
        }
        return -1;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        Node pointer = first;
        List newlink = new Linked();
        if (fromIndex >= 0 && toIndex <= size && fromIndex < toIndex) {
            for (int j = 0; j < toIndex; j++) {
                if (j >= fromIndex) newlink.add(pointer.value);
                pointer = pointer.next;
            }
            return newlink;
        }
        return null;

    }


    @Override
    public Object[] toArray(Object[] a) {
        Object newarr[] = new Object[a.length];
        Node pointer = first;
        int i = 0, j = 0;

        while (pointer != null && i < a.length) {
            if (pointer.equalsValue(a[i])) {
                newarr[j++] = pointer.value;
                i++;
            }
            pointer = pointer.next; // 更新 pointer 指向下一个节点
        }

        return newarr;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        Node pointer = first;
//        for (int i = 0; i < size; i++) {
//            sb.append(pointer.value);
//            if (pointer.next != null) {
//                pointer = pointer.next;
//            }
//        }
        while (pointer != null) {
            sb.append(pointer.value);
            pointer = pointer.next;
        }

        return sb.toString();
    }

    private class Node {
        private Node next;
        private Node pre;
        private Object value;

        public Node(Node pre, Object value, Node next) {
            this.pre = pre;
            this.next = next;
            this.value = value;
        }

        public boolean equalsValue(Object value) {
            if (this.value == null) return this.value == value;
            else return this.value.equals(value);
        }
    }
}


