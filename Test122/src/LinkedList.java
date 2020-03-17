public class LinkedList {
    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        //创建一个新链表
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;
        while (l1 != null && l2 != null) {
            //如果 l1 节点的值小于等于 l2 节点的值,将 l1 节点的值接入新链表,更新 l1;
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                //l2 节点的值小于等于 l1 节点的值,将 l2 节点的值接入新链表,更新 l2;
                prev.next = l2;
                l2 = l2.next;
            }
            //接入一个新节点,更新一次preHead
            prev =prev.next;
        }

        if (l1 == null) {
            prev.next = l2;
        }
        if (l2 == null) {
            prev.next = l1;
        }
        return preHead.next;
    }
}
