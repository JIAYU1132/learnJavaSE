public class Test {
    //给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur = m - 1;//cur 指向 num1 数组中最后一位有效数字
        int prev = n - 1;//prev 指向 num2 数组中最后一位有效数字
        int p =  m + n - 1;//p 指向合并后 num1 数组的最后一位有效数字
        while((cur >= 0) && (prev >= 0)) {
            nums1[p--] = nums1[cur] < nums2[prev] ? nums2[prev--] : nums1[cur--];
        }
        System.arraycopy(nums2,0,nums1,0,prev + 1);
    }

}
