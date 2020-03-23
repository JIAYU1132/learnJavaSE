public class LinkedList {
    //输入两个链表，找出它们的第一个公共结点
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //两个节点相同,即为公共节点
        //如果两个链表长度不相同,
        int sizeA = getSize(headA);
        int sizeB = getSize(headB);
        int steps = 0;
        ListNode pos1 = headA;
        ListNode pos2 = headB;
        //判断两个链表长度
        //让长的链表先走 steps = sizeA - sizeB 步
        if (sizeA > sizeB) {
            steps = sizeA - sizeB;
            for (int i = 0; i < steps; i++) {
                pos1 = pos1.next;
            }
        } else {
            steps = sizeB - sizeA;
            for (int i = 0; i < steps; i++) {
                pos2 = pos2.next;
            }
        }
        //此时 pos1 和 pos2 所指的位置是相同的,进行判断即可
        while (pos1 != null) {
            if (pos1 == pos2) {
                return pos1;
            }
            pos1 = pos1.next;
            pos2 = pos2.next;
        }
        return null;
    }

    private int getSize(ListNode head) {
        int size = 0;
        ListNode pos = head;

        while (pos != null) {
            size++;
            pos = pos.next;
        }
        return size;
    }
}
