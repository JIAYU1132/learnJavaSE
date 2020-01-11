class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class LinkedList {

    private Node head = null;

    //插入一组元素
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


    public void display() {
        for(Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.data + " ");
        }
    }
    public boolean contains(int toFind) {
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.data == toFind) {
                return true;
            }
        }
        return false;
    }
}

