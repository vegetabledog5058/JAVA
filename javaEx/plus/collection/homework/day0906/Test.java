package javaEx.plus.collection.homework.day0906;

import java.util.Random;


/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/7 0:08
 * @desciption:
 */
public class Test {


    public static void main(String[] args) {
        int numberOfLists = 5; // 设置数组中链表的数量
        ListNode[] lists = new ListNode[numberOfLists];
        Random random = new Random();

        for (int i = 0; i < numberOfLists; i++) {
            int listLength = random.nextInt(10) + 1; // 生成1到10之间的随机数作为链表长度
            ListNode dummy = new ListNode(-1); // 创建一个虚拟头节点
            ListNode current = dummy;

            for (int j = 0; j < listLength; j++) {
                int value = random.nextInt(10) + 1; // 生成1到10之间的随机数作为节点值
                current.next = new ListNode(value);
                current = current.next;
            }

            lists[i] = dummy.next; // 将链表头节点添加到数组中
        }

        // 打印数组中的链表
        for (int i = 0; i < numberOfLists; i++) {
            ListNode current = lists[i];
            System.out.print("List " + (i + 1) + ": ");
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
        ListNode listNode = mergeKLists(lists);
        int count=0;
        while (listNode!=null){
            count++;
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
        System.out.println(count);

    }
    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode head = lists[0];
        for (int i = 0; i < lists.length - 1; i++) {
            while (lists[i].next != null) {
                lists[i] = lists[i].next;
            }
            lists[i].next = lists[i + 1];
        }
        return head;
    }

}


class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
