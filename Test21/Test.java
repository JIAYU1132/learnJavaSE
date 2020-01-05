import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //输出一个整数的每一位
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        print(num);
    }


    public static int print(int num) {
        if(num < 9) {
            System.out.println(num + " ");
        }
        print(num / 10);
    }
}
