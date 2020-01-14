public class Test {
    public static void main(String[] args) {
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(0,2);
        seqList.add(0,3);
        seqList.add(0,4);
        seqList.display();
        System.out.println(seqList.search(2));

    }
}
