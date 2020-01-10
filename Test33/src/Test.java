public class Test {
    private static  void testAddFirst() {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.display();
    }

    public static void main(String[] args) {
        testAddFirst();
    }
}