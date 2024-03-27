public class git_84 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(nums.length == 0 || k==0){
            return 0;
        }

        int count = 0, prod = 1;
        int left = 0, right = 0;

        while(right<nums.length){
            prod *= nums[right];

            while(prod>=k){
                prod /= nums[left];
                left++;
            }

            count += (right - left) + 1 ;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        System.out.println(numSubarrayProductLessThanK(nums,k));
    }
}
