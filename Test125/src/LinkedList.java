public class LinkedList {
    //反转链表
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        //先判断不合法情况
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        //处理一般情况
        ListNode cur = head;
        ListNode pos = head;
        ListNode prev = null;
        while (cur != null) {
            pos = cur.next;
            cur.next = prev;
            prev = cur;
            cur = pos;
        }
        return head;
    }
}
