class git_6 {
    public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[j]!=nums[i]) {
            j++;
            nums[j]=nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}

