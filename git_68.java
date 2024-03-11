import java.util.HashMap;
import java.util.Map;

public class git_68 {
    public String customSortString(String order, String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for(char str : s.toCharArray()){
            hm.put(str, hm.getOrDefault(str, 0)+1);
        }
        
        StringBuilder sb = new StringBuilder();
        for(char str : order.toCharArray()){
            while(hm.getOrDefault(str, 0)>0){
                sb.append(str);
                hm.put(str, hm.getOrDefault(str, 0) -1);
            }
        }
        for (char letter : hm.keySet()) {
            int count = hm.get(letter);
            while (count > 0) {
                sb.append(letter);
                count--;
            }
        }

        // Return the result
        return sb.toString();
    }
    public static void main(String[] args) {
        String order = "cba";
        String s = "abcd";
        System.out.println((new git_68()).customSortString(order, s));
    }
}
