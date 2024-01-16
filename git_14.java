import java.util.*;

public class git_14 {
    HashMap<Integer, Integer> map;
	List<Integer> list;
	Random random;

    public void RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
        random=new Random();
    }
    
    public boolean insert(int val) {
        
		if(map.containsKey(val)) {
			return false;
		}
		 map.put(val, list.size());
		 list.add(val);
		return true;
    }
    
    public boolean remove(int val) {
        
	    	if(!map.containsKey(val)) {
	    		return false;
	    	}
	    	
	    	int idx=map.get(val);
	    	int lastIdx=list.size()-1;
	    	
	    	if(idx!=lastIdx) {
	    		list.set(idx, list.get(lastIdx));
	    		map.put(list.get(lastIdx), idx);
	    	}
	    	map.remove(val);
	    	list.remove(lastIdx);
			return true;
    }
    
    public int getRandom() {
		return list.get(random.nextInt(list.size()));
    }
}
