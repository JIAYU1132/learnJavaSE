public class LinkedList {
    //删除链表中等于给定值 val 的所有节点
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head.next;
        ListNode prev = head;
        if (head == null) {
            return null;
        }
        //如果头结点是要删除的节点
        if (prev.val == val) {
            return cur;
        }
        //如果删除的是中间节点
        while(cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                cur = cur.next;
                prev = prev.next;
            }
        }
        return head;
    }
}
