public class LinkedList {
    //请判断一个链表是否为回文链表
    class ListNode {
        int val;
        ListNode next;
==
        ListNode(int x) {
            val = x;
        }
    }
    public boolean isPalindrome(ListNode head) {
        //判断回文结构即判断链表逆置后的后半段和前半段是否相同
        //先求出链表长度 size ,然后算出中间节点 steps
        int size = getSize(head);
        int steps = size / 2;
        ListNode B = head;
        for (int i = 0; i < steps; i++) {
            B = B.next;
        }
        ListNode pos = null;
        ListNode cur = B;
        //此时 cur 指向中间节点,逆置后半段
        while(cur != null) {
            ListNode next = cur.next;
            if (cur.next == null) {
                //更新头结点
                B = cur;
            }
            cur.next = pos;
            pos = cur;
            cur = next;
        }
        //此时 cur 指向逆置后的链表的最后节点,接下来判断即可
        //如果链表个数为奇数个,此时无影响
        //如果链表个数为偶数个,此时前半段比后半段多一个节点,此时需要注意结束条件,要以后半段为基准
        ListNode A = head;
        while (B != null) {
            if (A.val != B.val) {
                return false;
            }
            A = A.next;
            B = B.next;
        }
        return true;
    }

    private int getSize(ListNode pos) {
        int size = 0;
        while (pos != null) {
            size++;
            pos = pos.next;
        }
        return size;
    }
}
