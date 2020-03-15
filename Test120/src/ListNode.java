public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  //已知此链表是一个整数数字的二进制表示形式。
  //请你返回该链表所表示数字的 十进制值 。

    class Solution {
        public int getDecimalValue(ListNode head) {
            int sum = 0;
            while (head != null) {
                sum = (sum << 1) + head.val;
                head = head.next;
            }
            return sum;
        }
    }

