import java.util.Arrays;

public class ArrayList {
    // 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
    //你可以假设数组是非空的，并且给定的数组总是存在多数元素。

    ////1.暴力
    public int majorityElement(int[] nums) {
        int num = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            //在第二重循环里面找相同饿元素,并计数
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    //如果 count 满足条件,返回这个元素即可
                    if (count > num) {
                        return nums[i];
                    }
                }
            }
        }
        return -1;
    }

    // //2.排序
    public int majorityElement2(int[] nums) {
        Arrays.sort(nums);
        //排序后在 n/2 处一定是多数元素
        return nums[nums.length / 2];
    }
}
