import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class git_36 {
    public String frequencySort(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        List<Character> sortedChars = new ArrayList<>(charCount.keySet());
        Collections.sort(sortedChars, (a, b) -> charCount.get(b) - charCount.get(a));

        StringBuilder result = new StringBuilder();
        for (char c : sortedChars) {
            result.append(String.valueOf(c).repeat(charCount.get(c)));
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(new git_36().frequencySort(s));
    }
}
