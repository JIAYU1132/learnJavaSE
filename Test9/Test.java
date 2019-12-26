import java.util.Scanner;

//根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要的判断的年龄");
        int year = scanner.nextInt();
        if(year < 18){
            System.out.println("属于少年");
        }
        if(year > 19 && year < 28){
            System.out.println("属于青年");
        }
        if(year < 55 && year > 29){
            System.out.println("属于中年");
        }
        if(year > 56){
            System.out.println("属于老年");
        }
    }
}