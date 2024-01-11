class git_9{
    class Solution {
        public static int removeElement(int[] nums, int val) {
            int index = 0;
            for(int i = 0; i< nums.length; i++){
                if(nums[i] != val){
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int ans = removeElement(nums, val);
        System.out.println(ans);
    }
    private static int removeElement(int[] nums, int val) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeElement'");
    }
}