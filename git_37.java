import java.util.HashMap;
import java.util.Map;

public class git_37 {
    public static Map<Integer, Integer> map;
    public static int numSquares(int n){
        if(map==null) map=new HashMap<>();
        if(n==0) return 0;
        if(map.containsKey(n)) return map.get(n);

        int ans=Integer.MAX_VALUE -1 ;
        for(int i=1;i<=Math.sqrt(n);i++){
            int square = i*i;
            if(i<=n){
                ans = Math.min(ans,numSquares(n-square)+1);
            }
        }
        map.put(n,ans);
        return ans;
    }
    public static void main(String[] args) {
        int n=12;
        System.out.println(numSquares(n));
    }
}
