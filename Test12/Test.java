public class Test {
    public static void main(String[] args) {
        //1到 100 的所有整数中出现多少个数字9
        int num = 0;
        for(int i = 1; i <= 100; i++) {
            if(i % 10 == 9) {
                num += 1;
            }
        }
        System.out.println("9的个数为:" + num);
    }

}