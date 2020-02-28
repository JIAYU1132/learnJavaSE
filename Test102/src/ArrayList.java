public class ArrayList {
    //给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
    //函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
    public int[] twoSum(int[] numbers, int target) {
        int sum = 0;
        int[] arr = new int[2];
        for (int cur = 0; cur < numbers.length - 1; cur++) {
            for (int prev = cur + 1; prev < numbers.length; prev++) {
                sum = numbers[cur] + numbers[prev];
                if (sum == target) {
                    arr[0] = cur;
                    arr[1] = prev;
                }
            }
        }
        return arr;
    }
}
