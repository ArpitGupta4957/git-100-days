import java.util.HashMap;
import java.util.Map;

public class git_30 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        sumCountMap.put(0, 1);
        int result = 0, currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (sumCountMap.containsKey(currentSum - k)) {
                result += sumCountMap.get(currentSum - k);
            }
            sumCountMap.put(currentSum, sumCountMap.getOrDefault(currentSum, 0) + 1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(new git_30().subarraySum(nums, k));
    }
}
