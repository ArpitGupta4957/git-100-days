import java.util.ArrayList;
import java.util.List;

public class git_74 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int i = 0;
        while(i<intervals.length){
            if(intervals[i][1]<newInterval[0]){
                result.add(intervals[i]);
            }
            else if(intervals[i][0]>newInterval[1]){
                break;
            }
            else {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
            i++;
        }

        result.add(newInterval);
        while(i<intervals.length){
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};
        int[][] result = new git_74().insert(intervals, newInterval);
        for (int[] interval : result) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}
