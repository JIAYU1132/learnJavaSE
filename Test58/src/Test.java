public class Test {
    //给定一个有序整型数组, 实现二分查找
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(arr,2));
    }

    private static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > toFind) {
                //找大了
                right = mid - 1;
            } else if (arr[mid] < toFind) {
                //找小了
                left = mid + 1;
            } else {
                //找到了
                return mid;
            }
        }
        return -1;
    }
}
