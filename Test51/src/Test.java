import java.util.Scanner;

public class Test {
    //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入n");
        int n = scanner.nextInt();
        print(n);
    }

    private static void print(int n) {
        if (n > 9) {
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }
}
