package date_Structure;

import java.util.Arrays;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/8/27 15:31
 * @desciption: 队列
 */
public class queue {

    Object queue[] = new Object[10];
    int length = 0;
    int index = 0;

    /**
     * 将元素插入队尾
     *
     * @param element 要插入的元素
     *                void enqueue(Object element);
     */
    private boolean booleannull(Object element) {
        if (element == null) {
            return true;
        } else return false;
    }

    public void enqueue(Object element) {
        if (booleannull(element)) {
            System.out.println("插入失败");
        } else {
            if (length + 1 > queue.length) {
                grow();
            } else {
                queue[length] = element;
                length++;
            }
        }
    }

    private void grow() {
        queue = Arrays.copyOf(queue, 2 * queue.length);
    }

    /**
     * 移除并返回队首元素
     * 删除第一个元素，并返回
     *
     * @return 队首元素, 如果队列为空时，返回 null
     * abstract Object dequeue();
     */
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }
        Object tem = queue[0];
        System.arraycopy(queue,   1, queue, 0, length - 1 );
        queue[length-1] = null;
        length -= 1;
        return tem;
    }
    /**
     * 返回队首元素，但不移除
     * @return 队首元素
     * abstract Object peek();
     */
public Object peek(){
    return isEmpty()?null:queue[0];
}
/**
 * * 检查队列是否为空
 * * @return 如果队列为空则返回true，否则返回false
 * abstract boolean isEmpty();
 * */
public boolean isEmpty(){
    return length==0;
}

    /**
     * 返回队列中的元素个数
     * @return 队列中元素的个数
     *  abstract int size()
     */
public int size(){
    return length;
}


    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
    @Override
    public boolean equals(Object obj ){
    if(obj==null)return false;
    if (this == obj)return true;
    if(obj instanceof queue queues){
        return Arrays.equals(queue, queues.queue) &&
                length == queues.length;
    }
    return false;
    }
}
