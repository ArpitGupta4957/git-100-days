import java.util.HashMap;

public class git_73 {
    public static int contArr(int []nums){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }
        int max = 0, sum = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum == 0){
                max = i+1;
            }
            if(hm.containsKey(sum)){
                max = Math.max(max, i-hm.get(sum));
            }else{
                hm.put(sum, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1};
        System.out.println(contArr(nums));
    }
}
