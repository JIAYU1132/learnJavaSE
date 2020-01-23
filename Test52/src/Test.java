public class Test {
    //写一个递归方法，输入一个非负整数，返回组成它的数字之和.
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }

    private static int sum(int num) {
        if (num < 10) {
            return num;
        }
        return num % 10 + sum(num / 10);
    }
}
