public class SeqList {
    private int[] datas = new int[100];
    private int size = 0;

    public int search(int toFind) {
        for (int i = 0; i < size; i++) {
            if (datas[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

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
        if (pos == size) {
            datas[pos] = data;
            size++;
            return;
        }
        for (int i = size - 1; i >= pos; i--) {
            datas[i + 1] = datas[i];
        }
        datas[pos] = data;
        size++;
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

    public void remove(int toRemove) {
        // toRemove 表示要被删除的元素
        //1.先找到 toRemove 对应的下标
        int pos = search(toRemove);
        if (pos == -1) { //没找到
            return;
        }
        //2.如果下标为最后一个元素,直接尾删
        if (pos == size - 1) {
            size--;
            return;
        }
        //3.如果是中间元素,需要先搬运,再删除
        for (int i = pos; i < size - 1; i++) {
            datas[i] = datas[i + 1];
        }
        size--;
        return;
    }
}
