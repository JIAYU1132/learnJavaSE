import java.util.Scanner;

public class Test {
    //求斐波那契数列的第n项。(迭代实现)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入n");
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return sum(n - 2) + sum(n - 1);
        }
    }
}
