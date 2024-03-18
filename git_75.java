import java.util.Arrays;
import java.util.Comparator;

public class git_75 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a->a[0]));
        int count = 1;
        int[] arr = points[0];

        for(int i=1;i<points.length;i++){
            int strtP = points[i][0];
            int endP = points[i][1];

            int prevS = arr[0];
            int prevE = arr[1];

            if(strtP>prevE){// no overlap
                count++;
                arr = points[i];
            }
            else { // overlap
                arr[0] = Math.max(strtP, prevS);
                arr[1] = Math.min(endP, prevE);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(new git_75().findMinArrowShots(points));
    }
}
