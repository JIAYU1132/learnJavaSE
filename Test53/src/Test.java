
public class Test {
    //递归求解汉诺塔问题
    public static void main(String[] args) {
        hanoiTower(3,"x","y","z");
    }

    private static void hanoiTower(int n, String x, String y, String z) {
        if (n == 1) {
            System.out.println(x + "-->" + z);
        } else {
            hanoiTower(n - 1, x, z, y);
            System.out.println(x + "-->" + z);
            hanoiTower(n - 1, y, x, z);
        }

    }
}
