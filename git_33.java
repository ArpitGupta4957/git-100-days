import java.util.HashMap;
import java.util.Map;

public class git_33 {

    public static String findSubstring(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        int count=0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) + 1);
        }
    
        int start = 0, end = 0;
        while (end < s.length()) {
            if (hm.get(s.charAt(end)) > 0) {
                count++;
            } 
            while (count == t.length()) {
                if (minLen > end - start + 1) {
                    minLen = end - start + 1;
                    startIndex = start;
                }
                if (hm.get(s.charAt(start)) > 0) {
                    count--;
                }
                start++;
            }
            end++;
        }
    
        return minLen == Integer.MAX_VALUE ? new String() : new String(s.toCharArray(), startIndex, minLen);
    }

    public static void main(String[] args) {
        String s = "abcughbghca";
        String t = "abc";
        System.out.println(findSubstring(s, t)); // Output: "aa"
    }
}