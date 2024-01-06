import java.util.Arrays;

public class git_5 {
        public int[] searchRange(int[] nums, int target) {
            int arr[]=new int[2];
            arr[0]=first(nums,target);
            arr[1]=last(nums,target);
            return arr;
        }
        public int last(int[]nums,int target){
            int low = 0;
            int high =nums.length-1;
            int a=-1;
           
            while(low<=high){
                int mid =low+(high-low)/2;
                if(nums[mid]>target){
                    high=mid-1;
                }
                else if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    a=mid;
                    low=mid+1;
                }
            }
             return a;
        }
        public int first(int[]nums,int target){
            int low = 0;
            int high =nums.length-1;
            int b=-1;
           
            while(low<=high){
                int mid =low+(high-low)/2;
                if(nums[mid]>target){
                    high=mid-1;    
                }
                else if(nums[mid]<target){
                    low=mid+1;
                }    
                else{
                    b=mid;
                    high=mid-1;
                }  
            }
            return b;
        }
        public static void main(String[] args) {
            int[] nums = {5,7,7,8,8,10};
            int target = 8;
            int[] ans = new git_5().searchRange(nums, target);
            System.out.println(Arrays.toString(ans));
        }
    }
    

