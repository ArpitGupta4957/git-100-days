import java.util.ArrayList;
import java.util.List;

public class git_82 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int[]count = new int[nums.length+1];
        for(int freq : nums) 
            count[freq]++;

        for( int i =1 ; i <= nums.length ; i++){
            if(count[i] == 2){
                res.add(i);
            }
        }
        return res;  
    }
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = new git_82().findDuplicates(arr);
        System.out.println(result);
    }
}
