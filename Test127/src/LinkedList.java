public class LinkedList {
    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    //为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode detectCycle(ListNode head){
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (true) {
            //如果 fast 遇到 null,说明链表无环,直接返回 null
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            //如果 fast 遇见 slow ,则表示有环,跳出循环
            if (fast == slow) {
                break;
            }
        }
        //在链表开始再创建一个 cur, cur 和 fast 同时走,遇到的那个节点,就是开始入环的节点
        ListNode cur = head;
        while (cur != fast) {
            cur = cur.next;
            fast = fast.next;
        }
        return fast;
    }
}
