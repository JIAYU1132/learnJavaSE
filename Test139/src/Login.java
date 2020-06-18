import java.util.Scanner;

public class Login {
    //实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码.
    // 如果用户名密码出错, 使用自定义异常的方式来处理
        private static String name = "yjy";
        private static String password = "123456";

    public static void main(String[] args) throws PasswordException, NameException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名: ");
        String name = scanner.next();
        System.out.println("请输入密码: ");
        String password = scanner.next();
        login(name,password);
    }

    public static void login(String name, String password) throws PasswordException, NameException {
            if (!Login.name.equals(name)) {
                throw new NameException("用户名错误");
            }
            if (!Login.password.equals(password)) {
                throw new PasswordException("密码错误");
            }
        System.out.println("登陆成功!");
    }
}
