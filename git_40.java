import java.util.Arrays;

public class git_40 {
    public class MajorityElement {
        public int majorityElement(int[] nums) {
            int n = nums.length/2;
            
            Arrays.sort(nums);
            for(int i=0;i<=n;i++){
                if(nums[i] == nums[n]){
                    return nums[i];
                }
            }
            return 0;
        }
    }
}
