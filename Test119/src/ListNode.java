public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  //以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。

    class Solution {
        public void deleteNode(ListNode node) {
            //把 node 的值用下一个节点的值覆盖,然后删掉下一个节点即可
            node.val = node .next.val;
            node.next = node.next.next;
            }
        }
    }

