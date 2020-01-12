public class Test {
    private static void testRemove() {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.remove(3);
        linkedList.display();
    }
    public static void main(String[] args) {
        testRemove();
    }
}
