public class Test {
    //给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
    public int reverse(int x) {
        int num = 0;
        while (x != 0) {
            int temp = x % 10;
            x /= 10;
            //判断是否溢出
            if (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE / 10 && temp > 7)) {
                return 0;
            }
            if (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE / 10 && temp < -8)) {
                return 0;
            }
            num = num * 10 + temp;
        }
        return num;
    }
}
