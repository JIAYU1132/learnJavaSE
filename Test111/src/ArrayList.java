public class ArrayList {
    //假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上
    // 它们会争夺水源，两者都会死去。
    //给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。
    // 能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //可以种花的条件:
        // 当前位置为 0,且前一位置为 0 或者前一位置下标为 -1,
        // 且后一位置为 0 或者后一位置下标为flowerbed.length
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0
                    && (i - 1 == -1 || flowerbed[i - 1] == 0)
                    && (i + 1 == flowerbed.length || flowerbed[i + 1] == 0)) {
                n--;
                flowerbed[i] = 1;
            }
        }
        return n <= 0;
    }
}
