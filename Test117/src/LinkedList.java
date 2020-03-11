public class LinkedList {
    //给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次
    public ListNode deleteDuplicates(ListNode head) {
        ListNode listNode = head;
        while (listNode != null && listNode.next != null) {
            if (listNode.val == listNode.next.val) {
                listNode.next = listNode.next.next;
            } else {
                listNode = listNode.next;
            }
        }
        return head;
    }
}
