public class Test {
    public static void main (String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
        double num = 0.0;
        double n = 1;
        for(double i = 1; i <= 101;i++) {
            num += n / i;
            n = -n;
        }
        System.out.println(num);
    }
}