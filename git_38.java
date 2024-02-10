public class git_38 {
    private int count = 0;
    public int countSubstrings(String s) {
        int n = s.length();
        for(int i=0;i<s.length();i++){
            check(s, i, i, n);
            check(s, i, i+1, n);
        }
        return count;
    }

    public void check(String s, int i, int j, int len){
        while(i>=0 && j<len && s.charAt(i) == s.charAt(j)){
            count++;
            i--;
            j++;
        }
    }
    public static void main(String[] args) {
        git_38 g = new git_38();
        System.out.println(g.countSubstrings("abc"));
    }
}
