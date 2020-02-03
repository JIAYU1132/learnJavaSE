public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    public class Partition {
        public ListNode partition(ListNode pHead, int x) {
            if (pHead == null || pHead.next == null) {
                return pHead;
            }
            ListNode posMax = new ListNode(1);
            ListNode posMin = new ListNode(0);
            //设置两个头指针指向两个链表的首节点
            ListNode maxHead = posMax;
            ListNode minHead = posMin;
            ListNode curNode = pHead;
            while (curNode != null) {
                if (curNode.val < x) {
                    posMin.next = curNode;
                    posMin = posMin.next;
                } else {
                    posMax.next = curNode;
                    posMax = posMax.next;
                }
                curNode = curNode.next;
            }
            //posMin 链表的最后一个节点指向 posMax 链表的第一个节点
            posMin.next = maxHead.next;
            //posMax 链表的最后一个节点指向空指针
            posMax.next = null;
            return minHead.next;
        }
        }


