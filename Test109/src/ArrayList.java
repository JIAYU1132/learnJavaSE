import java.util.Arrays;

public class ArrayList {
    //给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，
    // 使得从1 到 n 的 min(ai, bi) 总和最大
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0 ;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

}
