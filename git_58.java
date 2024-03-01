public class git_58 {
    String num = "";
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        if(n == 1){
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append("0");
        }

        int i=0;

        for(char ch : s.toCharArray()){
            if(ch == '1'){
                if(sb.charAt(n-1) == '1'){
                    sb.setCharAt(i, '1');
                    i++;
                }
                else {
                    sb.setCharAt(n-1, '1');
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "101";
        System.out.println(new git_58().maximumOddBinaryNumber(s));
    }
}
