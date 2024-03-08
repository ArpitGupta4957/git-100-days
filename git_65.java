
import java.util.HashMap;
import java.util.Map;

public class git_65 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int maxFrequency = maxFrequencyElements(array);
        System.out.println("Sum of maximum frequency of elements in the array: " + maxFrequency);
    }

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        for (int count : frequencyMap.values()) {
            maxCount = Math.max(maxCount, count);
        }

        int sum = 0;
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == maxCount) {
                sum += maxCount;
            }
        }

        return sum;
    }
}