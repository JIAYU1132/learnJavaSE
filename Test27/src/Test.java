public class Test{
    private static void testRemoveAll() {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.removeAll(2);
        linkedList.display();
    }

    public static void main(String[] args) {
        testRemoveAll();
    }
}