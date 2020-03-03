import java.util.Arrays;

public class ArrayList {
    //给定一个整数数组和一个整数 k, 你需要在数组里找到不同的 k-diff 数对。
    // 这里将 k-diff 数对定义为一个整数对 (i, j), 其中 i 和 j 都是数组中的数字，且两数之差的绝对值是 k.
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i -1]) continue;
            for(int j = i +1 ; j < nums.length; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    sum ++;
                    break;
                }
            }
        }
        return sum;
    }

}
