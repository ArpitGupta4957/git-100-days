import java.util.*;

class git_15{
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> hp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hp.put(arr[i], hp.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> countSet = new HashSet<>();
        for(int count : hp.values()){
            if(!countSet.add(count)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}