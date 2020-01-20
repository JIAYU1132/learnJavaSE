public class Test {
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 4};
        System.out.println(check(arr));
    }

    private static int check(int[] arr) {

        int ret = 0;
        for (int cur = 0; cur < arr.length; cur++) {
            ret ^= arr[cur];//一个数两次异或同一个数,这个数值不变
        }
        return ret;
    }
}

