import java.util.HashMap;
import java.util.Map;

class git_34{
    public int firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        git_34 g = new git_34();
        System.out.println(g.firstUniqChar("aaaab"));
    }
}