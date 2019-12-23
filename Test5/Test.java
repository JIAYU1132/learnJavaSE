import java.util.Scanner;

public class Test{
    public static void main (String[] args){
        //判断一个数是正数还是负数
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        num = scanner.nextInt();
        if(num > 0){
            System.out.println("是正数");
        }else if(num < 0){
            System.out.println("是负数");
        }else{
            System.out.println("是0");
        }
        
    }
}