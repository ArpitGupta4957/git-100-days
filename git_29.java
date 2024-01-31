import java.util.ArrayDeque;
import java.util.Deque;

public class git_29 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] arr = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int prevIndex = stack.pop();
                arr[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        git_29 g =new git_29();
        int []arr = {73,74,75,71,69,72,76,73};
        System.out.println(g.dailyTemperatures(arr));

    }
}
