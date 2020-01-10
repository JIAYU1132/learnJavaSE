
class Node {
    //另外一个类,表示一个节点
    public int data;   //数据
    public Node next; //下一个节点的位置

    public Node(int data) {
        this.data = data;
    }
}
public class LinkedList {
    //管理所有的链表节点,只需要记录头结点的位置即可
    private Node head = null;
    //初始情况下 head 为 null ,此刻表示空链表(不带傀儡节点)

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
}
