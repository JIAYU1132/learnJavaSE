public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

     class Solution {
        public ListNode deleteDuplication(ListNode pHead) {
                if (pHead == null || pHead.next == null) {
                    return pHead;
                }
                ListNode head = new ListNode(-1);
                head.next = pHead;
                ListNode pre = head;
                ListNode last = head.next;
                while (last != null) {
                    if (last.next != null && last.val == last.next.val) {
                        while (last.next != null && last.val == last.next.val) {
                            last = last.next;
                        }
                        pre.next = last.next;
                        last = last.next;
                    } else {
                        pre = pre.next;
                        last = last.next;
                    }
                }
                return head.next;
        }
    }

