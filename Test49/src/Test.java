import java.util.Scanner;

public class Test {
    //递归求 N 的阶乘
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入N");
        int N = scanner.nextInt();
        System.out.println(mul(N));
    }

    private  static int mul(int N) {
        if (N == 1) {
            return 1;
        }
        return N * mul(N - 1);
    }
}
