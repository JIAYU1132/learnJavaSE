public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
 class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        //先找到中间节点,然后把后面的链表逆置,和前面的链表比较
       ListNode fast = A;
       ListNode slow = A;
       while (fast != null && fast.next != null) {
           fast = fast.next.next;
           slow = slow.next;
       }
       ListNode mid = slow.next;//中间节点的下一个节点
        slow.next = null;//断连
        ListNode cur = null;
        ListNode prev = null;//标记逆置后的表头
        //逆置
        while (mid != null) {
            prev = mid.next;
            mid.next = cur;
            cur = mid;
            mid = prev;
        }
        //依次比较两个链表
        while (A != null && cur != null) {
            if (A.val != cur.val) {
                return false;
            }
            A = A.next;
            cur = cur.next;
        }
        return true;
    }
}