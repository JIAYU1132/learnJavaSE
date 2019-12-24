import java.util.Scanner;
public class Test{
    public static void main(String[] args){
        //判断闰年
        Scanner scanner = new Scanner (System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        if(year % 100 == 0) {
        //判断世纪闰年 
        if(year % 400 == 0) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }
     } else {
            //判断普通闰年
            if(year % 4 == 0) {
                System.out.println("是闰年");
            } else {
                    System.out.println("不是闰年");
                }
           
        }
       
    }
}