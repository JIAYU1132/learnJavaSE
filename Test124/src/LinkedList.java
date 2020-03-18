public class LinkedList {
    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int x) {
            val = x;
        }
    }
    //数学法
    public ListNode middleNode(ListNode head) {
        //判断非法情况
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        //中间节点即为移动 size / 2 次所指的节点
        int steps = gitSize(head) / 2;
        ListNode prev = head;
        for (int i = 0; i < steps; i++) {
            prev = prev.next;
        }
        return prev;
    }

    private int gitSize (ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    //快慢指针法
    public ListNode middleNode2(ListNode head) {
        //判断非法情况
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        //创建  fast 和 slow 两个指针, fast 指针速度是 slow 的 2 倍,当 fast 访问到尾部时. slow 刚好走到一半
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
