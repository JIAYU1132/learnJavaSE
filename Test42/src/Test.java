public class Test {
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    public static void main(String[] args) {
        //比较两个数组中的元素
        int[] arr ={1,2,4,3,5,6,8,7,9};
        int cur = 0;
        int temp = 0;
        int prev = cur + 1;
        while (prev < arr.length) {
            //1.如果 cur 指的数是奇数,cur 和 prev 直接后移一位
            if (arr[cur] % 2 != 0) {
                cur++;
                prev++;
            }
            //2.如果 cur 指的数是偶数
            if (arr[cur] % 2 == 0) {
                //a)如果此时 prev 指的是奇数,直接交换
                //b)如果此时 prev 指的是偶数, prev 后移一位继续判断是奇数还是偶数,循环上述操作
                if (arr[prev] % 2 == 0) {
                    prev++;
                }
                if (arr[prev] % 2 != 0) {
                    temp = arr[cur];
                    arr[cur] = arr[prev];
                    arr[prev] = temp;
                    cur++;
                    prev++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
