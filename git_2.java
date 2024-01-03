class git_2 {
    public static int  bank_sec(String [] bank) {
        int ans=0, pop =0;
        for(String s : bank) {
            int coc=0;
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i) == '1') {
                    coc++;
                }
            }
            if(coc > pop) {
                ans+= coc*pop;
                pop = coc;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String [] bank = {"10","0001","111001","1","0"};
        System.out.println(bank_sec(bank));
    }
}