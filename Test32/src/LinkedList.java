class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }
}
public class LinkedList {
    public ListNode reverseList(ListNode head) {
        //1.空链表
        if (head == null) {
            return null;
        }
        //2.只有一个元素
        if(head.next == null) {
            return head;
        }
        //3.一般情况
        ListNode newHead = null;
        ListNode cur = head;
        ListNode prev = null;
        while (cur != prev) {
            //需要用下一个元素的位置更修改 cur.next
            ListNode next = cur.next;
            if(next == null) {
                //当前 cur 是最后一个节点,是逆置之后的新的头结点
                //作为最终方法的返回值
                newHead = cur;
            }
            //如果 cur 不是最后一个节点,使 cur 的 next 指向它的前一个节点,即 prev
            cur.next = prev;
            //同步更新 prev 和 cur 的位置,准备操作下一个元素
            prev = cur;
            cur = next;
        }
        return newHead;
    }
}
