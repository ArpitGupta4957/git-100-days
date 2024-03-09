import java.util.HashSet;
import java.util.Set;

public class git_66 {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        git_66 g =new git_66();
        System.out.println(g.getCommon(new int[]{4,5,1},new int[]{1,2,4}));

    }
}
