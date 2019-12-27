public class Test{
    public static void main(String[] args) {
        //输出 1000 - 2000 之间所有的闰年
        int year =1000;
        for(year=1000; year <= 2000; year++){
        if(year % 100 == 0){
            //判断实际闰年
            if(year % 400 == 0){
                System.out.println("闰年有" + year);
            }

        }else{
              //判断普通闰年
            if(year % 4 == 0){
                System.out.println("闰年有" + year);
            }
        }
        }
    }
}