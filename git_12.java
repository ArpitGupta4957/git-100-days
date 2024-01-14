import java.util.HashMap;
import java.util.Map;

class git_12{
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        int [] w1 = new int[26];
        int [] w2 = new int[26];
        for(char s: word1.toCharArray()){
            w1[s-'a']++;
        }
        for(char s: word2.toCharArray()){
            w2[s-'a']++;
        }
        for(int i=0;i<26;i++){
            if(w1[i]==0 && w2[i]!=0 || w1[i]!=0 && w2[i]==0){
                return false;
            }
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i: w1){
            if(i>0){
                mp.put(i,mp.getOrDefault(i,0)+1);
            }
        }
        for(int i: w2){
            if(i>0){
                if(!mp.containsKey(i)){
                    return false;
                }
                mp.put(i,mp.get(i)-1);
                if(mp.get(i)==0){
                    mp.remove(i);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(closeStrings(word1, word2));
    }
}