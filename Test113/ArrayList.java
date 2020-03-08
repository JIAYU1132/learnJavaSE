class ArrayList {
public double findMaxAverage(int[] nums, int k) {
        int max = 0;
        for (int i = 0; i < nums.length - k + 1; i++) {
          int temp = 0;
          for (int j = 0; j < k; j++) {
              temp += nums[i + j];
          }
          if (i == 0) {
              max = temp;
          } else {
              max = Math.max(temp, max);
          }
        }
    return (double)max / k;
  }
}