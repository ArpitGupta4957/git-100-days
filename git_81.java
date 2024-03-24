
import java.util.HashSet;
import java.util.Set;

class git_81{
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(new git_81().findDuplicate(arr));
    }
}