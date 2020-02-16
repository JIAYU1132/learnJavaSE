public class Test {
    //给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while(left < right) {
            //left 所指的元素为偶数
            while(left < right && A[left] % 2 == 0) {
                left++;
            }
            //right 所指元素为奇数
            while (left < right && A[right] % 2 != 0) {
                right--;
            }
            int tmp = A[left];
            A[left] = A[right];
            A[right] = tmp;
            left++;
            right--;
        }
        return A;
    }
}
