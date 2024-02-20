
public class git_48 {
    public int missing(int[] nums) {    
        int n = nums.length;
        int Sum = 0;
        int actualSum = 0;
        for(int i = 0; i <= n;i++) {
            Sum += i;
        }
        for (int num : nums){
            actualSum += num;
        }    
        return Sum-actualSum;
    }
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(new git_48().missing(nums));
    }
}
