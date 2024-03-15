public class git_72 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int runningProduct = 1;
    
        // Calculate left product
        for (int i = 0; i < nums.length; i++) {
            result[i] = runningProduct;
            runningProduct *= nums[i];
        }
    
        runningProduct = 1;
    
        // Calculate right product and update result array
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= runningProduct;
            runningProduct *= nums[i];
        }
    
        return result;
    }
    public static void main(String[] args) {

        int []nums = {1,2,3,4};
        int []arr = new git_72().productExceptSelf(nums);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
