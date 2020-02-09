public class Test {
    //给定一个数组 nums 和一个值 val ，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
    public int removeElement(int[] nums, int val) {
        int cur = 0;
        for (int prev = 0; prev < nums.length; prev++) {
            if (nums[prev] != val) {
                nums[cur++] = nums[prev];
            }
        }
        return cur;
    }
}
