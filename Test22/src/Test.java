import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
            for(int i = 0; i < 32; i+=2) {
                System.out.print((num >> i) & 1);
            }
        System.out.println();
        for(int i = 1; i < 32; i+=2) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }
}
