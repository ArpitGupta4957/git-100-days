import java.util.HashMap;
import java.util.Map;

public class git_71 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalSum = 0, count = 0;

        Map<Integer, Integer> hm = new HashMap<>();

        for(int num : nums){
            totalSum += num;

            if(totalSum == goal){
                count++;
            }

            if(hm.containsKey(totalSum - goal)){
                count += hm.get(totalSum - goal);
            }

            hm.put(totalSum, hm.getOrDefault(totalSum, 0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1};
        int goal = 2;
        System.out.println(new git_71().numSubarraysWithSum(nums, goal));
    }
}
