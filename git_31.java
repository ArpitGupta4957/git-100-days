import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class git_31 {
    public List<Integer> sequentialDigits(int low, int high) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<9;i++){
            queue.offer(i);
        }

        List<Integer> lst = new ArrayList<>();
        while(!queue.isEmpty()){
            int temp = queue.poll();

            if(temp>=low && temp<=high){
                lst.add(temp);
            }

            int last_dig = temp%10;
            if(last_dig+1<=9){
                queue.offer(temp*10 + (last_dig+1));
            }
        }
        return lst;
    }
    public static void main(String[] args) {
        git_31 solution = new git_31();
        System.out.println(solution.sequentialDigits(10, 200));
    }
}

