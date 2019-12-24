import java.util.Scanner;
public class Test{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查询的天数");
        int day = scanner.nextInt();
        switch(day){
            case 1 :
            System.out.println("星期一");
            break;
            case 2 :
            System.out.println("星期二");
            break;
            case 3 :
            System.out.println("星期三");
            break;
            case 4 :
            System.out.println("星期四");
            break;
            case 5 :
            System.out.println("星期五");
            break;
            case 6 :
            System.out.println("星期六");
            break;
            case 7 :
            System.out.println("星期天");
            break;
            default:
            System.out.println("您的输入有误");
            break;
        }

    }
}