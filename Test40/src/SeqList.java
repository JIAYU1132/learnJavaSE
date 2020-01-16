public class SeqList {
    private int[] datas = new int[100];
    private int size = 0;

    public void add(int pos, int data) {
        if (pos < 0 || pos > size) {
            return;
        }
        if (size > datas.length) {
            int[] newDatas = new int[2 * datas.length];
            for (int i = 0; i < datas.length; i++) {
                newDatas[i] = datas[i];
            }
            datas = newDatas;
        }
        if(pos == size) {
            datas[pos] = data;
            size++;
            return;
        }
        for (int i = size - 1; i >= pos; i--) {
            datas[i + 1] = datas[i];
        }
        datas[pos] = data;
        size++;
        return;
    }

    public void display() {
        String result = "[";
        for (int i = 0; i < size; i++) {
           result += datas[i];
           if (i < size - 1) {
               result += ",";
           }
        }
        result += "]";
        System.out.println(result);
    }

    public void clear() {
        size = 0;
    }
}
