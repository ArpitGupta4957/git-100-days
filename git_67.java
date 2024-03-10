import java.util.Arrays;

public class git_67 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        int[] result = new int[Math.min(nums1.length, nums2.length)];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (k == 0 || result[k - 1] != nums1[i]) {
                    result[k++] = nums1[i];
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOfRange(result, 0, k);
    }
    public static void main(String[] args) {
        git_67 g = new git_67();
        System.out.println(Arrays.toString(g.intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }
}