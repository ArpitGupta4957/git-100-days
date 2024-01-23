import java.util.*;

class git_21{
    private boolean hasDuplicate(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        for (char s : s1.toCharArray()) {
            if (set.contains(s)) {
                return true;
            }
            set.add(s);
        }

        for (char s : s2.toCharArray()) {
            if (set.contains(s)) {
                return true;
            }
        }
        return false; // doesn't contain any duplicate
    }

    private int solve(int i, List<String> arr, String currentString, int n) {
        if (i >= n) {
            return currentString.length();
        }
        int exclude = 0, include = 0;

        if (!hasDuplicate(arr.get(i), currentString)) {
            exclude = solve(i + 1, arr, currentString, n);
            include = solve(i + 1, arr, currentString + arr.get(i), n);
        } else {
            exclude = solve(i + 1, arr, currentString, n);
        }

        return Math.max(include, exclude);
    }

    public int maxLength(List<String> arr) {
        if (arr == null || arr.isEmpty()) {
            return 0;
        }

        int n = arr.size();
        int i = 0;
        String currentString = "";

        return solve(i, arr, currentString, n);
    }
    public static void main(String[] args) {
        
    }
    
}