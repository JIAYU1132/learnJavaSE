import java.util.Scanner;

public class Test {
    //求1！+2！+3！+4！+........+n!的和
    public static void main(String[] args) {
        int mul = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入n");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            mul *= i;
            sum += mul;
        }
        System.out.println(sum);
    }
}
