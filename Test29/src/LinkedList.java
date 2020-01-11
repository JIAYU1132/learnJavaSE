class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedList {
    private Node head = null;

    public int getSize() {
        int size = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    public void addFirst(int data) {
        //1.根据 data 值构建一个链表节点(Node 对象)
        Node node = new Node(data);
        //2.如果链表为空链表
        if(head == null) {
            head = node;
            return;
        }
        //3.如果链表不是空链表
        node.next = head;
        head = node;
    }
    public void display() {
        for(Node cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.data + " ");
        }
    }

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

    private Node getPos(int index) {
        //给定 index 下标,找到对应的节点
        Node cur = head;
        for(int i = 0; i < index; i++) {
            //cur.next 操作之前必须保证 cur 一定是非空的
            cur = cur.next;
        }
        return cur;
    }

    //插入成功,返回 true,否则 返回 false
    public boolean addIndex(int index, int data) {
        int size = getSize();
        //1.判断 index是否有效
        if(index < 0 ||  index > size) {
            //index 无效,插入失败
            return false;
        }
        //2.如果 index 为 0,相当于头插
        if(index == 0) {
            addFirst(data);
            return true;
        }
        //3.如果 index 为 size,相当于尾插
        if (index == size) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        //4.如果 index 是一个中间的位置
        //a)先找到 index 的前一个节点 index - 1
        Node prev = getPos(index - 1);
        //b)把新节点插入到 prev 后
        node.next = prev.next;
        prev.next = node;
        return true;
    }

}
