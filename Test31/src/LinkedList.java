class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {
    private Node head = null;

    //利用尾插法构造一个链表
    public void addLast(int data) {
        //1.根据 data 构造一个 Node 对象
        Node node = new Node(data);
        //2.如果链表为空链表,直接插入
        if(head == null) {
            head = node;
            return;
        }
        //3.如果链表非空,要先找到这个链表末尾的最后一个节点
        Node tail = head;
        while(tail.next != null) {
            tail = tail.next;
        }
        //循环结束后,tail 就对应到最后一个节点了
        tail .next = node;
    }

    //打印链表
    public void display() {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.data + " ");
        }
    }

    public void remove(int toRemove) {
        //1.如果要删除元素是头结点
        if(toRemove == head.data) {
            //要删除的节点石=是头结点
            head = head.next;
            return;
        }
        //2.如果要删除元素不是头结点,找到要删除节点的前一个位置
        Node prev = searchPrev(toRemove);
        //3.修改引用的指向,完成删除(使前一个节点的 next 指向要删除节点的下一个节点)
        //prev.next = prev.next.next;
        Node toDelete = prev.next;
        prev.next = toDelete.next;
    }

    private Node searchPrev(int toRemove) {
        //找到 toRemove 的前一个节点
        for(Node cur = head; cur != null && cur.next != null; cur = cur.next) {
            if(cur.next.data == toRemove) {
                return cur;
            }
        }
        return null;
    }
}
