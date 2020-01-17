import java.util.Scanner;

public class Test {
    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //​ 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要比较的三个数");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println(max3(num1,num2,num3));

    }

    private static int max3(int num1,int num2,int num3) {
        int tem = max2(num1, num2);
        int max = 0;
        if (num3 > tem) {
            max = num3;
        } else {
            max = tem;
        }
        return max;
    }

    private static int max2(int num1, int num2) {
        int max = 0;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }
}
