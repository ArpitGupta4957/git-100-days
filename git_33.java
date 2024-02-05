import java.util.HashMap;
import java.util.Map;

public class git_33 {

    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 ||
                s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> hm = new HashMap<>();
        int count = t.length();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, startIndex = 0;
    
        for (char c : t.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }

        char[] chS = s.toCharArray();

        while (end < chS.length) {
            if (hm.get(end) > 0) {
                count--;
            }
            while (count == 0) {
                if (end - start < minLen) {
                    startIndex = start;
                    minLen = end - start;
                }
                if (hm.get(start) == 0) {
                    count++;
                }
                start++;
            }
            end++;
        }

        return minLen == Integer.MAX_VALUE ? new String() :
                new String(chS, startIndex, minLen);
    }

    public static void main(String[] args) {
        String s = "aa";
        String t = "aa";
        System.out.println(findSubstring(s, t)); // Output: "aa"
    }
}