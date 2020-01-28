public class Test {
    //给定一个整型数组, 实现冒泡排序(升序排序)
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 9, 2, 4, 5, 6};
        int[] tmp = new int[10];
        tmp = bubbleSort(arr);
        print(tmp);
    }

    private static int[] bubbleSort(int[] arr) {
        int tmp = 0;
        for (int cur = 0; cur < arr.length; cur++) {
            for (int prev = 0; prev < arr.length - 1 - cur; prev++) {
                if (arr[prev] > arr[prev + 1]) {
                    tmp = arr[prev];
                    arr[prev] = arr[prev + 1];
                    arr[prev + 1] = tmp;
                }
            }
        }
        return arr;
    }

    private static void print(int[] tmp) {
        for (int i = 0; i < tmp.length; i++) {
            System.out.print(tmp[i]);
        }
    }
}