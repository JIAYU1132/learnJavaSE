
public class Test {
    public static void main (String[] args) {
     
        double sum1 = 0.0;
        double sum2 = 0.0;
        double sum = 0.0;
        for(double i = 1; i <= 100; i += 2) {
            sum1 += 1 / i;
        }
        for(double i = 2; i <= 100; i += 2) {
            sum2 += 1 / i;
        }
        sum = sum1 - sum2;
        System.out.println(sum);
    }
}