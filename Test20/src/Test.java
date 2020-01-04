import java.util.Scanner;

public class Test {
    public static void print(int num) {
        if(num > 9) {
            print(num / 10);
        }
        System.out.print(num % 10  + " ");
    }



    public static void main(String[] args) {
        //输出一个整数的每一位
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        print(num);
    }

}
