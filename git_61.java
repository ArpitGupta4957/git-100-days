import java.util.Arrays;

public class git_61 {

    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s = 0;
        int maxi = 0;
        int l = 0, r = tokens.length - 1;

        while (l <= r) {
            if (power >= tokens[l]) {
                power -= tokens[l];
                s++;
                l++;
                maxi = Math.max(maxi, s);
            } else if (s > 0) {
                power += tokens[r];
                s--;
                r--;
                maxi = Math.max(maxi, s);
            } else {
                return maxi;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        git_61 tokenScore = new git_61();
        int[] tokens = {200, 100};
        int power = 150;
        System.out.println("The number of tokens is: " + tokenScore.bagOfTokensScore(tokens, power));
    }
}