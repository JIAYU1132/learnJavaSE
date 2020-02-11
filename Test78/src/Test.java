public class Test {
    //判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    public boolean isPalindrome1(int x) {
       if (x < 0 || x % 10 == 0 && x != 0) {
           return false;
       }
       int temp = 0;
       while(temp < x) {
           temp = x % 10 + temp * 10;
           x /= 10;
       }
       return x == temp || x == temp / 10;//x 有奇数位和偶数位两种情况
    }
}
