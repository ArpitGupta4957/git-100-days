import java.util.Stack;

public class git_18 {
    private static int[] getNSL(int [] arr, int n){
        int [] result = new int [n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            
            st.push(i);
        }
        return result;
    }
    private static int[] getNSR(int [] arr, int n){
        int [] result = new int [n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            result[i] = st.isEmpty() ? n : st.peek();
            
            st.push(i);
        }
        return result;
    }
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        if(n==0){
            return 0;
        }
        int [] NSL = getNSL(arr, n);
        int [] NSR = getNSR(arr, n);

        long sum =0;
        int max_ans = 1000000007;   

        for(int i=0;i<n;i++){
            long ls = i - NSL[i];
            long rs = NSR[i] - i;

            long total_ways = ls*rs;
            long total_sum = arr[i] * total_ways;

            sum = ((sum + total_sum) % max_ans);
        }
        return (int)sum;
    }
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
}
