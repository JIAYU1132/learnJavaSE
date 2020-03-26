public class LinkedList {
    //删除排序链表中的重复元素
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val =x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        //遇见重复元素,用重复元素节点的下一个节点代替重复元素节点即可
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
