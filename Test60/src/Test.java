public class Test {
    //给定一个整型数组, 判定数组是否有序
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,10,9};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
