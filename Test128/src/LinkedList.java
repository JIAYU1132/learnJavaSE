public class LinkedList {
    //给定一个链表，判断链表中是否有环
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public boolean hasCycle(ListNode head) {
        //先判断链表是否合法
        if (head == null) {
            return false;
        }
        //快慢指针法,创建两个指针,快指针 fast 一次走两步,慢指针 slow 一次走一步,如果相遇,表示有环,否则无环
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
