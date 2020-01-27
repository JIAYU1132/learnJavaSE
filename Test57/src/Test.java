public class Test {
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] ret = copyOf(arr);
        for (int i = 0; i < ret.length; i++) {
            System.out.print(ret[i] + " ");
        }
    }

    private static int[] copyOf(int[] arr1) {
        int[] arr2 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        return arr2;
    }
}
