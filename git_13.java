import java.util.*;

public class git_13 {
    public static List<List<Integer>> findWinners(int[][] matches) {
        int [] losses = new int[100001];
        for(int i=0;i<matches.length;i++){
            int win = matches[i][0];
            int loss = matches[i][1];

            if(losses[win]==0){
                losses[win]=-1;
            }
            if(losses[loss]==-1){
                losses[loss]=1;
            }
            else {
                losses[loss]++;
            }
        }
        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<losses.length;i++){
            if(losses[i]==-1){
                zeroLoss.add(i);
            }
            else if(losses[i]==1){
                oneLoss.add(i);
            }
        }
        result.add(zeroLoss);
        result.add(oneLoss);
        return result;
    }
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        System.out.println(findWinners(matches));
    }
}
