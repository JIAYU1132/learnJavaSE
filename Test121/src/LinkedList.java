public class LinkedList {
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode partition(ListNode pHead, int x) {
        //链表为空或者链表只有一个节点
        if (pHead == null && pHead.next == null) {
            return null;
        }
        //新建两个链表,分部存放大于等于 x 的节点和小于 x 的节点
        ListNode big = new ListNode(-1);
        ListNode small = new ListNode(-1);
        ListNode bigHead = big;
        ListNode smallHead = small;
        ListNode cur = pHead;
        while (cur != null) {
            if (cur.val < x) {
                small.next = cur;
                small = small.next;
            } else {
                big.next = cur;
                big = big.next;
            }
            cur = cur.next;
        }
        small.next = bigHead.next;
        big.next = null;
        return smallHead.next;
    }
}
