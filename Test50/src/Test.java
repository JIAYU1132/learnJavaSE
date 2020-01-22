public class Test {
    public static void main(String[] args) {
        //递归求 1 + 2 + 3 + ... + 10
        System.out.println(sum(10));
    }

    private static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }
}
