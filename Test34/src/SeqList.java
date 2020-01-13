public class SeqList {
    private int[] data = null; //new int[100]
    private int size = 0;

    public SeqList() {
        data = new int[100];
    }

    public void display() {
        //依此打印出每个元素
        //形如: [1,2,3,4]
        String result = "[";
        for(int i = 0; i < size; i++) {
            result += data[i];
            if (i < size - 1) {
                result += ",";
            }
        }
        result += "]";
        System.out.println(result);
    }

}

