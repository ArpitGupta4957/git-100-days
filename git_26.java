import java.util.HashMap;

public class git_26 {
    public static int numSubmatrixSumTarget(int[][] matrix, int target){
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        int res = 0;
        for(int c1=0;c1<m;c1++){
            for(int c2=c1; c2<m;c2++){
                hm.clear();
                hm.put(0, 1);
                int sum = 0;
                for(int r=0;r<n;r++){
                    sum += c1 == c2 ? matrix[r][c1] : matrix[r][c2] - matrix[r][c1];
                    if(hm.containsKey(sum - target)){
                        res += hm.get(sum - target);
                    }
                    hm.put(sum, hm.getOrDefault(sum, 0)+1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,0},{1,1,1},{0,1,0}};
        int target = 0;
        System.out.println(numSubmatrixSumTarget(matrix, target));
    }
}
