public class BestTimeToBuyAndSellStockMain {

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockSolution solution = new BestTimeToBuyAndSellStockSolution();

        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 6, 4, 3, 1};

        System.out.println(solution.maxProfit(prices1));
        System.out.println(solution.maxProfit(prices2));
    }
}
