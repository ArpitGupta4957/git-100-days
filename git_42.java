class git_42{
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pi = 0; // positive index
        int ni = 1; // negative index

        int[] result = new int[n];

        for (int num : nums) {
            if (num > 0) {
                result[pi] = num;
                pi += 2;
            } else {
                result[ni] = num;
                ni += 2;
            }
        }

        return result;
    }
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] result = new git_42().rearrangeArray(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}