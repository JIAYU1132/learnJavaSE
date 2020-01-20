public class Test {
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        double c = 2.2;
        double d = 3.3;
        double e = 4.4;
        int ret = (add(a, b));
        double tmp = (add(c, d, e));
        System.out.println(ret + " " + tmp);

    }

    private static int add(int a,int b) {
        return a + b;
    }

    private  static double add(double c, double d, double e) {
        return c + d + e;
    }
}
