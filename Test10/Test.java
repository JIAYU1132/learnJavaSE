public class Test{
    public static void main(String[] args) {
        //打印 1 - 100 之间所有的素数
      for(int i = 2; i <= 100; i++){
          int j = 2;
          while(i % j != 0){
              j++;
          }
          if(i == j){
             System.out.println("素数为" + i);
          }
            }
         }
    }
