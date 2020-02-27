public class ArrayList {
//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
//注意你不能在买入股票前卖出股票。
//    输入: [7,1,5,3,6,4]
//   输出: 5
//    解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//   注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格
    public int maxProfit1(int[] prices) {
        int maxDiff = 0;
        for (int cur = 0; cur < prices.length - 1; cur++) {
            for (int prev = cur + 1; prev < prices.length; prev++) {
                if (prices[prev] > prices[cur]) {
                    maxDiff = Math.max(maxDiff, prices[prev] - prices[cur]);
                }
            }
        }
        return maxDiff;
    }

    public int maxProfit2(int[] prices) {
        int minDiff = prices[0];
        int maxDiff = 0;
        //1.记录今天之前的最小买入值
        //2.计算今天之前最小值买入,今天卖出可获得的利润
        //3.比较每天的获利
        for (int i = 0; i < prices.length; i++) {
            maxDiff = Math.max(maxDiff, prices[i] - minDiff);
            minDiff = Math.min(minDiff, prices[i]);
        }
        return maxDiff;
    }
}
