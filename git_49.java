public class git_49 {
    public static int RangeBitwiseAnd(int left, int right){
        int c=0;
        while(left!=right){
            left/=2;
            right/=2;

            c++;
        }
        return left<<2;
    }
    public static void main(String[] args) {
        System.out.println("Range Bitwise And of 5 and 7 is " + RangeBitwiseAnd(5,7)); 
    }
}
