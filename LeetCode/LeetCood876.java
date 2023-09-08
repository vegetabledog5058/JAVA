package LeetCode;


import object.oriented.kfm.Filmv2_0.List;

/**
 * @author SiYi
 * @version 1.0
 * @date 2023/9/8 11:54
 * @desciption:
 */
public class LeetCood876 {
    public static void main(String[] args) {
        ListNode head5 = new ListNode(6);
        ListNode head1 = new ListNode(5,head5);
        ListNode head2 = new ListNode(4,head1);
        ListNode head3 = new ListNode(3,head2);
        ListNode head4 = new ListNode(2,head3);
        ListNode head = new ListNode(1,head4);


        System.out.println(middleNode(head).val);
    }
    static class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int x,ListNode next) {
            val = x;
            this.next = next;
        }
    }
    public static ListNode middleNode(ListNode head) {

        ListNode fast =head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
