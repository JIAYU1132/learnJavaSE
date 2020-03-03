public class ArrayList {
    //给定一个二进制数组， 计算其中最大连续1的个数。
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int sumMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum++;
            } else {
                sumMax = Math.max(sum, sumMax);
                sum = 0;
            }
        }
        return sumMax;
    }
}
