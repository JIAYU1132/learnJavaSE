public class Test {
    //给定一个整数数组 nums 和一个目标值 target，
    // 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int cur = 0; cur < nums.length; cur++) {
            for (int prev = cur + 1; prev < nums.length; prev++) {
                if (nums[cur] + nums[prev] == target) {
                    arr[0] = cur;
                    arr[1] = prev;
                    return arr;
            }
        }
       }
       return arr;
    }
}
