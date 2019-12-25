import java.util.Scanner;
public class Test{
    public static void main (String[] args){
        //判定一个数字是否是素数
        Scanner scanner = new Scanner (System.in);
        System.out.println("请输入要判断的数");
        int num = scanner.nextInt();
        if(num == 1 || num == 2){
            System.out.println("是素数");
        } else {
            int i = 2;
            while(i < num){
                if(num % i == 0){
                    System.out.println("不是素数");
                    break;
                }
                i++;
            }
                if(num == i){
                    System.out.println("是素数");
                }
             } 
             
            
            }
        }
