import java.util.HashMap;

public class git_85 {
    public int maxSubarrayLength(int[] nums, int k) {
        if (k == 0) {
            return 0;
        }
    
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int left = 0, count = 0;
        int maxLength = 0;
    
        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) <= k) {
                count++;
            } else {
                while (freqMap.get(num) > k) {
                    freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                    if (freqMap.get(nums[left]) < k) {
                        count--;
                    }
                    left++;
                }
            }
    
            maxLength = Math.max(maxLength, count);
        }
    
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(new git_85().maxSubarrayLength(nums, k));
    }
}
