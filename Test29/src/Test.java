public class Test {
    private static  void testAddIndex() {
        LinkedList linkedList = new LinkedList();
        linkedList.addIndex(0,1);
        linkedList.addIndex(1,2);
        linkedList.addIndex(1,3);
        linkedList.addIndex(1,4);
        linkedList.display();
    }

    public static void main(String[] args) {
        testAddIndex();
    }
}
