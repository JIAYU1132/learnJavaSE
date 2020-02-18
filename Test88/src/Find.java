public class Find {
    public int thirdMax(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max1 =nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max2 && nums[i] < max1) {
                max2 = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max3 && nums[i] < max2) {
                max3 = nums[i];
            }
        }
        return max3;
        }
}
