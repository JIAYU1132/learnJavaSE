import java.util.Scanner;

public class Test {
    //求 N 的阶乘 。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入N");
        int N = scanner.nextInt();
        int num = 0;
        int mul = 1;
        for (int i = 1; i <= N; i++) {
            mul *= i;
        }
        System.out.println(mul);
    }
}
