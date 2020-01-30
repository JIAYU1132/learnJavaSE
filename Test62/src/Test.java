import java.util.Arrays;

public class Test {
    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,7,8,9};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
