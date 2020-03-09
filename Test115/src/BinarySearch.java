public class BinarySearch {
    //计算并返回 x 的平方根，其中 x 是非负整数
    //输入: 4
    //输出: 2
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        long num;
        int left = 2;
        int right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            num = (long) mid * mid;
            if (num > x) {
                right = mid - 1;
            } else if (num < x) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return right;
    }
}
