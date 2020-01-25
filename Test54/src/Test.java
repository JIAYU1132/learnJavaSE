import java.util.Scanner;
//递归实现代码: 青蛙跳台阶问题
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入台阶数n");
        int n = scanner.nextInt();
        System.out.println(jumpFloor(n));
    }

    private static int jumpFloor(int num) {
        //1.有一个或者两个台阶
        if (num == 1 ||num == 2) {
            return num;
        }  //2.有n个台阶,有 n - 1 + n - 2 种跳法
            //当青蛙第一次跳一个台阶时,剩下 n - 1 个台阶有 n - 1 种跳法
            //当青蛙第一次跳两个台阶时,剩下 n - 2 个台阶有 n - 2 种跳法
         else {
            return jumpFloor(num - 1) + jumpFloor(num - 2);
        }
    }

}
