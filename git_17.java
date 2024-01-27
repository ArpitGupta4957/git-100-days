class git_17{
    public static int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = (low + high)/2;
    
            if(nums[mid]==target){
                return mid;
            }
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else {
                if(nums[mid]<target && target<=nums[high]){
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {3,1};
        int target = 1;
        int ans = search(nums, target);
        System.out.println(ans);
    }
}