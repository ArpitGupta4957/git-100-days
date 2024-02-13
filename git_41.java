public class git_41 {
    public String findFirstPalindrome(String[] words) {
        for (String word : words) {
            if (!word.isEmpty() && isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        git_41 palindromeFinder = new git_41();
        String[] testWords = {"level", "racecar", "test"};
        String result = palindromeFinder.findFirstPalindrome(testWords);
        System.out.println("The first palindromic word in the array is: " + result);
    }
}