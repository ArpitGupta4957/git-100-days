
public class git_43 {
    public long largestPerimeter(int[] nums) {
        if(nums.length<3){
            return -1;
        }

        int sum= 0;
        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
        }

        for(int i = nums.length-1; i>2;i++){
            sum-=nums[i];
            if(sum>nums[i]){
                sum+=nums[i];
            }
        }
        return sum == 0? -1 : sum;
    }
    public static void main(String[] args) {

        int[] nums = {2,1,2};
        System.out.println(new git_43().largestPerimeter(nums));
    }
}
