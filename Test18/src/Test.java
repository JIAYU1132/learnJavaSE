import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        //完成猜数字游戏
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入100以内您猜的数字");
        int toGuess = random.nextInt(100);
        while(true) {
            int num = scanner.nextInt();
            if (num < toGuess) {
                System.out.println("猜低了");
            } else if (num > toGuess) {
                System.out.println("猜高了");
            } else {
                System.out.printf("猜对了");
                break;
            }
        }
    }
}
