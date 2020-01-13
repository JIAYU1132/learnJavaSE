class Node {
    public int data;
    public Node next = null;
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

    //将一个链表中元素都打印出来
    public void display() {
        //把链表中的每个元素都打印出来
        for(Node cur = head; cur != null; cur = cur.next)
            System.out.print(cur.data + " ");
    }

    //删除链表中值为 toRemove 的节点
    public void removeAll(int toRemove) {
        //1.先删除非头结点,需要找到待删除节点的前一个位置
        Node prev = head;
        Node cur = head.next;
        //prev 始终指向 cur 的前一个位置
        while (cur != null) {
            if(cur.data == toRemove) {
                //cur节点需要被删掉
                prev.next = cur.next;//cur所指的节点直接被跳过
                cur = prev.next;//继续判断删除后面的节点
            } else  {
                //没找到, prev 和 cur 同步往后移动
                prev = cur;
                cur = cur.next;
            }
        }
        //2.处理头结点为要删除的节点
        if(head.data == toRemove) {
            head = head.next;
        }
    }
    }

