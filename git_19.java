class git_19{
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int incl = 0, excl = 0;
        for (int num : nums) {
            int newIncl = excl + num;
            int newExcl = Math.max(incl, excl);
            incl = newIncl;
            excl = newExcl;
        }
        return Math.max(incl, excl);
    }
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(new git_19().rob(nums));
    }
}