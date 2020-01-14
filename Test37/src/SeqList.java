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
        // pos 表示新元素要插入的位置(下标)
        // data 表示新元素的值
        //判定 pos 是否是有效值
        //写代码时候要时刻关注参数的有效性
        if (pos < 0 || pos > size) {
            return;
        }
        //扩容,顺序表如果容量不够了,能够自动扩容
        if (size >= datas.length) {
            //需要扩容
            int[] newDatas = new int[2 * datas.length];
            for (int i = 0; i < datas.length; i++) {
                newDatas[i] = datas[i];
            }
            datas = newDatas;
        }
        //1.尾插的情况
        //把新元素放到下标为 size 位置上
        if (pos == size) {
            datas[pos] = data;
            size++;
            return;
        }
        //2.普通位置插入
        for(int i = size - 1;i >= pos; i--) {
            datas[i + 1] = datas[i];
        }
        datas[pos] = data;
        size++;
    }

    public void display() {
        //依此打印出每个元素
        //形如: [1,2,3,4]
        String result = "[";
        for(int i = 0; i < size; i++) {
            result += datas[i];
            if (i < size - 1) {
                result += ",";
            }
        }
        result += "]";
        System.out.println(result);
    }

}
