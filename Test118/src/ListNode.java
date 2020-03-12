public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  //请判断一个链表是否为回文链表

    class Solution {
        public boolean isPalindrome(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            ListNode pre = null;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                //slow 有两个作用,一个是找到中点,一个是翻转链表
                ListNode temp = slow.next;
                slow.next = pre;
                pre = slow;
                slow = temp;
            }
                if (fast != null) {
                    slow = slow.next;
                }
                while (pre != null) {
                    if (pre.val != slow.val) {
                        return false;
                    }
                    pre = pre.next;
                    slow = slow.next;
                }
                return true;
        }
    }
}
