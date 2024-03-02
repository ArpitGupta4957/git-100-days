public class git_59 {
    public static int[] sortedSquares(int []nums){
        int left = 0, right = nums.length-1;
        int[] ans = new int[nums.length];
        int i = nums.length -1 , sq= 0;

        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                sq = nums[left] ;
                left++;
            }
            else {
                sq = nums[right];
                right--;
            }
            ans[i--] = sq*sq;
        }
        return ans;
    }public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] ans = sortedSquares(nums);
        for (int j : ans) {
            System.out.println(j);
        }
    }
}
