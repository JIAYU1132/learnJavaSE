public class ArrayList {
    //给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，
    // 并且 i 和 j 的差的绝对值最大为 k。
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int cur = 0; cur < nums.length; cur++) {
            for (int prev = cur + 1; prev < nums.length - 1; prev++) {
                if (nums[cur] == nums[prev] && prev - cur <= k) {
                    return true;
                }
            }
        }
        return false;
    }

}
