public class git_62{
    public int minimumLength(String s) { 
        int l = 0, r = s.length()-1;

        while(l<r && s.charAt(l) == s.charAt(r)){
            char ch = s.charAt(l);
            while(l<r && s.charAt(l) == ch){
                l++;
            }
            while(l<r && s.charAt(r) == ch){
                r--;
            }
        }
        return (l>r) ? 0 : r-l+1;
    }

    
    public static void main(String[] args) {
        git_62 q = new git_62();
        System.out.println(q.minimumLength("aabccabba"));
    }
    
}