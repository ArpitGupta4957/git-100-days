
public class git_44 {
    public int maxProfit(int[] prices) {
        int minPrice1 = Integer.MAX_VALUE, minPrice2 = Integer.MAX_VALUE;
        int profit1 = 0, profit2 = 0;

        for(int price: prices) {
            minPrice1 = Math.min(minPrice1, price);
            profit1 = Math.max(profit1, price - minPrice1);

            minPrice2 = Math.min(minPrice2, price - profit1);
            profit2 = Math.max(profit2, price - minPrice2);
        }
        return profit2;
    }
    public static void main(String[] args) {
        git_44 g = new git_44();
        int[] prices = {3,3,5,0,0,3,1,4};
        System.out.println(g.maxProfit(prices));
    }
}
