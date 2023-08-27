package date_Structure;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/27 15:24
 * @desciption: 栈
 */
public class Stack {
    Object stack[] = new Object[10];
    //元素下一个存放的索引(元素数量)
    int index = 0;

    /**
     * 将元素压入栈顶
     * 入栈
     * abstract void push(Object element);
     *
     * @param element 要压入的元素
     */
    private boolean booleannull(Object element) {
        if (element == null) {
            return true;
        } else return false;
    }

    public void push(Object element) {
        if (booleannull(element)) {
            System.out.println("插入失败");
        } else {
            if (index + 1 > stack.length) {
                grow();
            } else {
                stack[index] = element;
                index++;
            }
        }
    }

    private void grow() {
        stack = Arrays.copyOf(stack, 2 * stack.length);
    }

    /**
     * 弹出栈顶元素并返回
     * 把栈顶元素删除，并返回
     * 出栈
     * abstract Object pop();
     *
     * @return 弹出的栈顶元素, 如果栈为空返回 null
     */
    public Object pop() {
        if (!isEmpty()) {
            Object tem = stack[--index];
            stack[++index] = null;
            return tem;
        } else {
            return null;
        }

    }

    /**
     * 返回栈顶元素，但不弹出
     * abstract Object peek();
     *
     * @return 栈顶元素
     */
    public Object peek() {
        int temIndex = index;
        return stack[--temIndex];
    }

    /**
     * 检查栈是否为空
     * abstract boolean isEmpty();
     *
     * @return 如果栈为空则返回true，否则返回false
     */
    public boolean isEmpty() {
        return stack[--index] == null;
    }

    /**
     * 返回栈中的元素个数
     * abstract int size();
     *
     * @return 栈中元素的个数
     */
    public int size() {
        return index + 1;
    }



    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
    @Override
    public boolean equals(Object obj ){
        if(obj==null)return false;
        if (this == obj)return true;
        if(obj instanceof Stack stack){
            return true;
        }
        return false;
    }
}

