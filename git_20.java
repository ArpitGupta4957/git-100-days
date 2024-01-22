import java.util.HashMap;
import java.util.Map;

class git_20{
    public static int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int missingNum = 0, duplicateNum = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (!countMap.containsKey(i)) {
                missingNum = i;
            } else if (countMap.get(i) == 2) {
                duplicateNum = i;
            }
        }
        return new int[] {duplicateNum, missingNum};
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(findErrorNums(nums));
    }
}