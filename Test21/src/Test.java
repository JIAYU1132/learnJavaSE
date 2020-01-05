import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，
        // 提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
        int keyNumber = 2345;
        judge(keyNumber);
    }


        public static void judge(int keyNumber) {
            System.out.println("请输入密码");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            for (int i = 0; i < 2; i++) {

                if (keyNumber == num) {
                    System.out.println("登陆成功");
                    return;
                } else {
                    System.out.println("登陆失败,请重新输入");
                    num = scanner.nextInt();
                }
            }
            System.out.println("错误超过三次,退出程序");
        }
    }


