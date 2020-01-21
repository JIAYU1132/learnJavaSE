public class Test {
    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
    // 还可以求两个小数的最大值，以及两个小数和一个整数的大小关系。
    public static void main(String[] args) {
        int a1 = 1;
        int b1 = 2;
        System.out.println(max(a1, b1));
        double a2 = 1.1;
        double b2 = 2.2;
        System.out.println(max(a2, b2));
        System.out.println(max(a2, b2, b1));
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    private static double max(double a, double b,int c) {
        double temp = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        return temp;
        }
    }

