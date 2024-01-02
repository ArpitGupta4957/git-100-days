import java.util.*;

class git_1 {
    public static ArrayList<ArrayList<Integer>> findMat(int []num) {
        Map<Integer,Integer> freq = new HashMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i: num) {
            freq.put(i, freq.getOrDefault(i, 0)+1);
            int countFreq = freq.get(i);

            if(countFreq> ans.size()) {
                ans.add(new ArrayList<>());
            }
            ans.get(countFreq -1).add(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] num = {1,3,4,1,2,3,1};
        System.out.println(findMat(num));
    }
}