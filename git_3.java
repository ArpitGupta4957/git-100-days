import java.util.HashMap;
import java.util.Map;

public class git_3 {
    public static int minOperations(int[] nums) {
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
            int ans=0;
            for(int it: hm.keySet()){
                if (hm.get(it) == 1) {
                    return -1;
                }
                ans+=Math.ceil((double)hm.get(it)/3);
            }
            return ans;       
        }
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println(minOperations(nums)); // Output: 3
    }
}