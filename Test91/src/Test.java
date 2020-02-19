public class Test {
    //给定一个按照升序排列的整数数组 nums ，和一个目标值 target 。找出给定目标值在数组中的开始位置和结
    //束位置。如果数组中不存在目标值，返回 [-1, -1]
    // [5,7,7,8,8,10], target = 8
    public int[] searchRange(int[] nums, int target) {
        int[] arr= new int[2];
        arr[0] = findFirst(nums, target);
        arr[1] = findLast(nums, target);
        return arr;
    }

    public int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                if (mid == 0 || nums[mid - 1] != target) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    return mid;
                } else {
                    left = mid +  1;
                }
            }
        }
        return -1;
    }
}
