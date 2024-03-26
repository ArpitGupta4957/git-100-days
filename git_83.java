public class git_83 {
    public int firstMissingPositive(int[] nums) {
        boolean[] seen = new boolean[nums.length+1];

        for(int i: nums){
            if(i>0 && i<=nums.length){
                seen[i] = true;
            }
        }

        for(int i=1;i<=nums.length;i++){
            if(!seen[i]){
                return i;
            }
        }

        return nums.length+1;
    }
    public static void main(String[] args) {
        git_83 g = new git_83();
        System.out.println(g.firstMissingPositive(new int[]{4,3,2,-1,7,8,9})); // 1
        System.out.println(g.firstMissingPositive(new int[]{3,4,-1,1}));
    }
}
