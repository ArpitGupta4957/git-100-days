public class git_47 {
    public static boolean powerOf(int n){
        if(n==0){
            return false;
        }

        if(n==1){
            return true;
        }

        if(n%2!=0){
            return false;
        }
        return powerOf(n/2);
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(powerOf(n));
    }
}
