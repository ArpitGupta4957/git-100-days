public class git_70 {
    public static int pivoteSum(int n){
        final int sum = (n * (n + 1) / 2);
        final int pivot = (int) Math.sqrt(sum);
        // If pivot * pivot is equal to sum (pivot found) return pivot, else return -1
        return pivot * pivot == sum ? pivot : -1;
    }
    public static void main(String[] args) {
        System.out.println(pivoteSum(5));//Expected: 3
    }
    
}
