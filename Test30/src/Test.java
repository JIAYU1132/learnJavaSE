public class Test {
    private static void testcontains() {
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        System.out.println(linkedList.contains(2));
        //在尾插法插入的元素中找 2
    }

    public static void main (String[] args) {
        testcontains();
    }
}
