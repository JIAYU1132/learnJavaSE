public class Test {
    //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
    //每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
    public int climbStairs(int n) {
        //第 n 个台阶只能从第 n-1 或者 n-2 个上,即到第 n-1 个台阶的走法 + 第n-2个台阶的走法 = 到第n个台阶的走法
        // 已经知道了第1个和第2个台阶的走法，一路加上去
        //类似于斐波那契数列
        if (n <= 2) {
            return n;
        }
        int i1 = 1;
        int i2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = i1 + i2;
            i1 = i2;
            i2 = temp;
        }
        return i2;
    }
}
