import java.util.Arrays;

public class git_60 {
    public int maxProfit(int k, int[] prices) {
        return solveTab(k , prices);
    }

    private int solveTab(int k, int[] prices){
        int n = prices.length;
        int[] curr = new int[2*k + 1];
        int[] next = new int[2*k + 1];
        Arrays.fill(curr, 0);
        Arrays.fill(next, 0);

        for(int idx = n-1;idx>=0;idx--){
            for(int operationNo = 0; operationNo<2*k;operationNo++){
                int profit = 0;
                if(operationNo % 2 == 0){
                    int buyKaro = -prices[idx] + next[operationNo + 1];
                    int skipKaro = 0 + next[operationNo];
                    profit = Math.max(buyKaro, skipKaro);
                }
                else {
                    int sellKaro = prices[idx] + next[operationNo + 1];
                    int skipKaro = 0 + next[operationNo];
                    profit = Math.max(sellKaro, skipKaro);
                }
                curr[operationNo] = profit;
            }
            next = curr;
        }
        return next[0];
    }

    public static void main(String[] args) {
        git_60 solution = new git_60();
        int k = 2;
        int[] prices = {3, 2, 6, 5, 0, 3};
        System.out.println(solution.maxProfit(k, prices)); // Output: 7
    }
}
