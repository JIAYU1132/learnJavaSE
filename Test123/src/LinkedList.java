public class LinkedList {
    //输入一个链表，输出该链表中倒数第k个结点
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        //求出链表长度 size,倒数第 k 个节点就是移动 size - k 个节点
        int size = getSize(head);
        if (head == null) {
            return null;
        }
        if (k <= 0 || k > size) {
            return null;
        }
        ListNode prev = head;
        for (int i = 0; i < size - k; i++) {
            prev = prev.next;
        }
        return prev;
    }

    public int getSize(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
}
