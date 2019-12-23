import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        //判断一个数字是奇数还是偶数
        int num = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("请输入要判断的数");
         num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println("是偶数");
        }else{              
            System.out.println("是奇数");
        }

    }
}
